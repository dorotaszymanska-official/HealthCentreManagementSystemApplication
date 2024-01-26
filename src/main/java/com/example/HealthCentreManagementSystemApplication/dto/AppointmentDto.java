package com.example.HealthCentreManagementSystemApplication.dto;


import com.example.HealthCentreManagementSystemApplication.entity.Doctor;
import com.example.HealthCentreManagementSystemApplication.entity.Patient;
import com.example.HealthCentreManagementSystemApplication.entity.Prescription;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class AppointmentDto {

    private long id;

    private Patient patient;

    private Doctor doctor;

    private LocalDate date;

    private LocalTime time;

    private List<Prescription> prescriptions = new ArrayList<>();

    @Builder
    public AppointmentDto(long id, Patient patient, Doctor doctor, LocalDate date, LocalTime time, List<Prescription> prescriptions){
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.prescriptions = prescriptions;
    }
}
