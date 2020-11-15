package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
public class Java implements Course {

    @Value("JD1")
    private String batch;               //create a field

    @Value("${instructor}")
    private String instructor;          //create a field

    @Value("${days}")
    private String [] days;             //create a field

    @Override
    public String toString() {         //creat toString() method via cmd+N, bunu lombok annotation ile de yapabiliriz
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    /*
    @Autowired                 // Field injection
    @Qualifier("officeHours")  // inject edilmesini istediğimiz default bean id'yi yazıyoruz
     */

    private ExtraSessions extraSessions;

    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {  // Constructor injection, 1 constructor olduğundan @Autowired kullanmayabiliriz.
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :"+ (30+extraSessions.getHours()));
    }
}
