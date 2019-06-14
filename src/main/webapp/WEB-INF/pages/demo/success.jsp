<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"+request.getAttribute("redirectUrl");
%>

<%
    String url = basePath;   //设置跳转的地址
%>
<html>
<head>
    <meta http-equiv=refresh >
</head>
<body>
<div align="center">

    <%
        if(request.getAttribute("message")!=null && request.getAttribute("redirectUrl")!=null){
    %>
    <h2 style=color:red>${message }</h2>
    <h2 style=color:red><span id=jump>3</span> 秒钟后页面将自动转跳...</h2>
    <h2><a href="javascript:void(0);" onclick="jumpToIndex()">点击此处立即跳转</a></h2>
    <%
        }
    %>

</div>
<script>
    function countDown(secs){
        jump.innerText=secs;
        if(--secs>0)
            setTimeout("countDown("+secs+" )",1000);
    }
    countDown(1);
    setTimeout("jumpToIndex()",1000);
    function jumpToIndex(){
        window.location.href='<%=url %>';
    }
</script>
</body>

</html>