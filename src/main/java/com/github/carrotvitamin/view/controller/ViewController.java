package com.github.carrotvitamin.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ex-yinshaobo001 at 2020/1/19 18:11
 */
@Controller
public class ViewController {

    @GetMapping
    public String view() {
        return "index";
    }
}