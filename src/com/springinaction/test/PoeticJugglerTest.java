package com.springinaction.test;

import com.springinaction.exception.PerformanceException;
import com.springinaction.springidol.Performer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yiben on 2015/10/28.
 */
public class PoeticJugglerTest {

    /*Poem sonnet29 = new Sonnet29();
    Performer duke = new PoieticJuggler(15, sonnet29);
    */

    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        Performer poeticDuke = (Performer) applicationContext.getBean("poeticDuke");
        try {
            poeticDuke.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
    }
}
