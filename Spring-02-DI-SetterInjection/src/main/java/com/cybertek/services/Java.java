package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.Data;

@Data        // lombok kullanarak getter ve setter yapıyoruz
public class Java implements Course {

    private ExtraSessions extraSessions;


/*
    private OfficeHours officeHours;  // composition

    public OfficeHours getOfficeHours() {          // getter
        return officeHours;
    }
    public void setOfficeHours(OfficeHours officeHours) {  // setter
        this.officeHours = officeHours;
    }

     @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }
 */

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }
}
