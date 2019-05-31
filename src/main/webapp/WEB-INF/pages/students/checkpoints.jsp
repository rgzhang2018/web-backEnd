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
                Boolean f = (Boolean) request.getSession().getAttribute("loginFlag");
                if(f==null || !f){
            %>
            <a href="${pageContext.request.contextPath }/rest/loginControl/login" class="am-btn am-btn-primary am-topbar-btn am-btn-sm" style="border:2px solid white;border-radius: 5px;margin-top:10px;background-color: #0e90d2;">
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
    </div>
    <div id="image">
        <img src="http://s.amazeui.org/media/i/demos/bing-1.jpg" width="140" height="140" alt="140*140"/>
        <img src="http://s.amazeui.org/media/i/demos/bing-2.jpg" width="140" height="140" alt="140*140"/>
        <img src="http://s.amazeui.org/media/i/demos/bing-3.jpg" width="140" height="140" alt="140*140"/>
        <img src="http://s.amazeui.org/media/i/demos/bing-4.jpg" width="140" height="140" alt="140*140"/>
    </div>
    <div id="buttons">
        <a href="./getCheckpoint?level=2-1" type="button" class="am-btn am-btn-warning">马上试试</a>
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







            ${htmlCheckpoints}

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