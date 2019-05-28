<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="../demo/header.jsp"%>


<body style="background-color: #e9e9e9">
<!-- 导航条 -->
<div id="topbar" style="display: flex;justify-content: space-between;">
    <div id="topbar-left">
        <a href="HomePage.html" class="am-icon-btn am-secondary am-icon-reddit-alien"></a>

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

        <form class="am-form am-form-horizontal" action="#" method="post">
            <div class="am-form-group">
                <br>
            </div>

            <div class="am-form-group" style="text-align:center">
                <h1>管理员登录</h1>
                <hr>
            </div>

            <div class="am-form-group">
                <label for="log-studentname" class="am-u-sm-2 am-form-label">用户名</label>
                <div class="am-u-sm-10">
                    <input id="log-studentnamel" type="text" name="studentname" placeholder="输入你的用户名">
                </div>
            </div>

            <div class="am-form-group">
                <label for="log-password" class="am-u-sm-2 am-form-label">密码</label>
                <div class="am-u-sm-10">
                    <input id="log-password" type="password" name="password"  placeholder="请输入密码">
                </div>
            </div>

            <div class="am-form-group">
                <div class="am-u-sm-offset-2 am-u-sm-10">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" name = "remember"  value="yes"> 记住我
                        </label>
                    </div>
                </div>
            </div>

            <div class="am-form-group">
                <div class="am-u-sm-6 ">
                    <button type="submit" name="login"  class="am-btn am-btn-primary am-fr">提交登入</button>
                </div>
                <div class="am-u-sm-6 ">
                    <a href="visitor_register.html"><button type="button" class="am-btn am-btn-success" >点击注册</button></a>
                </div>
            </div>
            <div class="am-form-group">
                <hr>
                <br>
            </div>
        </form>
    </div>

</div>

<%@ include file="../demo/footer.jsp"%>





