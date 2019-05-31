package team.ustc.sse.blockly.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import team.ustc.sse.blockly.util.SessionUtil;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * description:
 * author: rgzhang
 * create time: 2019-05-28
 **/
@Aspect    //该标签把LoginAspect类声明为一个切面
@Order(1)  //设置切面的优先级：如果有多个切面，可通过设置优先级控制切面的执行顺序（数值越小，优先级越高）
@Component //该标签把LoginAspect类放到IOC容器中
public class LoginCheckAspect {
    /**
     * 定义一个方法，用于声明切入点表达式，方法中一般不需要添加其他代码
     * 使用@Pointcut声明切入点表达式
     * 后面的通知直接使用方法名来引用当前的切点表达式；如果是其他类使用，加上包名即可
     */
    @Pointcut("(execution(public * team.ustc.sse.blockly.controller.GameController.*(..))) " +
            "|| (execution(public * team.ustc.sse.blockly.controller.StudentController.*(..))) ")
    public void declearJoinPointExpression(){}


    /**
     * 前置通知
     */
    @Before("declearJoinPointExpression()") //该标签声明次方法是一个前置通知：在目标方法开始之前执行
    public void beforeMethod(JoinPoint joinPoint){
//        String methodName = joinPoint.getSignature().getName();
//        Object[] args = joinPoint.getArgs();
//        System.out.println("in LoginCheck , this method "+methodName+" begin. param<"+ args.length+">");
//        for(int i=0;i<args.length;i++){
//            if(args[i] instanceof HttpServletRequest){
//                HttpServletRequest request = (HttpServletRequest) args[i];
//                if(SessionUtil.checkStudentLogin(request)){
//                    System.out.println("===========>this is an user");
//                    request.setAttribute("loginFlag",true);
//                    request.setAttribute("studentNickname",SessionUtil.getStudentNickname(request));
//                    System.out.println("============>in aspect set model attribute");
//                }
//            }
//        }

    }




    /**
     * 异常通知（方法发生异常执行的代码）
     * 可以访问到异常对象；且可以指定在出现特定异常时执行的代码
     */
    @AfterThrowing(value="declearJoinPointExpression()",throwing="ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
        String methodName = joinPoint.getSignature().getName();
        System.out.println("this method "+methodName+" end.ex message<"+ex+">");
    }



}