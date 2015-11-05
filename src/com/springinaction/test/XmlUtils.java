package com.springinaction.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yiben on 2015/11/2.
 */
public class XmlUtils {

    private static final XmlUtils instance = new XmlUtils();
    private static String filepath = "com/springinaction/springidol/spring-idol.xml";
    private static ApplicationContext applicationContext = new ClassPathXmlApplicationContext(filepath);

    public static XmlUtils getInstance() {
        return instance;
    }

    public Object getBean(String beanName) {

        return applicationContext.getBean(beanName);
    }
}
