package com.hkdemircan.web;

import com.hkdemircan.exception.OwnerNotFoundException;
import com.hkdemircan.model.Owner;
import com.hkdemircan.service.PetClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class PetClinicRestController {
    @Autowired
    private PetClinicService petClinicService;

    @RequestMapping(method = RequestMethod.GET, value = "/owners")
    public ResponseEntity<List<Owner>> getOwners(){
       List<Owner> owners = petClinicService.findOwners();
        return ResponseEntity.ok(owners);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/owner")
    public ResponseEntity<List<Owner>> getOwners(@RequestParam("ln") String lastName){
        List<Owner> owners = petClinicService.findOwners(lastName);
        return ResponseEntity.ok(owners);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/owner/{id}")
    public ResponseEntity<Owner> getOwner(@PathVariable("id") Long id){
        try{
            Owner owner = petClinicService.findOwner(id);
            return ResponseEntity.ok(owner);
        }catch (OwnerNotFoundException ex){
            return ResponseEntity.notFound().build();
        }

    }
}
