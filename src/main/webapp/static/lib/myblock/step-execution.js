var stepButton = document.getElementById('stepButton');
var myInterpreter = null;
var outputArea = document.getElementById('output');

function initApi(interpreter, scope) {
    // Add an API function for the alert() block, generated for "text_print" blocks.
    interpreter.setProperty(scope, 'alert',
        interpreter.createNativeFunction(function (text) {
            text = text ? text.toString() : '';
            outputArea.value += '\n' + text;
        }));

    // Add an API function for the prompt() block.
    var wrapper = function (text) {
        text = text ? text.toString() : '';
        return interpreter.createPrimitive(prompt(text));
    };
    interpreter.setProperty(scope, 'prompt',
        interpreter.createNativeFunction(wrapper));

    // Add an API function for highlighting blocks.
    var wrapper = function (id) {
        id = id ? id.toString() : '';
        return interpreter.createPrimitive(highlightBlock(id));
    };
    interpreter.setProperty(scope, 'highlightBlock',
        interpreter.createNativeFunction(wrapper));
}

var highlightPause = false;
var latestCode = '';

function highlightBlock(id) {
    workspace.highlightBlock(id);
    highlightPause = true;
}

function resetStepUi(clearOutput) {
    workspace.highlightBlock(null);
    highlightPause = false;

    if (clearOutput) {
        outputArea.value = 'Program output:\n=================';
    }
}

function generateCodeAndLoadIntoInterpreter() {
    // Generate JavaScript code and parse it.
    Blockly.JavaScript.STATEMENT_PREFIX = 'highlightBlock(%1);\n';
    Blockly.JavaScript.addReservedWords('highlightBlock');
    latestCode = Blockly.JavaScript.workspaceToCode(workspace);
    resetStepUi(true);
}

function stepCode() {
    if (!myInterpreter) {
        // First statement of this code.
        // Clear the program output.
        resetStepUi(true);
        myInterpreter = new Interpreter(latestCode, initApi);

        // And then show generated code in an alert.
        // In a timeout to allow the outputArea.value to reset first.
        setTimeout(function () {
            alert('Ready to execute the following code\n' +
                '===================================\n' + latestCode);
            highlightPause = true;
            stepCode();
        }, 1);
        return;
    }
    highlightPause = false;
    do {
        try {
            var hasMoreCode = myInterpreter.step();
        } finally {
            if (!hasMoreCode) {
                // Program complete, no more code to execute.
                outputArea.value += '\n\n<< Program complete >>';

                myInterpreter = null;
                resetStepUi(false);

                // Cool down, to discourage accidentally restarting the program.
                stepButton.disabled = 'disabled';
                setTimeout(function () {
                    stepButton.disabled = '';
                }, 2000);

                return;
            }
        }
        // Keep executing until a highlight statement is reached,
        // or the code completes or errors.
    } while (hasMoreCode && !highlightPause);
}

// Load the interpreter now, and upon future changes.
generateCodeAndLoadIntoInterpreter();
workspace.addChangeListener(function (event) {
    if (!(event instanceof Blockly.Events.Ui)) {
        // Something changed. Parser needs to be reloaded.
        generateCodeAndLoadIntoInterpreter();
    }
});


var pigmap = document.getElementById('pigdiv');   //地图，用以计算相对位置
var pigimg = document.getElementById('pig');
var count = 0;  //用以对块计数判断

function runCode() {
    // Generate JavaScript code and run it.
    window.LoopTrap = 1000;
    Blockly.JavaScript.INFINITE_LOOP_TRAP =
        'if (--window.LoopTrap == 0) throw "Infinite loop.";\n';
    var code = Blockly.JavaScript.workspaceToCode(workspace);
    Blockly.JavaScript.INFINITE_LOOP_TRAP = null;
    try {
        //code = code;
        alert(code);
        count = code.split(";").length - 1;
        eval(code);
        isRightResult();
    } catch (e) {
        alert(e);
    }
}

function restart() {
    location.reload();
}

//run the code,control the direction and move
var dire = 0;

var move = function () {
    var stepsum = 50;
    if (dire == 0) {
        $('#pig').animate({
            marginLeft: "+=" + stepsum + "px"
        }, 1000);
    } else if (dire == 1) {
        $('#pig').animate({
            marginTop: "-=" + stepsum + "px"
        }, 1000);
    } else if (dire == 2) {
        $('#pig').animate({
            marginLeft: "-=" + stepsum + "px"
        }, 1000);
    }
    //should try is the pig is the right place
    //避开tnt的判断
    if (true) {

    }

    count = count - 1;
}

function turnleft() {
    document.getElementById('pigdiv');
    dire += 1;
    dire %= 4;
    $('#pig').rotate(-90 * dire);
    count = count - 1;
}

function turnright() {
    document.getElementById('pigdiv');
    dire -= 1;
    dire %= 4;
    $('#pig').rotate(90 * dire);
    count = count - 1;
}

//判断是否是正确的结果
function isRightResult() {
    //isRightResult作为检查正确位置的激活
    setInterval(function () {
        if (!$('#pig').is(":animated") && count === 0) {
            var marginleft = pigimg.offsetLeft - pigmap.offsetLeft;
            var margintop = pigimg.offsetTop - pigmap.offsetTop;
            if (marginleft === 250 && margintop === 150) {
                //run success
                $('#success-confirm').modal({
                    relatedTarget: this,
                    onConfirm: function () {
                        jumpToNextLevel();
                    },
                    onCancel: function () {

                    }
                });
            } else {
                //run failed
                //alert(marginleft + "," + margintop);
                $('#failed-confirm').modal({
                    relatedTarget: this,
                    onConfirm: function () {
                        restart();
                    },
                    onCancel: function () {

                    }
                });
            }
            count = count - 1;
        }
    }, 100);
}
