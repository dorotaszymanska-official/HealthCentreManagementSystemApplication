package com.example.HealthCentreManagementSystemApplication.repository;

import com.example.HealthCentreManagementSystemApplication.entity.AppointmentReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentReservationRepository extends JpaRepository<AppointmentReservation, Long> {
}
