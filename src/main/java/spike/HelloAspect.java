package spike;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class HelloAspect {

    @Around("@annotation(spike.HelloAnnotation)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Something around!");
        return pjp.proceed();
    }

}
