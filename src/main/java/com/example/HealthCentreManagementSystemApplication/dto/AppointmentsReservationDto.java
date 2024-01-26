package com.example.HealthCentreManagementSystemApplication.dto;


import com.example.HealthCentreManagementSystemApplication.entity.Doctor;
import com.example.HealthCentreManagementSystemApplication.entity.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
public class AppointmentsReservationDto {

    private long id;

    private Patient patient;

    private Doctor doctor;

    private LocalDate date;

    private LocalTime time;

}
