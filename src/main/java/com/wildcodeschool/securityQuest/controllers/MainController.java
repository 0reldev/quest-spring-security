package com.wildcodeschool.securityQuest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String welcome() {

        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    @ResponseBody
    public String champions() {

        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    @ResponseBody
    public List<String> director() {

        List<String> schoolList = new ArrayList<>();
            schoolList.add("Biarritz");
            schoolList.add("Bordeaux");
            schoolList.add("La Loupe");
            schoolList.add("More 21 other schools");

        return schoolList;
    }


}






