package com.github.carrotvitamin.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ShaoBo Yin at 2020/1/19 18:11
 */
@Controller
public class ViewController {

    @GetMapping
    public String view() {
        return "index";
    }

    @GetMapping("/weather")
    public String weather(Model model) {
//        model.addAttribute("user", new User("张三啊"));
        return "weather";
    }
}
