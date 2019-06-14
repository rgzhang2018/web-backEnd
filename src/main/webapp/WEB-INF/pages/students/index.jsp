<%--<%@ page language="java" contentType="text/html; charset=UTF-8" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <title>儿童编程网</title>
</head>


<%@ include file="../demo/header.jsp"%>


<!--在这里编写你的代码-->
<div data-am-widget="slider" class="am-slider am-slider-default" data-am-slider='{}' >
    <ul class="am-slides">
        <li>
            <img src="${pageContext.request.contextPath }/static/lib/pictures/homePage/2.jpg">

        </li>
    </ul>
</div>



<div class="get">
    <div class="am-g">
        <div class="am-u-lg-12">
            <h1 class="get-title">提供面向10-18岁青少年的优质编程教育</h1>

            <p>
                设计了有趣的编程课程，让编程就像玩游戏一样简单有趣
                在不知不觉中提高孩子的逻辑能力、想象力和创造力
            </p>

            <p>
                <a href="${pageContext.request.contextPath }/rest//game/checkpoints" class="am-btn am-btn-warning">开始学习√</a>
            </p>
        </div>
    </div>
</div>

<div class="hope">
    <div class="am-g am-container">
        <div class="am-u-lg-4 am-u-md-6 am-u-sm-12">
            <img src="${pageContext.request.contextPath }/static/lib/pictures/homePage/3.jpg" alt="" width="300" height="200">
        </div>
        <div class="am-u-lg-8 am-u-md-6 am-u-sm-12">
            <h2 class="hope-title">让孩子成为一个创造者！</h2>

            <p>
                在编程爆炸的年代，我们不愿成为编程知识的过客，拥抱编程，发挥社区的力量，参与到游戏编程能获得自我提升。
            </p>
        </div>
    </div>
</div>

<div class="about">
    <div class="am-g am-container">
        <div class="am-u-lg-12">
            <h2 class="about-title about-color">我们崇尚开放、自由，非常欢迎大家的参与</h2>

            <div class="am-g">
                <div class="am-u-lg-6 am-u-md-4 am-u-sm-12">
                    <form class="am-form">
                        <label for="name" class="about-color">你的姓名</label>
                        <input id="name" type="text">
                        <br/>
                        <label for="email" class="about-color">你的邮箱</label>
                        <input id="email" type="email">
                        <br/>
                        <label for="message" class="about-color">你的留言</label>
                        <textarea id="message"></textarea>
                        <br/>
                        <button type="submit" class="am-btn am-btn-primary am-btn-sm"><i class="am-icon-check"></i> 提 交</button>
                    </form>
                    <hr class="am-article-divider am-show-sm-only">
                </div>

                <div class="am-u-lg-6 am-u-md-8 am-u-sm-12">
                    <h4 class="about-color">关于我们</h4>

                    <p>(中国科学技术大学)
                        软件学院工程实践项目组</p>
                    <h4 class="about-color">团队介绍</h4>

                    <p>Zhang,Ling,Yu</p>
                </div>
            </div>
        </div>
    </div>
</div>


<%@ include file="../demo/footer.jsp"%>
