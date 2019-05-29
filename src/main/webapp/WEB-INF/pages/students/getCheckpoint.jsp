<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/28
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js">
<head>
    <%
        if(request.getAttribute("level")!=null){
    %>
            <title>关卡${level}</title>
    <%
        }else {
    %>
    <jsp:forward page="/rest/game/getCheckpoint?level=1-1" />;
    <%
        }
    %>
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
        #canvas-monkey {
            position: absolute;
        }

        #canvas-path {
            position: absolute;
        }
        #canvas-display {
            position: absolute;
            background-color: white;
        }
        #content-left{
            width: 405px;
            height: 90%;
            display: flex;
            flex-direction: column;
            justify-content: space-between;

        }
        #content-right{

            height: 100%;
        }
        #content{
            width: 100%;
            height: 100%;
            display: flex;
            justify-content: space-between;
            flex-wrap:nowrap;
            margin-top: 10px;
        }
    </style>

    <script src="${pageContext.request.contextPath }/static/lib/blockly/blockly_compressed.js"></script>
    <script src="${pageContext.request.contextPath }/static/lib/blockly/blocks_compressed.js"></script>
    <script src="${pageContext.request.contextPath }/static/lib/blockly/javascript_compressed.js"></script>
    <script src="${pageContext.request.contextPath }/static/lib/blockly/msg/js/zh-hans.js"></script>
    <script src="${pageContext.request.contextPath }/static/lib/assets/js/acorn_interpreter.js"></script>
</head>
    <%
        if(request.getAttribute("level")!=null){
    %>
<%--    <%@ include file="/static/"%>--%>
    <jsp:include page="${pageContext.request.contextPath }/static/games/Course${level}.html" flush="true" />
    <%
        }else {
    %>
<title>关卡1-1</title>
    <%
        }
    %>




<%@ include file="checkpointAjax.jsp"%>
<%@ include file="../demo/footer.jsp"%>