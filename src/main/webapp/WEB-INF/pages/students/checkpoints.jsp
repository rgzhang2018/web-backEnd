<%@ page import="team.ustc.sse.blockly.util.GameUtil" %><%--
${pageContext.request.contextPath }/static/lib/assets/
  Created by IntelliJ IDEA.
  User: SUDO
  Date: 2019/5/28
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html class="no-js">
<head>
    <title>关卡选择</title>
    <%@ include file="../demo/html_head.jsp"%>
</head>
<style>
    html,body {
        margin: 0;
        padding: 0;
        width: 100%;
        height: 100%;
        background-color:#F0F0F0;

    }
    #topbar{
        background-color: #0e90d2;
    }
    #content{
        width:1000px;
        /*height:100%;*/
        margin: 0 auto;
    }
    #list{
        margin-top: 10px;
    }
    #buttons{
        margin-top: 10px;
    }
</style>


<body>
<!-- 导航条 -->
<header class="am-topbar-inverse">

    <div id="topbar" style="display: flex;justify-content: space-between;">
        <div id="topbar-left">
            <a href="${pageContext.request.contextPath }/rest/student/index" class="am-icon-btn am-secondary am-icon-reddit-alien"></a>
            <a href="#" style="color: white;padding-left:20px;">课程分类</a>
        </div>




        <div id="header-right" class="am-btn-group">
            <%
                Boolean f = (Boolean) request.getAttribute("loginFlag");
                if(f==null || !f){
            %>
            <a href="visitor_login.html" class="am-btn am-btn-primary am-topbar-btn am-btn-sm" style="border:2px solid white;border-radius: 5px;margin-top:10px;background-color: #0e90d2;">
                登录&nbsp;&nbsp;&nbsp;
            </a>
            <%
            }else{
            %>
            <a class="am-btn am-btn-primary am-topbar-btn am-btn-sm">欢迎您，${studentNickname} &nbsp;&nbsp;&nbsp;</a>
            <%
                }
            %>

            <div class="am-dropdown" data-am-dropdown>
                <button data-am-dropdown-toggle
                        class="am-btn am-btn-primary am-topbar-btn am-btn-sm am-dropdown-toggle"
                        style="border: white;margin-top:10px;" >更多
                    <span class="am-icon-bars"></span>
                    <!-- <i class="am-icon-bars"></i> -->
                </button>
                <ul class="am-dropdown-content" style="background-color: #0e90d2;">
                    <li><a href="${pageContext.request.contextPath }/rest/student/index" >回到主页</a></li>
                    <li><a href="${pageContext.request.contextPath }/rest//loginControl/register" >注册新用户</a></li>
                    <li><a href="https://github.com/ustc-group" >关于我们</a></li>
                    <li><a href="https://github.com/ustc-group" >GitHub</a></li>
                </ul>
            </div>

        </div>
    </div>

</header>

<br>
<!--在这里编写你的代码-->
<div id="content">
    <div id="title" style="width: 600px;">
        <h1 style="color:blueviolet">课程 4</h1>
        <small>课程4是为已经通过课程2和课程3的同学们准备的。
            这节课里同学们将学习怎样结合几种概念解决更复杂的问题。
            当这节课结束的时候，同学们将得以真正地编写程序来展现他们所学会的多种技能，
            包括用于循环的函数与带有参数的函数。建议4-8年级同学学习。
        </small>
        <a href="./getCheckpoint?level=12-3">asdasdaaa</a>
    </div>
    <div id="image">
        <img src="http://s.amazeui.org/media/i/demos/bing-1.jpg" width="140" height="140" alt="140*140"/>
        <img src="http://s.amazeui.org/media/i/demos/bing-2.jpg" width="140" height="140" alt="140*140"/>
        <img src="http://s.amazeui.org/media/i/demos/bing-3.jpg" width="140" height="140" alt="140*140"/>
        <img src="http://s.amazeui.org/media/i/demos/bing-4.jpg" width="140" height="140" alt="140*140"/>
    </div>
    <div id="buttons">
        <a href="Course2-1.html" type="button" class="am-btn am-btn-warning">马上试试</a>
    </div>
    <div id="list">
        <table class="am-table am-table-bordered am-table-striped">
            <thead>
            <tr>
                <th>课程名称</th>
                <th>进度</th>
            </tr>
            </thead>
            <tbody>

            <%

