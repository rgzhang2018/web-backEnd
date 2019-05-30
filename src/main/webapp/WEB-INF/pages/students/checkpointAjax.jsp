<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/28
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<script>
    //获取get请求的参数，对应get请求的关卡名
    /**
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

    // alert(GetQueryString("level"))

    function turnLevelToID(level) {
        alert(level);
        var result = level.split("-");
        var x= parseInt(result[0]);
        alert(x);
        var y= parseInt(result[1]);
        alert(y);
        return x*100+y;
    }

    function setSuccessAjax() {
        var checkpointid = turnLevelToID(GetQueryString("level"));
        var url='<%=request.getContextPath()%>/rest/game/saveCheckoutPoint';
        //数据示例：
        var data={
            "checkpointid":checkpointid,
            "program":"printf(hello spring)",
            "issuccess":1
        };
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            // data:data,
            success:function(data){
                alert("保存成功！");
                // alert(data);
            },
            // error: function(XMLHttpRequest, textStatus){
            //     alert(XMLHttpRequest.status);
            //     alert(XMLHttpRequest.readyState);
            //     alert(textStatus);
            // }
        })
    }
</script>


