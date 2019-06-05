<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="../demo/html_head.jsp"%>


<!--定义多层canvas的css信息-->
<style>
    html,body {
        margin: 0;
        padding: 0;
        width: 100%;
        height: 100%;
        background-color:#F0F0F0;
        overflow:scroll;overflow-y:hidden;/* 禁止滚动条 */
    }
    #topbar{
        background-color: #0e90d2;
    }
    #bg_index{
        background: url(..//static/lib/assets/myImg/newLogin.jpg);
        box-sizing: border-box;
        max-width: 100%;
        height: 700px;
        vertical-align: middle;
        border: 0;
    }
</style>
<body style="background-color: #e9e9e9">
<!-- 导航条 -->
<div id="topbar" style="display: flex;justify-content: space-between;">
    <div id="topbar-left">
        <a href="${pageContext.request.contextPath }/rest//student/index" class="am-icon-btn am-secondary am-icon-reddit-alien"></a>

    </div>
    <div id="header-right" class="am-btn-group">



    </div>
</div>
<div class="am-u-md-12" id="bg_index" >
    <br>
    <br>
    <br>

    <!--  here  -->

    <div class="am-u-md-5 am-u-sm-centered"  style="background-color: #FFFFFF ;box-shadow: 10px 10px 5px">
        <br>

        <form class="am-form am-form-horizontal" action="${pageContext.request.contextPath }/rest/admin/loginControl" method="post">
            <div class="am-form-group">
                <br>
            </div>

            <div class="am-form-group" style="text-align:center">
                <h1>管理员登录</h1>
                <hr>
            </div>

            <div class="am-form-group">
                <label for="log-studentnamel" class="am-u-sm-2 am-form-label">用户名</label>
                <div class="am-u-sm-10">
                    <input id="log-studentnamel" type="text" name="adminaccount" placeholder="输入你的用户名">
                </div>
            </div>

            <div class="am-form-group">
                <label for="log-password" class="am-u-sm-2 am-form-label">密码</label>
                <div class="am-u-sm-10">
                    <input id="log-password" type="password" name="adminpassword"  placeholder="请输入密码">
                </div>
            </div>


            <div class="am-form-group">
                <div class="am-u-sm-6 ">
                    <button type="submit" name="login"  class="am-btn am-btn-primary am-fr">提交登入</button>
                </div>
            </div>
            <div class="am-form-group">
                <hr>
                <br>
            </div>
        </form>
    </div>

</div>
</body>
</html>

<%@ include file="../demo/footer.jsp"%>





