package com.application.project.mkblogthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class GreetingController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String greetingPage() {
		
        return "index";
    }
    @PostMapping(path = "/formPost")
    public String postData(@RequestParam String iName,@RequestParam String iSurname){
    	System.out.println(iName);
    	System.out.println(iSurname);
    	
    	/*System.out.println(user.getiSurname());
    	System.out.println(user.getiTC);*/
    	
    	
    	
    	return null;
    }
}