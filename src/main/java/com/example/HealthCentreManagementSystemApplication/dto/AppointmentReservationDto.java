package com.example.HealthCentreManagementSystemApplication.dto;


import com.example.HealthCentreManagementSystemApplication.entity.Doctor;
import com.example.HealthCentreManagementSystemApplication.entity.Patient;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
public class AppointmentReservationDto {

    private long id;

    private Patient patient;

    private Doctor doctor;

    private LocalDate date;

    private LocalTime time;

    @Builder
    public AppointmentReservationDto(long id, Patient patient, Doctor doctor, LocalDate date, LocalTime time){
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }
}
