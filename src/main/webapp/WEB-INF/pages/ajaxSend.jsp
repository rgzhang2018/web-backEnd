<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/24
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1 id="my_url">${pageContext.request.contextPath }</h1>

<script>
    var text = document.getElementById("my_url").innerText;
    alert(text);
    var url='${pageContext.request.contextPath }/rest/gameController/getCheckoutPoint';
    alert("url="+url);
    var data={
        "studentid":1,
        "checkpointid":"asdd",
        "toaltime":300,
        "program":"printf(\"hello spring\")",
        "savetime":"2018-2-28"
    };
    $.ajax({
        type:'POST',
        contentType : 'application/json',
        url:url,
        dataType:"json",
        data:JSON.stringify(data),
        async:false,
        success:function(data){
            alert("新增成功！");
        },
        error: function(XMLHttpRequest, textStatus, errorThrown){
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    })

</script>
</body>
<!--[if (gte IE 9)|!(IE)]><!-->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<![endif]-->
</html>
