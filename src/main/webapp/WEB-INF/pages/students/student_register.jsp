<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>学生注册</title>
</head>
<%@ include file="../demo/header.jsp"%>
<style type="text/css">

    #bg_index{
        background: url(${pageContext.request.contextPath }/static/lib/pictures/newResigner.jpg);
        background-size: 100% 100%;
        box-sizing: border-box;
        max-width: 100%;
        height: 100%;
        vertical-align: middle;
        border: 0;
    }

</style>




<div class="am-u-md-12" id="bg_index" >

    <br>
    <!--  here  -->

    <div class="am-u-md-5 am-u-sm-centered"  style="background-color: #FFFFFF ;box-shadow: 10px 10px 5px">
        <hr>
        <br>
    <form class="am-form am-form-horizontal" action="${pageContext.request.contextPath }/rest/loginControl/studentRegister" method="post">


        <div class="am-form-group" style="text-align:center">
            <h1>注册</h1>
            <hr>
        </div>

        <div class="am-form-group">
            <label for="reg-account" class="am-u-sm-2 am-form-label">用户名</label>
            <div class="am-u-sm-10">
                <input type="text" name="studentaccount" id="reg-account" placeholder="可以是邮箱/手机号等" onblur="accountCheck()">
            </div>
        </div>

        <div class="am-form-group">
            <label for="reg-pwd1" class="am-u-sm-2 am-form-label">密码</label>
            <div class="am-u-sm-10">
                <input type="password" name="studentpassword" id="reg-pwd1" placeholder="请输入密码">
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-pwd2" class="am-u-sm-2 am-form-label" >确认</label>
            <div class="am-u-sm-10">
                <input type="password" name="studentPassword2" id="reg-pwd2" placeholder="请再次输入密码" onblur="validate()">
            </div>
        </div>

        <div class="am-form-group">
            <label for="reg-name" class="am-u-sm-2 am-form-label">昵称</label>
            <div class="am-u-sm-10">
                <input type="text" name="nickname" id="reg-name" placeholder="起个昵称吧" onblur="nameChick()">
            </div>
        </div>
        <div class="am-u-sm-centered " style="text-align:center">
            <label id = "reg-msg" style="font-size: 1.4rem"></label>
        </div>

        <div class="am-u-sm-10 am-u-sm-offset-2">
            非必填:
        </div>
        <div class="am-form-group">
            <label for="reg-email" class="am-u-sm-2 am-form-label">邮件</label>
            <div class="am-u-sm-10">
                <input type="email" name="studentemail" id="reg-email" placeholder="输入你的电子邮件" >
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-studentage" class="am-u-sm-2 am-form-label">年龄</label>
            <div class="am-u-sm-10">
                <input type="number" name="studentage" id="reg-studentage" placeholder="输入你的年龄" >
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-studentphone" class="am-u-sm-2 am-form-label">手机号</label>
            <div class="am-u-sm-10">
                <input type="number" name="studentphone" id="reg-studentphone" placeholder="输入你的手机号码" >
            </div>
        </div>
        <div class="am-form-group">
            <label for="reg-studentschool" class="am-u-sm-2 am-form-label">学校名</label>
            <div class="am-u-sm-10">
                <input type="text" name="studentschool" id="reg-studentschool" placeholder="输入你的学校名" >
            </div>
        </div>
        <div class="am-form-group">
            <br>
        </div>

        <div class="am-form-group">
            <div class="am-u-sm-8 am-u-sm-centered">
                <button type="submit" name="register" id="reg-submit" class="am-btn am-btn-success am-btn-block" onclick="checkAll()">点击注册</button>
            </div>
        </div>
        <div class="am-form-group">
            <hr>
            <br>
        </div>
    </form>
</div>


</div>



<script>
    var flag_account = 0;
    var flag_password = 0;
    var flag_name = 0;
    function validate() {
        var pwd1 = document.getElementById("reg-pwd1").value;
        var pwd2 = document.getElementById("reg-pwd2").value;
        //对比两次输入的密码
        if(pwd1 === pwd2 && pwd1.length>=6 ) {
            document.getElementById("reg-msg").innerHTML="<font color='green'>两次密码相同，OK!</font>";
            flag_password = 1;
        }
        else if(pwd1.length<=6)
        {
            document.getElementById("reg-msg").innerHTML="<font color='red'>密码长度不能小于6</font>";
            flag_password = 0;
        }else {
            document.getElementById("reg-msg").innerHTML="<font color='red'>两次密码不相同</font>";
            flag_password = 0;
        }
    }

    function nameChick(){
        var name = document.getElementById("reg-name").value;
        if(name ==="" || name ==="null"){
            document.getElementById("reg-msg").innerHTML="<font color='red'>昵称不能为空</font>";
            flag_name = 0;
        }else {
            document.getElementById("reg-msg").innerHTML="<font color='green'>昵称格式正确</font>";
            flag_name = 1;
        }
    }

    //检测所有信息，符合条件后可以注册
    var submitBtn = document.getElementById("reg-submit");
    submitBtn.onclick = function checkAll( e ){
        if(flag_password===1 && flag_account === 1 &&flag_name===1){
            alert("格式正确，转跳注册");
        }else if(flag_account === 0){
            alert("用户名已存在！请重新输入");
            if(e&&e.preventDefault){
                e.preventDefault();
            }else{                                      //IE标签
                window.event.returnValue = false;
            }
        }else if(flag_password === 0){
            alert("两次密码不一致/密码格式错误：密码长度必须大于等于6");
            if(e&&e.preventDefault){
                e.preventDefault();
            }else{
                window.event.returnValue = false;
            }
        }else if(flag_name === 0){
            alert("昵称不能为空");
            if(e&&e.preventDefault){
                e.preventDefault();
            }else{
                window.event.returnValue = false;
            }
        }

    };


    function accountCheck(){
        var account = document.getElementById("reg-account").value;//获取文本框内容
        var url='<%=request.getContextPath()%>/rest/loginControl/checkStudentAccountAjax';
        var data={
            "studentaccount":account
        };
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            success:function(data){ //data就是返回的数据，data['program']就是闯关信息
                if(data  == '1') {
                    document.getElementById('reg-msg').innerHTML = "用户名可以使用";
                    flag_account=1;
                }else {
                    document.getElementById('reg-msg').innerHTML = "用户名已存在";
                    flag_account=0;
                }
            },
            // error: function(XMLHttpRequest, textStatus, errorThrown){
            //     alert("服务器内部错误");
            //     alert(XMLHttpRequest.status);
            //     alert(XMLHttpRequest.readyState);
            //     alert(textStatus);
            // }
        })
    }


</script>

<%@ include file="../demo/footer.jsp"%>