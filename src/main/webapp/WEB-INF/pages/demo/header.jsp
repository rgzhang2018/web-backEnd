<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="html_head.jsp"%>
<body>
<header class="am-topbar-inverse">
    <div style="float:left;">
        <!-- <img  src="pictures/homePage/logo.png" style="width: 50px;height: 50px;" class="am-circle am-fl"> -->
        <a href="#" class="am-icon-btn am-secondary am-icon-drupal"></a>
    </div>

    <h1 class="am-topbar-brand logo">
        游戏编程网
    </h1>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

    <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav">
            <li><a href="${pageContext.request.contextPath }/rest//student/index">首页</a></li>
            <li><a href="${pageContext.request.contextPath }/rest//game/checkpoints">开始游戏</a></li>
            <li><a href="#">联系我们</a></li>

        </ul>

        <form class="am-topbar-form am-topbar-left am-form-inline" role="search">
            <div class="am-form-group">
                <input type="text" class="am-form-field am-input-sm" placeholder="搜索">
            </div>
        </form>

        <div class="am-topbar-right">
            <div class="am-dropdown" data-am-dropdown="{boundary: '.am-topbar'}">
                <button class="am-btn am-btn-secondary am-topbar-btn am-btn-sm am-dropdown-toggle" data-am-dropdown-toggle>其他 <span class="am-icon-caret-down"></span></button>
                <ul class="am-dropdown-content">
                    <li><a href="${pageContext.request.contextPath }/rest//loginControl/register">注册</a></li>
                    <li><a href="https://github.com/ustc-group" >关于我们</a></li>
                    <li><a href="https://github.com/ustc-group">GitHub</a></li>
                </ul>
            </div>
        </div>

        <%
            Boolean f = (Boolean) request.getAttribute("loginFlag");
            if(f==null || !f){
        %>
        <div class="am-topbar-right">
            <a href="visitor_login.html" class="am-btn am-btn-primary am-topbar-btn am-btn-sm">登录</a>
        </div>
        <%
            }else{
        %>
        <div class="am-topbar-right">
            <a class="am-btn am-btn-primary am-topbar-btn am-btn-sm">欢迎您，${studentNickname}</a>
        </div>
        <%
            }
        %>



    </div>
</header>

