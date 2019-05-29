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
    function GetQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null)
            return unescape(r[2]);
        return "";
    }

    alert(GetQueryString("level"))

    function setSuccessAjax() {
        var url='<%=request.getContextPath()%>/rest/gameController/saveCheckoutPoint';
        //数据示例：
        var data={
            "studentid":3,
            "checkpointid":3,
            "program":"printf(hello spring)",
            "success":1
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
                alert(data);
            },
            // error: function(XMLHttpRequest, textStatus){
            //     alert(XMLHttpRequest.status);
            //     alert(XMLHttpRequest.readyState);
            //     alert(textStatus);
            // }
        })
    }



</script>
