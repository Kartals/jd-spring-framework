package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {

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
