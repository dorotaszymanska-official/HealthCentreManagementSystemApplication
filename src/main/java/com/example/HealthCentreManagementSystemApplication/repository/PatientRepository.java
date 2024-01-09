package com.example.HealthCentreManagementSystemApplication.repository;

import com.example.HealthCentreManagementSystemApplication.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
