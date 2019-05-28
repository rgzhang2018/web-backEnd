<%--<jsp:useBean id="studentLoginMessage" scope="request" type="team.ustc.sse.blockly.entity.Studentloginmessage"/>--%>
<%@ page import="java.util.List" %>
<%@ page import="team.ustc.sse.blockly.entity.Studentloginmessage" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../demo/html_head.jsp"%>
<%@ include file="admin_head.jsp"%>



<div class="am-u-sm-10" style="background-color: #ffffff ;height: 700px ;text-align:center">


        <br>
        <br>
        <div class="am-u-sm-centered  am-u-md-7">
            <h1 > 密码修改</h1>

            <form class="am-form am-form-horizontal" action="${pageContext.request.contextPath }/rest/admin/changeAdminPassword" method="post">
                <div class="am-form-group">
                    <br>
                </div>

                <div class="am-form-group" style="text-align:center">

                </div>

                <div class="am-form-group">
                    <label for="log-password" class="am-u-sm-3 am-form-label">原始密码</label>
                    <div class="am-u-sm-9">
                        <input id="log-password" type="password" name="oldPassword"  placeholder="请输入原始密码">
                    </div>
                </div>

                <div class="am-form-group">
                    <label for="pwd1" class="am-u-sm-3 am-form-label">新密码</label>
                    <div class="am-u-sm-9">
                        <input id="pwd1" type="password" name="newPassword"  placeholder="请输入新的密码" >
                    </div>
                </div>

                <div class="am-form-group">
                    <label for="pwd2" class="am-u-sm-3 am-form-label">重复确认</label>
                    <div class="am-u-sm-9">
                        <input id="pwd2" type="password" name="newPassword2"  placeholder="重复确认" onblur="validate1()">
                    </div>
                </div>

                <div class="am-form-group " style="text-align:center">
                    <label id = "change-message" style="font-size: 1.4rem"></label>
                </div>
                <br>
                <br>
                <div class="am-form-group am-u-md-8 am-u-sm-centered" >
                    <button type="submit" id="password-submit" name="changePassword" class="am-btn am-btn-success am-btn-block" >点击修改密码</button>
                </div>
                <div  class="am-form-group" >

                    <br>
                    <hr>
                    <br>
                </div>
            </form>

        </div>
        
</div>

<script>


    var flag_password = 0;
    function validate1() {
        var pwd1 = document.getElementById("pwd1").value;
        var pwd2 = document.getElementById("pwd2").value;
        <!-- 对比两次输入的密码 -->
        if(pwd1 === pwd2 && pwd1.length>=6 ) {
            document.getElementById("change-message").innerHTML="<font color='green'>两次密码相同，OK!</font>";
            flag_password = 1;
        }
        else if(pwd1.length<=6)
        {
            document.getElementById("change-message").innerHTML="<font color='red'>密码长度不能小于6</font>";
            flag_password = 0;
        }else {
            document.getElementById("change-message").innerHTML="<font color='red'>两次密码不相同</font>";
            flag_password = 0;
        }
    }

    //检测所有信息，符合条件后可以注册
    var submitBtn = document.getElementById("password-submit");
    submitBtn.onclick = function checkPass( e ){
        if(flag_password === 0){
            alert("两次密码不一致/密码格式错误：密码长度必须大于等于6");
            if(e&&e.preventDefault){
                e.preventDefault();
            }else{
                window.event.returnValue = false;
            }
        }

    }



</script>



<%@ include file="admin_foot.jsp"%>