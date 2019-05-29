<%--
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
            <tr>
                <td>1.离线：七巧板</td>
                <td>
                    <button type="button" class="am-btn am-btn-default am-round">线下的活动</button>
                </td>
            </tr>
            <tr>
                <td>2.迷宫与蜜蜂</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-success am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>3.小艺术家</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
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
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>7.游戏实验室：变量</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
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
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>10.小艺术家：计数循环</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>11.游戏实验室：计数循环</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>12.小艺术家：函数</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
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
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>15.游戏实验室：有参数的函数</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>16.蜜蜂：有参数的函数</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
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
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>
            <tr>
                <td>19.超级挑战:变量</td>
                <td>
                    <a href="Course2-1.html" type="button" class="am-btn am-btn-default am-round">1</a>
                    <a href="Course2-2.html" type="button" class="am-btn am-btn-default am-round">2</a>
                    <a href="Course2-3.html" type="button" class="am-btn am-btn-default am-round">3</a>
                    <a href="Course2-4.html" type="button" class="am-btn am-btn-default am-round">4</a>
                    <a href="Course2-5.html" type="button" class="am-btn am-btn-default am-round">5</a>
                    <a href="Course2-6.html" type="button" class="am-btn am-btn-default am-round">6</a>
                    <a href="Course2-7.html" type="button" class="am-btn am-btn-default am-round">7</a>
                    <a href="Course2-8.html" type="button" class="am-btn am-btn-default am-round">8</a>
                    <a href="Course2-9.html" type="button" class="am-btn am-btn-default am-round">9</a>
                </td>
            </tr>

            </tbody>
        </table>
    </div>
</div>


<%@ include file="../demo/footer.jsp"%>