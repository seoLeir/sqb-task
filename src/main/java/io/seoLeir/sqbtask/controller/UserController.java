package io.seoLeir.sqbtask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class UserController {

    @GetMapping
    public String getAllStudents(Model model){
        return null;
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Long id, Model model){
        return null;
    }

    @PostMapping
    public String createStudent(Model model){
        return null;
    }

    @PatchMapping("/{id}")
    public String updateStudent(@PathVariable("id") Long id){
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        return null;
    }




}
