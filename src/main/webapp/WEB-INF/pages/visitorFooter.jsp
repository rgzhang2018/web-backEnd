<%--
Created by IntelliJ IDEA.
User: SUDO
Date: 2019/1/7
Time: 19:32
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style type="text/css">
    #foot_front{ color : #ffffff; }
    #foot_a{ color : #ffffff; }
    #foot_a:hover{
        color: #19a7f0;
    }
</style>

<footer class="amz-footer" style="background-color:#333131" >


    <div class="am-g am-g-fixed">

        <div class="col-md-4 col-md-push-8 am-u-md-4 am-u-md-push-8 ">
            <ul class="amz-social am-fr">
                <li>
                    <a href="#"><span title="QQ" class="am-icon-qq"></span></a>
                    <a href="#" title="微博" target="_blank"><span class="am-icon-weibo"></span></a>
                    <a href="#"   title="GitHub" class="am-icon-github"></a>
                    <a class="new-issue"
                       href="#"   title="Bug反馈"><span class="am-icon-paper-plane"></span></a></li>
            </ul>
        </div>
        <div class="col-md-8 col-md-pull-4 am-u-md-8 am-u-md-pull-4">
            <h1 >
                <a href="#" target="_blank" id = "foot_front">小天才编程网</a>
            </h1>


            <div class="markdown-body" id = "foot_front">
                <p>MIT License Copyright (c) <span class="CommunityTemplate-highlight js-template-highlight" data-fieldname="year">2018</span> <span class="CommunityTemplate-highlight js-template-highlight" data-fieldname="fullname">xxxxx</span></p>
            </div>

            <p class="amz-cp" id="foot_front">
                Developed with <a href="http://www.jetbrains.com/" target="_blank" id = "foot_a">IntelliJ IDEA</a>.
                <a href="http://amazeui.org" target="_blank" id = "foot_a">Amaze UI</a>.
                <a href="https://codeigniter.org.cn/" target="_blank" id = "foot_a">-------</a>.
            </p>

            <p class="amz-cp" id="foot_front"> --ICP备 --------号</p>
        </div>
    </div>
</footer>

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<!--<![endif]-->
<!--[if lte IE 8 ]>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<![endif]-->
<script src="${pageContext.request.contextPath }/static/lib/assets/js/amazeui.ie8polyfill.min.js"></script>
<script src="${pageContext.request.contextPath }/static/lib/assets/js/amazeui.min.js"></script>
</body>
</html>