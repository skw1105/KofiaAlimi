package com.alimi.kofia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/") // @RequestMapping(value="/", method=RequestMethod.GET) 과 같음
    public String index() {
        return "index"; // -> src/main/resources/templates/index.mustache 로 전환되어 View Resolver 가 처리하게 됨
    }
}

// @GetMapping은 메소드에만 적용, @RequestMapping 은 클래스와 메소드에서 모두 사용 가능
// @RequestMapping(value="/posts")
// class asdasd {
// @GetMapping
// @PostMapping
// @PutMapping
// @DeleteMapping
// }
// 이런 식으로 사용 가능
