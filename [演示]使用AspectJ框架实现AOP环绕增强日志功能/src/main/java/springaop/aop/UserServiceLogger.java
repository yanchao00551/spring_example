package springaop.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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
     * 环绕增强 = 前置 + 后置 + 异常 + 能否执行目标方法
     * @author 悟空
     * @description //TODO
     * @date 16:05 2021/4/6
     * @param jp
     * @return java.lang.Object
     */
    @Around("execution(* springaop.service.impl..*.*(..))")
    public  Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
        log.info("调用 " + jp.getTarget() +  " 的 " + jp.getSignature().getName() + " 方法，方法入参：" + Arrays.toString(jp.getArgs()));
        try{
            Object result = jp.proceed();  //放行去执行目标方法，拿到返回值
            log.info("调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() + " 方法。方法入参：" + Arrays.toString(jp.getArgs()) + "返回值：" + result);
            return  result;
        }catch (Throwable e){
            log.error(jp.getSignature().getName() + " 方法发生异常: " + e);
            throw  e;
        }finally {
            log.info(jp.getSignature().getName() + " 方法结束执行。");
        }
    }

}
