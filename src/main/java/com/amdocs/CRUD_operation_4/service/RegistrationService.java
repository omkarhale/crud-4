package com.amdocs.CRUD_operation_4.service;

import com.amdocs.CRUD_operation_4.entitiy.Registration;

import java.util.List;

public interface RegistrationService {
    void createRegistration(Registration registration);

    List<Registration> getAllRegistration();
}
