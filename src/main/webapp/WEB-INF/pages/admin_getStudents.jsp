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
<%@ include file="html_head.jsp"%>
<%@ include file="admin_head.jsp"%>



<div class="am-u-sm-10" style="background-color: #ffffff ;height: 700px ;text-align:center">
            <br>
            <h1>  用户信息管理</h1>
            <br>

            <table class="am-u-sm-offset-1 am-table am-table-bordered am-table-radius am-table-striped">
                <thead>
                <tr>
                    <th>用户id</th>
                    <th>用户名</th>
                    <th>昵称</th>
                    <th>密码</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="studentLogin" items="${studentLoginList}">
                    <tr>
                        <td>${studentLogin.studentid}</td>
                        <td>${studentLogin.studentaccount}</td>
                        <td>${studentLogin.nickname}</td>
                        <td>${studentLogin.studentpassword}</td>
                        <td>
                            <div class="am-u-sm-6">
                                <button class="am-btn am-btn-default am-btn-block">查看闯关</button>
                            </div>
                            <div class="am-u-sm-6">
                                <button class="am-btn am-btn-default am-btn-block">修改信息</button>
                            </div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>

            </table>
        
</div>


<%@ include file="admin_foot.jsp"%>