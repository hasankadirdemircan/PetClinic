package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerDe {

    @RequestMapping("/dd")
    @ResponseBody
    public String welll(){
        return "hello";
    }
}
