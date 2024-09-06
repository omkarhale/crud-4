package com.amdocs.CRUD_operation_4.repositiory;

import com.amdocs.CRUD_operation_4.entitiy.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepositroy extends JpaRepository<Registration,Long> {
}
