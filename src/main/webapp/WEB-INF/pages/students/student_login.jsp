<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="../demo/header.jsp"%>
<style>
    html,body {
        margin: 0;
        padding: 0;
        width: 100%;
        height: 100%;
        background-color:#F0F0F0;
        overflow:scroll;overflow-y:hidden;/* 禁止滚动条 */
    }
    #bg_index{
        background: url(${pageContext.request.contextPath }/static/lib/pictures/homePage/4.jpg) no-repeat;
        background-size: 100% 100%;
        box-sizing: border-box;
        max-width: 100%;
        height: 100%;
        vertical-align: middle;
        border: 0;
    }

</style>



<body style="background-color: #e9e9e9">

<div class="am-u-md-12" id="bg_index" >
    <br>
    <br>
    <br>

<!--  here  -->

<div class="am-u-md-5 am-u-sm-centered"  style="background-color: #FFFFFF ;box-shadow: 10px 10px 5px">
    <br>

    <form class="am-form am-form-horizontal" action="${pageContext.request.contextPath }/rest/loginControl/studentLogin" method="post">
        <div class="am-form-group">
            <br>
        </div>

        <div class="am-form-group" style="text-align:center">
            <h1>登录</h1>
            <hr>
        </div>

        <div class="am-form-group">
            <label for="log-email" class="am-u-sm-2 am-form-label">用户名</label>
            <div class="am-u-sm-10">
                <input id="log-email" type="text" name="studentaccount" placeholder="输入你的用户名，邮箱/手机号">
            </div>
        </div>

        <div class="am-form-group">
            <label for="log-password" class="am-u-sm-2 am-form-label">密码</label>
            <div class="am-u-sm-10">
                <input id="log-password" type="password" name="studentpassword"   placeholder="请输入密码">
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
                <a href="${pageContext.request.contextPath }/rest/loginControl/register"><button type="button" class="am-btn am-btn-success" >点击注册</button></a>
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






