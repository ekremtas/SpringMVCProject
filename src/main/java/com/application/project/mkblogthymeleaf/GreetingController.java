package com.application.project.mkblogthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/")
    String greetingPage() {
        return "index";
    }
    @PostMapping(path = "/formPost")
    String postData(@RequestBody String iName,@RequestBody String iSurname){
    	return null;
    }
}