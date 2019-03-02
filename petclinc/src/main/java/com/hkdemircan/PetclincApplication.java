package com.hkdemircan;

import com.hkdemircan.petclinc.PetClinicProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(value = PetClinicProperties.class)
public class PetclincApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetclincApplication.class, args);
    }

}
