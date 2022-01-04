package com.alimi.kofia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        return "index"; // -> src/main/resources/templates/index.mustache 로 전환되어 View Resolver 가 처리하게 됨
    }
}
