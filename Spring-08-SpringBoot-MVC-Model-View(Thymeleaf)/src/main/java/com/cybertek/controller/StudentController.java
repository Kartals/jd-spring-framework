package com.cybertek.controller;


import com.cybertek.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/student") // class level @RequestMapping
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){  // pass Model interface as a parameter in method

        model.addAttribute("name","Ozzy"); // whenever see model.addAttribute, it means carrying data from homePage method to welcome html page
        model.addAttribute("course","MVC");

        String subject="Collections";
        model.addAttribute("subject",subject);

        //create some rondom studentid (0-1000) and show it in your UI
        int studentId=new Random().nextInt(1000);
        model.addAttribute("id",studentId);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        model.addAttribute("numbers",numbers);

        //print your birthday
        LocalDate birthday=LocalDate.now().minusYears(42);
        model.addAttribute("birthday",birthday);

        Student student=new Student(1,"Mike","Smith");
        model.addAttribute("student",student);

        return "student/welcome"; // path address in templates, genelde böyle gruplandırma yapılır
    }
}
