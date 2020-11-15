package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructorName;

    @Override
    public String toString() {
        return "Java{" +
                "instructorName='" + instructorName + '\'' +
                '}';
    }

    private ExtraSessions extraSessions;

    @Autowired
    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public int getTeachingHours() {
        return 20 +extraSessions.getHours();
    }
}
