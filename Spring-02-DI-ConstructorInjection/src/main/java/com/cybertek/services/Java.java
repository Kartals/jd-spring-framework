package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

   /*
    OfficeHours officeHours;

    public Java(OfficeHours officeHours) { // creating a constructor
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + officeHours.getHours()));
    }
    /*
    */

    ExtraSessions extraSessions;   //interface    // burada yaptığımız polymorpic way yaparak, OfficeHours'a ulaşıyoruz,
                                        // çünkü OfficeHours, ExtraSessions ı imolement ediyor. Genelde böyle yapıluyor, çünkü böyle daha loosely coupling

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    } // creating a constructor

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));

    }
}
