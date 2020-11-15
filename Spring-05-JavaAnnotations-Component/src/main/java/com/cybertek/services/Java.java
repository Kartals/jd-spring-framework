package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.stereotype.Component;

@Component // create a bean from/for Java class
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 30");
    }
}
