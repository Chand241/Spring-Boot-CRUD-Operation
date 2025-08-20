package com.learn.spring.boot.controller;

import com.learn.spring.boot.model.Student;
import com.learn.spring.boot.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    StudentRepo sr;

    @GetMapping("/")
    public String home() {

        return "home";
    }

    @PostMapping("/student")
    public String addStudent(@ModelAttribute Student s, Model model) {

            sr.save(s);
            model.addAttribute("s", s);
            return "student";

    }
}
