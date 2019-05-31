
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/5/28
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../demo/html_head.jsp"%>
<%@ include file="admin_head.jsp"%>



<div class="am-u-sm-10" style="background-color: #ffffff ;height: 700px ;text-align:center">

    <form class="am-form am-form-horizontal" action="${pageContext.request.contextPath }/rest/admin/changeStudentMessage" method="post">
            <br>
        <div class="am-form-group" style="text-align:center">
            <h1>修改学生信息</h1>
            <hr>
        </div>

        <input  type="hidden" value="${studentid}">
        
        <div class="am-form-group">
            <label for="reg-account" class="am-u-sm-2 am-form-label">用户名</label>
            <div class="am-u-sm-10">
                <input type="text" name="studentaccount" id="reg-account" readonly="true" placeholder="用户名" value="${studentlogin.studentaccount}">
            </div>
        </div>

        <div class="am-form-group">
            <label for="reg-pwd1" class="am-u-sm-2 am-form-label">密码</label>
            <div class="am-u-sm-10">
                <input type="text" name="studentpassword" id="reg-pwd1" placeholder="请输入密码" value="${studentlogin.studentpassword}">
            </div>
        </div>
        <div class="am-form-group " style="text-align:center">
            <label id = "reg-msg" style="font-size: 1.4rem"></label>
        </div>
        <div class="am-form-group">
            <label for="reg-name" class="am-u-sm-2 am-form-label">昵称</label>
            <div class="am-u-sm-10">
                <input type="text" name="nickname" id="reg-name" placeholder="昵称" value="${studentlogin.nickname}">
            </div>
        </div>

        <div class="am-form-group " style="text-align:center">
            非必填:
        </div>
        <div class="am-form-group">
            <label for="reg-email" class="am-u-sm-2 am-form-label">邮件</label>
            <div class="am-u-sm-10">
                <input type="email" name="studentemail" id="reg-email" placeholder="电子邮件" value="${student.studentemail}" >
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-studentage" class="am-u-sm-2 am-form-label">年龄</label>
            <div class="am-u-sm-10">
                <input type="number" name="studentage" id="reg-studentage" placeholder="年龄" value="${student.studentage}">
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-studentphone" class="am-u-sm-2 am-form-label">手机号</label>
            <div class="am-u-sm-10">
                <input type="number" name="studentphone" id="reg-studentphone" placeholder="手机号码" value="${student.studentphone}">
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-studentschool" class="am-u-sm-2 am-form-label">学校名</label>
            <div class="am-u-sm-10">
                <input type="text" name="studentschool" id="reg-studentschool" placeholder="学校名" value="${student.studentschool}">
            </div>
        </div>
        <div class="am-form-group">
            <br>
        </div>

        <div class="am-form-group">
            <div class="am-u-sm-8 am-u-sm-centered">
                <button type="submit" name="register" id="reg-submit" class="am-btn am-btn-success am-btn-block" onclick="submit()">点击修改信息</button>
            </div>
        </div>

    </form>

</div>

<script>

    function submit() {
        alert("修改成功！");

    }

</script>


<%@ include file="admin_foot.jsp"%>