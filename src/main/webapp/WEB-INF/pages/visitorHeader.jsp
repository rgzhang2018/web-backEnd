<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <meta name="viewport"
          content="width=device-width, initial-scale=1">
    <title>#</title>

    <!-- Set render engine for 360 browser -->
    <meta name="renderer" content="webkit">

    <!-- No Baidu Siteapp-->
    <meta http-equiv="Cache-Control" content="no-siteapp"/>

    <link rel="icon" type="image/png" href="${pageContext.request.contextPath }/static/lib/assets/i/favicon.png">

    <!-- Add to homescreen for Chrome on Android -->
    <meta name="mobile-web-app-capable" content="yes">
    <link rel="icon" sizes="32x32" href="${pageContext.request.contextPath }/static/lib/assets/i/app-icon72x72@2x.png">

    <!-- Add to homescreen for Safari on iOS -->
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/static/lib/assets/i/app-icon72x72@2x.png">

    <!-- Tile icon for Win8 (144x144 + tile color) -->
    <meta name="msapplication-TileImage" content="${pageContext.request.contextPath }/static/lib/assets/i/app-icon72x72@2x.png">
    <meta name="msapplication-TileColor" content="#0e90d2">

    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/lib/assets/css/amazeui.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/static/lib/assets/css/app.css">
</head>

<body style="background-color: #e9e9e9">

<header class="am-topbar am-topbar-inverse" style = "margin:0px;">
    <h1 class="am-topbar-brand">
        <a href="#">小天才编程网</a>
    </h1>

    <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#doc-topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

    <div class="am-collapse am-topbar-collapse" id="doc-topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav">
            <li class="am-active" ><a href="${pageContext.request.contextPath }/index.do">首页</a></li>
            <li><a href="#">开始游戏</a></li>
            <li><a href="#">监护人中心</a></li>
            <li class="am-dropdown" data-am-dropdown>
                <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
                    更多 <span class="am-icon-caret-down"></span>
                </a>
                <ul class="am-dropdown-content">
                    <li class="am-dropdown-header">123</li>
                    <li><a href="${pageContext.request.contextPath }/login.do">登录</a></li>
                    <li class="am-active"><a href="${pageContext.request.contextPath }/register.do">注册</a></li>
                    <li><a href="#">关于我们</a></li>

                </ul>
            </li>
        </ul>

        <form class="am-topbar-form am-topbar-left am-form-inline" role="search">
            <div class="am-form-group">
                <input type="text" class="am-form-field am-input-sm" placeholder="在这里搜索">
            </div>
        </form>

        <div class="am-topbar-right">
            <div class="am-dropdown" data-am-dropdown="{boundary: '.am-topbar'}">
                <button class="am-btn am-btn-secondary am-topbar-btn am-btn-sm am-dropdown-toggle" data-am-dropdown-toggle>
 <span class="am-icon-caret-down"></span>
                </button>
                <ul class="am-dropdown-content">
                    <li>
                        <a href="#">
                            <i class="am-icon-github am-icon-fw am-u-sm-left "></i>GitHub
                        </a>
                    </li>
                    <li><a href="#">更多</a></li>
                </ul>
            </div>
        </div>

        <div class="am-topbar-right">

            <a href="#">
                <button class="am-btn am-btn-primary am-topbar-btn am-btn-sm"><i class="am-icon-github am-icon-fw am-u-sm-left "></i>GitHub</button>
            </a>
        </div>
    </div>
</header>