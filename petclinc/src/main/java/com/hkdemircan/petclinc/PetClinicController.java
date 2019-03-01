package com.hkdemircan.petclinc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PetClinicController {

    @RequestMapping("/ad")
    @ResponseBody
    public String welcome(){
        return "Welcome to PetClinic World!";
    }
}