//            for(int i=1;i< GameUtil.MAX_LEVEL;i++){
//                out.print("");
//            }
            %>




<%--            <c:forEach var="i" begin="1" end="5">--%>

<%--&lt;%&ndash;                ${levelName[i]}&ndash;%&gt;--%>
<%--&lt;%&ndash;                ${levels[i]}&ndash;%&gt;--%>
<%--                <tr>--%>
<%--                    <td>${levels[i]}</td>--%>
<%--                    <td>${levelName[i]}</td>--%>
<%--                    <td>${levelName[i]}</td>--%>
<%--&lt;%&ndash;                    <td>${studentLogin.studentpassword}</td>&ndash;%&gt;--%>
<%--                    <td>--%>
<%--                        <div class="am-u-sm-6">--%>
<%--                            <button class="am-btn am-btn-default am-btn-block">查看闯关</button>--%>
<%--                        </div>--%>
<%--                        <div class="am-u-sm-6">--%>
<%--                            <button class="am-btn am-btn-default am-btn-block">修改信息</button>--%>
<%--                        </div>--%>
<%--                    </td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>













            <tr>
                <td>1.离线：七巧板</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>2.迷宫与蜜蜂</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-1.html" id="2-1" type="button" class="am-btn am-btn-success am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-2.html" id="2-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-3.html" id="2-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-4.html" id="2-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-5.html"  id="2-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-6.html"  id="2-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-7.html"  id="2-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-8.html"  id="2-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=2-9.html"  id="2-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>3.小艺术家</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=3-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>4.离线：封装变量</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>5.离线：疯狂填词</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>6.小艺术家：变量</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-1.html" id="6-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-2.html" id="6-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-3.html" id="6-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-4.html" id="6-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-5.html" id="6-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-6.html" id="6-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-7.html" id="6-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-8.html" id="6-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=6-9.html" id="6-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>7.游戏实验室：变量</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-1.html" id="7-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-2.html" id="7-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-3.html" id="7-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-4.html" id="7-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-5.html" id="7-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-6.html" id="7-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-7.html" id="7-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-8.html" id="7-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=7-9.html" id="7-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>8.离线：计数循环的乐趣</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>9.蜜蜂：计数循环</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-1"  id="9-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-2"  id="9-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-3"  id="9-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-4"  id="9-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-5"  id="9-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-6"  id="9-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-7"  id="9-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-8"  id="9-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=9-9"  id="9-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>10.小艺术家：计数循环</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-1" id="10-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-2" id="10-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-3" id="10-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-4" id="10-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-5" id="10-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-6" id="10-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-7" id="10-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-8" id="10-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=10-9" id="10-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>11.游戏实验室：计数循环</td>
                <td>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-1" id="11-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-2" id="11-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-3" id="11-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-4" id="11-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-5" id="11-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-6" id="11-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-7" id="11-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-8" id="11-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="${pageContext.request.contextPath }/rest/game/getCheckpoint?level=11-9" id="11-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>12.小艺术家：函数</td>
                <td>
                    <a href="/rest/game/getCheckpoint?level=12-1.html" id="12-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="/rest/game/getCheckpoint?level=12-2.html" id="12-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="/rest/game/getCheckpoint?level=12-3.html" id="12-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="/rest/game/getCheckpoint?level=12-4.html" id="12-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="/rest/game/getCheckpoint?level=12-5.html" id="12-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="/rest/game/getCheckpoint?level=12-6.html" id="12-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="/rest/game/getCheckpoint?level=12-7.html" id="12-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="/rest/game/getCheckpoint?level=12-8.html" id="12-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="/rest/game/getCheckpoint?level=12-9.html" id="12-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>13.离线：用参数写歌</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>14.小艺术家：有参数的函数</td>
                <td>
                    <a href="/rest/game/getCheckpoint?level=14-1.html" id="14-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="/rest/game/getCheckpoint?level=14-2.html" id="14-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="/rest/game/getCheckpoint?level=14-3.html" id="14-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="/rest/game/getCheckpoint?level=14-4.html" id="14-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="/rest/game/getCheckpoint?level=14-5.html" id="14-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="/rest/game/getCheckpoint?level=14-6.html" id="14-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="/rest/game/getCheckpoint?level=14-7.html" id="14-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="/rest/game/getCheckpoint?level=14-8.html" id="14-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="/rest/game/getCheckpoint?level=14-9.html" id="14-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>15.游戏实验室：有参数的函数</td>
                <td>
                    <a href="/rest/game/getCheckpoint?level=15-1.html" id="15-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="/rest/game/getCheckpoint?level=15-2.html" id="15-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="/rest/game/getCheckpoint?level=15-3.html" id="15-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="/rest/game/getCheckpoint?level=15-4.html" id="15-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="/rest/game/getCheckpoint?level=15-5.html" id="15-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="/rest/game/getCheckpoint?level=15-6.html" id="15-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="/rest/game/getCheckpoint?level=15-7.html" id="15-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="/rest/game/getCheckpoint?level=15-8.html" id="15-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="/rest/game/getCheckpoint?level=15-9.html" id="15-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>16.蜜蜂：有参数的函数</td>
                <td>
                    <a href="/rest/game/getCheckpoint?level=16-1.html" id="16-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="/rest/game/getCheckpoint?level=16-2.html" id="16-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="/rest/game/getCheckpoint?level=16-3.html" id="16-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="/rest/game/getCheckpoint?level=16-4.html" id="16-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="/rest/game/getCheckpoint?level=16-5.html" id="16-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="/rest/game/getCheckpoint?level=16-6.html" id="16-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="/rest/game/getCheckpoint?level=16-7.html" id="16-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="/rest/game/getCheckpoint?level=16-8.html" id="16-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="/rest/game/getCheckpoint?level=16-9.html" id="16-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>17.离线：二进制</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>18.小艺术家：二进制</td>
                <td>
                    <a href="/rest/game/getCheckpoint?level=18-1.html" id="18-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="/rest/game/getCheckpoint?level=18-2.html" id="18-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="/rest/game/getCheckpoint?level=18-3.html" id="18-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="/rest/game/getCheckpoint?level=18-4.html" id="18-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="/rest/game/getCheckpoint?level=18-5.html" id="18-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="/rest/game/getCheckpoint?level=18-6.html" id="18-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="/rest/game/getCheckpoint?level=18-7.html" id="18-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="/rest/game/getCheckpoint?level=18-8.html" id="18-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="/rest/game/getCheckpoint?level=18-9.html" id="18-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>19.超级挑战:变量</td>
                <td>
                    <a href="/rest/game/getCheckpoint?level=19-1.html" id="19-1" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="/rest/game/getCheckpoint?level=19-2.html" id="19-2" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="/rest/game/getCheckpoint?level=19-3.html" id="19-3" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="/rest/game/getCheckpoint?level=19-4.html" id="19-4" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="/rest/game/getCheckpoint?level=19-5.html" id="19-5" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="/rest/game/getCheckpoint?level=19-6.html" id="19-6" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="/rest/game/getCheckpoint?level=19-7.html" id="19-7" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="/rest/game/getCheckpoint?level=19-8.html" id="19-8" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="/rest/game/getCheckpoint?level=19-9.html" id="19-9" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>

            </tbody>
        </table>
    </div>
</div>


<script>

    //ajax：获取到闯关结果信息，修改对应关卡颜色
    function getSuccessMessage() {
        var url='<%=request.getContextPath()%>/rest/game/checkpointsAjax';
        // alert("url="+url);
        var data={
        };
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            success:function(successList){ //data就是返回的数据，data['program']就是闯关信息
                // alert(successList);
                if(successList !=null)setSuccess(successList);
            },
            // error: function(XMLHttpRequest, textStatus, errorThrown){
            //     alert(XMLHttpRequest.status);
            //     alert(XMLHttpRequest.readyState);
            //     alert(textStatus);
            // }
        })
    }

    function setSuccess(successList) {
        for( var i=0;i<successList.length ;i++){
            // alert(successList[i]);
            var elementID = successList[i];
            var e = document.getElementById(elementID);
            // var classVal = e.getAttribute("class");
            // classVal.replace("am-btn-default","");
            // classVal.concat(" am-btn-success");
            // e.setAttribute("class",classVal);
            e.classList.remove("am-btn-default");
            e.classList.add("am-btn-success");

        }
    }

    getSuccessMessage();
</script>

<%@ include file="../demo/footer.jsp"%>