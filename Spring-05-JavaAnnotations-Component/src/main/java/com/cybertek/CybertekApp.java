package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course=container.getBean("API",Course.class);  // defult Bean ID, eğer class isminin hepsi Büyük harf ise, bean id de BÜYüK harfli olmalı
        course.getTeachingHours();

        Course course1=container.getBean("java",Course.class); // default Bean ID, implement class isminin ilk harfi küçük yazılarak yapılır
        course1.getTeachingHours();

        Course course2=container.getBean("selenium",Course.class); // default Bean ID, implement class isminin ilk harfi küçük yazılarak yapılır
        course2.getTeachingHours();

    }
}
