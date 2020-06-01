package com.melhamra;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        MyClass myClass = applicationContext.getBean("myClass",MyClass.class);
        System.out.println(myClass.getMyField());

        /*Resource res = new ClassPathResource("Beans.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        MyClass myClass = (MyClass) factory.getBean("myClass");
        System.out.println(myClass.getMyField());*/
    }
}



