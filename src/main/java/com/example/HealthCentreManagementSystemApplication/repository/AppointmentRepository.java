package com.example.HealthCentreManagementSystemApplication.repository;

import com.example.HealthCentreManagementSystemApplication.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
