package team.ustc.sse.blockly.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

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
    public void declearJoinPointExpression(){}
}
