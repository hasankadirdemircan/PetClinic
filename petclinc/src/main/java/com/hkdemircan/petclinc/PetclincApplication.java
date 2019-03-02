package com.hkdemircan.petclinc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ServletComponentScan({"com.hkdemircan.web"})
@SpringBootApplication
@EnableConfigurationProperties(value = PetClinicProperties.class)
public class PetclincApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetclincApplication.class, args);
    }

}
