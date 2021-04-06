package springaop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 定义了1个切面
 * @PackageName:org.springaop.aop
 * @ClassName:UserServiceLogger
 * @Description:
 * @author: 悟空
 * @date: 2021/4/1 14:55
 * @email: 10947@163.com
 */
@Slf4j
@Aspect
@Component
public class UserServiceLogger {

    /**
     * 定义了一个切点
     * @author 悟空
     * @description //TODO
     * @date 15:28 2021/4/6
     * @param
     */
    @Pointcut("execution(* springaop.service.impl..*.*(..))")
    public void pointcut(){}



    /**
     * 前置增强
     * @Author 悟空
     * @Description //TODO
     * @Date 15:04 2021/4/1
     * @Param [jp]
     * @return void
     */
    @Before("pointcut()")
    public void before(JoinPoint jp){
        log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。 方法入参：" + Arrays.toString(jp.getArgs()));
    }


    /**
     * 后置增强
     * @Author 悟空
     * @Description //TODO
     * @Date 15:06 2021/4/1
     * @Param [jp, result]  方法执行完成的结果回调给result
     * @return void
     */
    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void afterReturning(JoinPoint jp,Object result){
        log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() +" 方法。方法的返回值：" + result);
    }



}
