package com.example.Springapp_70281.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class firstcon {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Professor, this is my first Spring controller.";
    }

    @GetMapping("/yello")
    public String yello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "yello";
    }
}
