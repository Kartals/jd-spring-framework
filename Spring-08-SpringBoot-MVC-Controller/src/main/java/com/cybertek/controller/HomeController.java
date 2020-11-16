package com.cybertek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller //Wherever we see @Controller, 1-Business logic happens here 2-Coming from @Commponent, spring boot creates Bean for me from HomeController class
public class HomeController {

    @RequestMapping ("/")//default olarak @RequestMapping olarak gelmektedir.
    public String getRequestMapping(){
        return "home"; // this return, shows which template (here home.html) we want to give information from controller
    }

    @RequestMapping (method = RequestMethod.GET,value = "/ozzy")
    public String getRequestMapping2(){
        return "home";
    }

    @RequestMapping (method = RequestMethod.POST,value = "/ozzy")
    public String getRequestMapping3(){
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingEx2(){
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name is : " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is : " + name);
        System.out.println("email is : " + email);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("course is : " + course);
        return "home";
    }

    @GetMapping(value="/course")
    public String requestParamEx2(@RequestParam(value="name", required = false,defaultValue = "Cybertek") String name){
        System.out.println("name is : " + name);
        return "home";
    }

}
