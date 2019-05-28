<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/27
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Boolean f = (Boolean) request.getAttribute("isAdmin");
    if(f==null || !f){
%>
        <jsp:forward page="wrong.jsp" />;
<%
    }
%>

<body style="background-color: #464c5c">

<div class="am-u-md-2" style="background-color:#464c5c">
    <br>
    <br>
    <h1 class="am-topbar-brand" >
        <a href="#" style="color: #FFFFFF">管理员中心</a>
    </h1>


    <ul class="am-nav ">
        <li><br><br></li>


        <li ><a href="${pageContext.request.contextPath }/rest/admin/index">中心首页</a></li>
        <li><a href="${pageContext.request.contextPath }/rest/admin/getStudents">用户总览</a></li>
        <li><a href="${pageContext.request.contextPath }/rest/admin/recentLoginMessage">访问统计</a></li>
        <li><a href="#">闯关情况</a></li>
        <li><a href="${pageContext.request.contextPath }/rest/admin/changeAdminPassword">修改密码</a></li>
    </ul>

</div>

<div class="am-u-md-10" style="background-color: #dddddd">
    <br>

    <header class="am-topbar ">
        <h1 class="am-topbar-brand">
            <a href="#">小天才编程网</a>
        </h1>

        <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

        <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
            <ul class="am-nav am-nav-pills am-topbar-nav">
            </ul>

            <form class="am-topbar-form am-topbar-left am-form-inline" role="search">
                <div class="am-form-group">
                    <input type="text" class="am-form-field am-input-sm" placeholder="输入搜索内容">
                </div>
            </form>

            <div class="am-topbar-right">
                <p class="am-topbar-brand">您好!xxxx</p>


                <a href="${pageContext.request.contextPath }/index.do">
                    <button class="am-btn am-btn-primary am-topbar-btn am-btn-sm">回到首页</button>
                </a>


                <a href='${pageContext.request.contextPath }/login.do'>
                    <button class="am-btn am-btn-primary am-topbar-btn am-btn-sm">点击注销</button>
                </a>
            </div>
        </div>
    </header>
