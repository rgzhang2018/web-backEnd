<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/28
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script src="${pageContext.request.contextPath }/static/lib/assets/js/ObjTree.js"></script>
<script src="${pageContext.request.contextPath }/static/lib/assets/js/jkl-dumper.js"></script>
<script>

    function setSuccessAjax() {
        var url='<%=request.getContextPath()%>/rest/game/saveCheckoutPointAjax';
        var checkpointid = turnLevelToID(GetQueryString("level"));
        var program = getFromHtml();
        //数据示例：
        var data={
            "checkpointid":checkpointid,
            "program":program,
            "issuccess":1
        };
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            success:function(data){
                // alert("保存成功！");
                // alert(data);
            },
            // error: function(XMLHttpRequest, textStatus){
            //     alert(XMLHttpRequest.status);
            //     alert(XMLHttpRequest.readyState);
            //     alert(textStatus);
            // }
        })
    }

    //ajax:获取保存下来的闯关记录
    function getCodeAjax() {
        var checkpointid = turnLevelToID(GetQueryString("level"));
        var url='<%=request.getContextPath()%>/rest/game/getCheckoutPointAjax';
        var data={
            "checkpointid":checkpointid
        };
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            async: false,
            success:function(data){
                if(data['program'] !=null && data['program'] !==''){
                    // alert(data['program']);
                    showInHtml(data['program']); //json转为xml并显示在工作区
                }

            },

        })
    }


    //------------------相关工具


    function getFromHtml(){
        //从工作区获取块的xml
        var xml = Blockly.Xml.workspaceToDom(workspace);
        var xml_text = Blockly.Xml.domToText(xml);
        // //将xml字符串转为json
        // var xotree = new XML.ObjTree();
        // var json_text = xotree.parseXML(xml_text);
        // //将json对象转为格式化的字符串
        // var dumper = new JKL.Dumper();
        // var jsonText = dumper.dump(json_text);//jsonText为工作区内容的json格式的字符串
        return xml_text;
    }


    function showInHtml(jsonText){
        // var xotree = new XML.ObjTree();
        // //将json字符串转为json对象后转为xml字符串
        // var json = eval("(" + jsonText + ")");
        var xml = jsonText;
        //使用jkl-dumper.js中的formatXml方法将xml字符串格式化
        var xmlText = formatXml(xml);
        xmlText = xmlText.substr(43,xmlText.length - 50);
        console.log(xmlText);
        document.getElementById("workspaceBlocks").innerHTML = xmlText;

    }


    //转跳下一关
    function jumpToNextLevel() {
        var next = turnLevelToID(GetQueryString("level"))+1;
        var url = "./getCheckpoint?level="+turnIDToLevel(next);
        window.location.replace(url);
    }

    function xmlToJson(){
        //从工作区获取块的xml
        var xml = Blockly.Xml.workspaceToDom(workspace);
        var xml_text = Blockly.Xml.domToText(xml);
        //将xml字符串转为json
        var xotree = new XML.ObjTree();
        var json_text = xotree.parseXML(xml_text);
        //将json对象转为格式化的字符串
        var dumper = new JKL.Dumper();
        var jsonText = dumper.dump(json_text);//jsonText为工作区内容的json格式的字符串
        return jsonText;
    }

    function JsonToXml(jsonText){
        var xotree = new XML.ObjTree();
        //将json字符串转为json对象后转为xml字符串
        var json = eval("(" + jsonText + ")");
        var xml = xotree.writeXML(json);
        //使用jkl-dumper.js中的formatXml方法将xml字符串格式化
        var xmlText = formatXml(xml);
        xmlText = xmlText.substr(43,xmlText.length - 50);
        console.log(xmlText);
        document.getElementById("workspaceBlocks").innerHTML = xmlText;
    }



    /**
     *   传入get请求的key，返回get请求的value。（用于提取关卡）
     *   eg：http://xxxxx/xxx/xx?name=123
     *   输入："name"
     *   输出："123"
     * @return {string}
     */
    function GetQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null){
            if(unescape(r[2]).length <=5)return unescape(r[2]);
            return  unescape(r[2]).substr(0,unescape(r[2]).length-5);       //带.html的删除末尾的.html
        }

        return "";
    }

    //把关卡的string转为对应id。输入："12-1"，输出1201
    function turnLevelToID(level) {
        var result = level.split("-");
        var x= parseInt(result[0]);
        var y= parseInt(result[1]);
        return x*100+y;
    }

    //把关卡的id转为对应string。输入：1201,输出"12-1"
    function turnIDToLevel(id) {
        var major = Math.floor(id /100);
        var count = id % 100;
        return ""+major+"-"+count;
    }


</script>



