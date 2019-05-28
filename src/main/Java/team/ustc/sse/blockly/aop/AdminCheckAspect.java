package team.ustc.sse.blockly.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import team.ustc.sse.blockly.util.SessionUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-28
 **/
@Aspect    //该标签把LoginAspect类声明为一个切面
@Order(1)  //设置切面的优先级：如果有多个切面，可通过设置优先级控制切面的执行顺序（数值越小，优先级越高）
@Component //该标签把LoginAspect类放到IOC容器中
public class AdminCheckAspect {

    @Pointcut("(execution(public * team.ustc.sse.blockly.controller.AdminController.admin*(..)))")
    public void declearJoinPointExpression() {
    }


    @Before("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        HttpServletRequest request;
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof HttpServletRequest) {
                request = (HttpServletRequest) args[i];
                if (SessionUtil.checkAdminLogin(request)) {
                    System.out.println("===========>this is an admin");
                    request.setAttribute("adminFlag", true);    //对isAdmin的检查放在admin_head.jsp页面里
                    request.setAttribute("adminAccount", SessionUtil.getStudentNickname(request));
                }
            }
        }
    }

}

