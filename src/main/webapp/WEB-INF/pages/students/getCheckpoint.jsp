<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/28
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getAttribute("level")==null){
%>
<jsp:forward page="/rest/game/getCheckpoint?level=1-1" />;
<%
    }
%>
<!doctype html>
<html class="no-js">
<head>
    <title>关卡${level}</title>
    <%@ include file="../demo/html_head.jsp"%>
    <!--[if (gte IE 9)|!(IE)]><!-->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <!--<![endif]-->
    <!--[if lte IE 8 ]>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <![endif]-->
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
    <script src="${pageContext.request.contextPath }/static/lib/assets/js/wait_block.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/static/lib/myblock/workspace.js"></script>

</head>



<div id="topbar" style="display: flex;justify-content: space-between;">
    <div id="topbar-left">
        <a href="#" class="am-icon-btn am-secondary am-icon-reddit-alien"></a>
    </div>

    <div id="topbarr-center" style="display: inline-flex">
        <div style="padding-top:15px;margin-right: 10px;">
            <a href="${pageContext.request.contextPath }/rest/game/checkpoints" style="color:white">${levelName}</a>
        </div>
        <div id="pagination" style="border:2px solid white;border-radius: 5px;padding:2px 0;margin:5px 0;background-color: #0e90d2;">

            <c:forEach var="i" begin="1" end="${countNum}" step="1">
                <c:choose>
                    <c:when test="${count == i}">
                        <a href="./getCheckpoint?level=${major}-${i}" type="button" class="am-btn am-btn-primary am-round am-active">${i}</a>
                    </c:when>

                    <c:otherwise>
                        <a href="./getCheckpoint?level=${major}-${i}" type="button" class="am-btn am-btn-primary am-round">${i}</a>

                    </c:otherwise>
                </c:choose>
            </c:forEach>

            <a href="${pageContext.request.contextPath }/rest/game/checkpoints" type="button" class="am-btn am-btn-primary">更多
                <i class="am-icon-chevron-circle-down"></i>
            </a>
        </div>

    </div>

    <div id="header-right" class="am-btn-group">
        <button class="am-btn am-btn-primary am-topbar-btn am-btn-sm" style="border:2px solid white;border-radius: 5px;margin-top:10px;background-color: #0e90d2;"
        >登录</button>
        <div class="am-dropdown" data-am-dropdown>
            <button data-am-dropdown-toggle
                    class="am-btn am-btn-primary am-topbar-btn am-btn-sm am-dropdown-toggle"
                    style="border: white;margin-top:10px;" >
                <span class="am-icon-bars"></span>
                <!-- <i class="am-icon-bars"></i> -->
            </button>
            <ul class="am-dropdown-content" style="background-color: #0e90d2;">
                <li><a href="${pageContext.request.contextPath }/rest/game/checkpoints" >课程分类</a></li>
                <li><a href="#" >关于我们</a></li>
            </ul>
        </div>

    </div>
</div>















<jsp:include page="${pageContext.request.contextPath }/static/games/Course${level}.html" flush="true" />








<%@ include file="checkpointAjax.jsp"%>
<%@ include file="../demo/footer.jsp"%>