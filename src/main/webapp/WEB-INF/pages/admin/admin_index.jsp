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
    <h1> 总览</h1>
    <br>
    <hr>
    <br>
    <div class="am-u-sm-centered am-u-sm-7">
    <table class="am-u-sm-6 am-u-sm-centered am-table am-table-bordered am-table-radius am-table-striped">
        <thead>
        <tr>
            <th>项目名</th>
            <th>统计次数</th>
        </tr>
        </thead>
        <tbody>
            <tr>
                <th>总注册数</th>
                <td>${studentSize}</td>

            </tr>
            <tr>
                <th>本周访问次数</th>
                <td>${loginTimes}</td>
            </tr>
            <tr>
                <th>本周闯关次数</th>
                <td> ${checkoutpointCounts}</td>
            </tr>


        </tbody>

    </table>
    </div>
</div>


<%@ include file="admin_foot.jsp"%>