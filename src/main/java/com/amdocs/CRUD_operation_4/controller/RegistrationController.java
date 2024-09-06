package com.amdocs.CRUD_operation_4.controller;

import com.amdocs.CRUD_operation_4.entitiy.Registration;
import com.amdocs.CRUD_operation_4.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crud")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<String> createRegistration(@RequestBody Registration registration){
        registrationService.createRegistration(registration);
        return new ResponseEntity<>("Registration is done ", HttpStatus.CREATED);

    }
//    @GetMapping
//    public void getAllRegistration(){
//        List<Registration> allRegistration = registrationService.getAllRegistration();
//        return new ReponseEntity<>(allRegistration,HttpStatus.CREATED);
//    }
}
