<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/3/10
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>失败</title>
</head>
<body>
<h3 style="color: red"> ${message }</h3>
<h5>将在三秒后返回</h5>
<script>

    setTimeout(function () {
        window.history.back(-1);
    },3000)

</script>
</body>
</html>
