<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="html_head.jsp"%>


<body style="background-color: #464c5c">

    <div class="am-u-md-2" style="background-color:#464c5c">
        <br>
        <br>
        <h1 class="am-topbar-brand" >
            <a href="#" style="color: #FFFFFF">监护控制</a>

        </h1>


        <ul class="am-nav ">
            <li><br><br></li>


            <li ><a href="#">中心首页</a></li>
            <li><a href="#">监管总览</a></li>
            <li><a href="#">添加子账户</a></li>
            <li><a href="#">关联子账户</a></li>
            <li><a href="#">维护信息</a></li>
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
        <div class="am-u-sm-12" style="background-color: #ffffff ;height: 700px ;text-align:center">

            <br>
            <br>
            <h1 class="am-u-sm-centered"> 欢迎您来到监护人系统</h1>
            <br>
            <h3>您可以在这里关联儿童账号、添加子账户，并且获得儿童当前学习情况</h3>
        
        
        </div>
        
<footer class="amz-footer" style="background-color:#ffffff ; " >
    <br>
    <div class="am-g am-g-fixed">
            <div class="markdown-body am-u-md-offset-4 am-u-md-4" >
                <h4>XXX Copyright (c) <span class="CommunityTemplate-highlight js-template-highlight" data-fieldname="year">2018</span>
                    <a href="#"><span class="CommunityTemplate-highlight js-template-highlight" data-fieldname="fullname"></span></a></h4>
            </div>

    </div>
</footer>


<!--[if (gte IE 9)|!(IE)]><!-->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<![endif]-->
        <script src="${pageContext.request.contextPath }/lib/assets/js/amazeui.ie8polyfill.min.js"></script>

        <script src="${pageContext.request.contextPath }/lib/assets/js/amazeui.min.js"></script>


<!---->
</div>


</body>
</html>

