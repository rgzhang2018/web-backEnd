<%--<%@ page language="java" contentType="text/html; charset=UTF-8" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%@ include file="visitorHeader.jsp"%>




<script type = text/css>

    .get {
        background: #1E5B94;
        color: #fff;
        text-align: center;
        padding: 100px 0;
    }

    .get-title {
        font-size: 200%;
        border: 2px solid #fff;
        padding: 20px;
        display: inline-block;
    }

    .get-btn {
        background: #fff;
    }

    .detail {
        background: #fff;
    }

    .detail-h2 {
        text-align: center;
        font-size: 150%;
        margin: 40px 0;
    }

    .detail-h3 {
        color: #1f8dd6;
    }

    .detail-p {
        color: #7f8c8d;
    }

    .detail-mb {
        margin-bottom: 30px;
    }

    .hope {
        background: #0bb59b;
        padding: 50px 0;
    }

    .hope-img {
        text-align: center;
    }

    .hope-hr {
        border-color: #149C88;
    }

    .hope-title {
        font-size: 140%;
    }

    .about {
        background: #fff;
        padding: 40px 0;
        color: #7f8c8d;
    }

    .about-color {
        color: #34495e;
    }

    .about-title {
        font-size: 180%;
        padding: 30px 0 50px 0;
        text-align: center;
    }

    .footer p {
        color: #7f8c8d;
        margin: 0;
        padding: 15px 0;
        text-align: center;
        background: #2d3e50;
    }


</script>


<!--在这里编写你的代码-->
<div class="get">
    <div class="am-g">
        <div class="am-u-lg-12">
            <h1 class="get-title">让编码变得简单</h1>

            <p>
                边玩游戏边学编程
            </p>

            <p>
                <a href="http://amazeui.org" class="am-btn am-btn-sm get-btn">了解更多√</a>
            </p>
        </div>
    </div>
</div>

<div class="hope">
    <div class="am-g am-container">
        <div class="am-u-lg-4 am-u-md-6 am-u-sm-12 hope-img">
            <img src="${pageContext.request.contextPath }/static/lib/assets/i/examples/landing.png" alt="" data-am-scrollspy="{animation:'slide-left', repeat: false}">
            <hr class="am-article-divider am-show-sm-only hope-hr">
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

<%@ include file="visitorFooter.jsp"%>
