package com.springinaction.test;

import com.springinaction.exception.PerformanceException;
import com.springinaction.springidol.Performer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yiben on 2015/10/21.
 */
public class JugglerTest {

    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        Performer performer = (Performer) applicationContext.getBean("duke");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
