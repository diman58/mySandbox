package Services;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.openqa.selenium.WebElement;

import java.util.UUID;

import static Services.StringManager.getXpath;
import static io.qameta.allure.util.ResultsUtils.getStatus;
import static io.qameta.allure.util.ResultsUtils.getStatusDetails;

@Aspect
public class DriverLogger {

    private static AllureLifecycle lifecycle;

    public static AllureLifecycle getLifecycle() {
        if(lifecycle==null) lifecycle = Allure.getLifecycle();
        return lifecycle;
    }

    /*@Pointcut("call(* org.openqa.selenium.*.findElement*(..))")
    public void find() {
    }*/

    @Pointcut("call(* org.openqa.selenium.*.click(..))")
    public void click() {
    }

    @Pointcut("call(* org.openqa.selenium.*.sendKeys(..))")
    public void sendKeys() {
    }

    @Pointcut("call(* org.openqa.selenium.support.ui.*.until(..))")
    public void until() {
    }

    /*@Pointcut("execution(* org.hamcrest.MatcherAssert.*(..))")
    public void assertThat() {
    }

    @Pointcut("execution(* assertTrue(..))")
    public void assertTrue() {
    }*/

    /*@Around("find()")
    public Object findStep(ProceedingJoinPoint joinPoint) throws Throwable {
        return addStep("Finding element ", joinPoint);
    }*/

    /*@Around("until()")
    public Object untillStep(ProceedingJoinPoint joinPoint) throws Throwable {
        return addStep("Waiting untill ", joinPoint);
    }*/

    @Around("click()")
    public Object clickStep(ProceedingJoinPoint joinPoint) throws Throwable {
        return addStep2("Click element By.xpath: ", joinPoint);
    }

    @Around("sendKeys()")
    public Object sendKeysStep(ProceedingJoinPoint joinPoint) throws Throwable {
        return addStep2("Sending keys to element By.xpath: ", joinPoint);
    }

    /*@Around("assertThat()")
    public Object assertThatStep(ProceedingJoinPoint joinPoint) throws Throwable {
        return addStep3("AssertThat: ", joinPoint);
    }

    @Around("assertTrue()")
    public Object assertTrueStep(ProceedingJoinPoint joinPoint) throws Throwable {
        return addStep4("AssertTrue: ", joinPoint);
    }
*/
    /*private Object addStep(String name, ProceedingJoinPoint joinPoint) throws Throwable {
        String uuid = UUID.randomUUID().toString();
        getLifecycle().startStep(uuid, new StepResult().setName(name+joinPoint.getArgs()[0]));

        try {
            Object proceed = joinPoint.proceed();
            getLifecycle().updateStep(uuid, s -> s.setStatus(Status.PASSED));
            return proceed;
        } catch (Throwable throwable) {
            getLifecycle().updateStep(uuid, s -> s.setStatus(getStatus(throwable).orElse(Status.BROKEN))
                    .setStatusDetails(getStatusDetails(throwable).orElse(null)));
            throw throwable;
        } finally {
            getLifecycle().stopStep(uuid);
        }
    }*/

    private Object addStep2(String name, ProceedingJoinPoint joinPoint) throws Throwable {
        String uuid = UUID.randomUUID().toString();
        getLifecycle().startStep(uuid, new StepResult().setName(name+getXpath((WebElement) joinPoint.getTarget())));

        try {
            Object proceed = joinPoint.proceed();
            getLifecycle().updateStep(uuid, s -> s.setStatus(Status.PASSED));
            return proceed;
        } catch (Throwable throwable) {
            getLifecycle().updateStep(uuid, s -> s.setStatus(getStatus(throwable).orElse(Status.BROKEN))
                    .setStatusDetails(getStatusDetails(throwable).orElse(null)));
            throw throwable;
        } finally {
            getLifecycle().stopStep(uuid);
        }
    }

    /*private Object addStep3(String name, ProceedingJoinPoint joinPoint) throws Throwable {
        String uuid = UUID.randomUUID().toString();
        getLifecycle().startStep(uuid, new StepResult().setName(name+joinPoint.getArgs()[0]
                +" "+joinPoint.getArgs()[1]));

        try {
            Object proceed = joinPoint.proceed();
            getLifecycle().updateStep(uuid, s -> s.setStatus(Status.PASSED));
            return proceed;
        } catch (Throwable throwable) {
            getLifecycle().updateStep(uuid, s -> s.setStatus(getStatus(throwable).orElse(Status.BROKEN))
                    .setStatusDetails(getStatusDetails(throwable).orElse(null)));
            throw throwable;
        } finally {
            getLifecycle().stopStep(uuid);
        }
    }

    private Object addStep4(String name, ProceedingJoinPoint joinPoint) throws Throwable {
        String uuid = UUID.randomUUID().toString();
        getLifecycle().startStep(uuid, new StepResult().setName(name+joinPoint.getArgs()[0]));

        try {
            Object proceed = joinPoint.proceed();
            getLifecycle().updateStep(uuid, s -> s.setStatus(Status.PASSED));
            return proceed;
        } catch (Throwable throwable) {
            getLifecycle().updateStep(uuid, s -> s.setStatus(getStatus(throwable).orElse(Status.BROKEN))
                    .setStatusDetails(getStatusDetails(throwable).orElse(null)));
            throw throwable;
        } finally {
            getLifecycle().stopStep(uuid);
        }
    }*/
}
