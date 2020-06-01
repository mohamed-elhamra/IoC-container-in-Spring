package com.melhamra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.melhamra")
public class Config {
    @Bean("myClass")
    public MyClass getMyClass(){
        MyClass myClass = new MyClass();
        myClass.setMyField("Hello World");
        return myClass;
    }
}
