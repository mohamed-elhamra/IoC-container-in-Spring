package com.melhamra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myClass")
public class MyClass {
    @Value("Hello World")
    private String myField;

    public String getMyField() {
        return myField;
    }

    public void setMyField(String myField) {
        this.myField = myField;
    }
}
