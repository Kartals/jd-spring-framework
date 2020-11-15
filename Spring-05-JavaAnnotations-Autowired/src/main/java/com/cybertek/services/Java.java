package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {

    //Field Injection
    @Autowired // Field Injection da sadece @Autowired yazıyoruz Field bölümüne

    private ExtraSessions extraSessions;  // polymorfic way

    /*
    //Constructor Injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
     */


    /*
    //Setter Injection
    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    @Autowired                                              // Setter Injection with @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
     */

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :"+ (30+extraSessions.getHours()));
    }
}
