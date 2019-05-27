<%@ page contentType="text/html; charset=utf-8" language="java"
         errorPage=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <!--[if (gte IE 9)|!(IE)]><!-->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <!--<![endif]-->
    <!--[if lte IE 8 ]>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <![endif]-->
</head>
<body>
<h3></h3>
<form id="form1" action="<%=request.getContextPath()%>/User/saveUser" method="post" onsubmit="return chkInfo(this);">
    <div class="right_main" align="center" id="div_operate">
        <div class="form_title" style="width: 60%">
            <div class="title_leftbg"></div>
            <div class="title_nr">用户信息</div>
            <div class="title_rightbg"></div>
        </div>
        <div class="right_bg" style="width: 60%">
            <div class="right_main">
                <table width="60%" border="1" align="center" class="table_normal">
                    <tr>
                        <td width="25%" style="text-align: right;">姓名：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <input type="text" id="userName" name="user_name" size="25" value="${User.user_name }"/>
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">性别：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <select id="userSex" name="user_sex" style="width:186px;" >
                                <option value="">请选择</option>
                                <c:if test="${!empty sexList}">
                                    <c:forEach items="${sexList}" var="sexItem">
                                        <option value="${sexItem.value}"
                                                <c:if test="${sexItem.value eq User.user_sex}">selected = "selected"</c:if>>
                                                ${sexItem.text}
                                        </option>
                                    </c:forEach>
                                </c:if>
                            </select>
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">年龄：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <input type="text" id="userAge" name="user_age" size="25" value="${User.user_age }" />
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">邮箱：&nbsp;&nbsp;&nbsp;&nbsp;
                        </td>
                        <td style="text-align: left;">
                            <input type="text" id="userEmail" name="user_email" size="25" value="${User.user_email}" />
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">电话：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <input type="text" id="userTelephone" name="user_telephone"
                                   size="25" value="${User.user_telephone }" />
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">学历：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <select id="userEducation" name="user_education" style="width:186px" >
                                <option value="">请选择</option>
                                <c:if test="${!empty educationList}">
                                    <c:forEach items="${educationList}" var="educationItem">
                                        <option value="${educationItem.value}"
                                                <c:if test="${educationItem.value eq User.user_education}">
                                                    selected = "selected"</c:if>>
                                                ${educationItem.text}
                                        </option>
                                    </c:forEach>
                                </c:if>
                            </select>
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">职称：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <select id="userTitle" name="user_title" style="width:186px" >
                                <option value="">请选择</option>
                                <c:if test="${!empty titleList}">
                                    <c:forEach items="${titleList}" var="titleItem">
                                        <option value="${titleItem.value}"
                                                <c:if test="${titleItem.value eq User.user_title}">selected = "selected"</c:if>>
                                                ${titleItem.text}
                                        </option>
                                    </c:forEach>
                                </c:if>
                            </select>
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td width="25%" style="text-align: right;">所属部门：&nbsp;&nbsp;&nbsp;&nbsp;</td>
                        <td style="text-align: left;">
                            <select id="userDept" name="dept_id" style="width:186px" >
                                <option value="">请选择</option>
                                <c:if test="${!empty deptList}">
                                    <c:forEach items="${deptList}" var="deptItem">
                                        <option value="${deptItem.id}"
                                                <c:if test="${deptItem.id eq User.dept_id}">selected = "selected"</c:if>>
                                                ${deptItem.dept_name}
                                        </option>
                                    </c:forEach>
                                </c:if>
                            </select>
                            <span class="xing">*</span>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="hidden" name="id"
                                    <c:choose>
                                        <c:when test="${User.id !=null}">
                                            value="${User.id}"
                                        </c:when>
                                        <c:otherwise>
                                            value="0"
                                        </c:otherwise>
                                    </c:choose>
                            />
                            <input id="btn1" type="button" value="ajax:getCheckoutPoint" />
                            <input id="btn2" type="button" class="c_botton" value="ajax:saveCheckoutPoint"/>
                            <input id="btn3" type="button" value="post方式：提交多个对象" />
                            <input id="btn4" type="button" value="get方式" />
                            <input id="btn5" type="button" value="post传参，方式一" />
                            <input id="btn6" type="button" value="post传参，方式二" />
                            <input id="btn7" type="button" value="post传参，方式三" />
                            <input id="btn8" type="button" value="post方式提交，map接收" />
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</form>


<script>
    //将一个表单的数据返回成JSON对象
    $.fn.serializeObject = function() {
        var o = {};
        var a = this.serializeArray();
        $.each(a, function() {
            if (o[this.name]) {
                if (!o[this.name].push) {
                    o[this.name] = [ o[this.name] ];
                }
                o[this.name].push(this.value || '');
            } else {
                o[this.name] = this.value || '';
            }
        });
        return o;
    };

    //ajax:通过
    $("#btn1").click(function() {
        var url='<%=request.getContextPath()%>/rest/gameController/getCheckoutPoint';
        alert("url="+url);
        var data={
            "studentid":3,
            "checkpointid":3
        };
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            success:function(data){
                alert(data);
                alert(data['program']);
                alert(data['studentid']);
            },
            error: function(XMLHttpRequest, textStatus, errorThrown){
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
            }
        })
    });



    //ajax:存储代码
    $("#btn2").click(function(){
        var url='<%=request.getContextPath()%>/rest/gameController/saveCheckoutPoint';
        //数据示例：
        var data={
            "studentid":3,
            "checkpointid":3,
            "program":"printf(hello spring)"
        };
        // "toaltime":300,  注：这个字段也可以加上，记录总游戏时间，可以在js里设置个计时器也传输过去
        $.ajax({
            type:'POST',
            contentType : 'application/json;charset=utf-8',
            url:url,
            dataType:"json",
            data:JSON.stringify(data),
            // data:data,
            success:function(data){
                alert("保存成功！");
                alert(data);
            },
            error: function(XMLHttpRequest, textStatus){
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
            }
        })
    })
</script>

</body>
</html>