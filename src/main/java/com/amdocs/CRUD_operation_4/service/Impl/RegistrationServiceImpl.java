package com.amdocs.CRUD_operation_4.service.Impl;

import com.amdocs.CRUD_operation_4.entitiy.Registration;
import com.amdocs.CRUD_operation_4.repositiory.RegistrationRepositroy;
import com.amdocs.CRUD_operation_4.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
   @Autowired
   private RegistrationRepositroy registrationRepositroy;
    @Override
    public void createRegistration(Registration registration) {
        registrationRepositroy.save(registration);

    }

    @Override
    public List<Registration> getAllRegistration() {

        List<Registration> registrations = registrationRepositroy.findAll();
        return registrations;

    }
}
