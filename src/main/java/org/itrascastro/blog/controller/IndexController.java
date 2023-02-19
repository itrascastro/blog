package org.itrascastro.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String indexAction() {
        System.out.println("Index Controller->Index Action");
        return "index/index";
    }
}
