package com.hkdemircan.petclinc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class PetClinicConfiguration {
    @Autowired
    private PetClinicProperties petClinicProperties;

    @PostConstruct
    public void init(){
        //otomatik invoke edilecek.
        System.out.println("Display owners with pets : " + petClinicProperties.isDisplayOwnersWithPets());
    }
}
