package com.example.HealthCentreManagementSystemApplication.mapper;

import java.util.List;

import com.example.HealthCentreManagementSystemApplication.dto.PatientDto;
import com.example.HealthCentreManagementSystemApplication.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {

    public PatientDto mapToDto(Patient patient) {
        return PatientDto.builder()
                .id(patient.getId())
                .pesel(patient.getPesel())
                .name(patient.getName())
                .surname(patient.getSurname())
                .address(patient.getAddress())
                .postcode(patient.getPostcode())
                .city(patient.getCity())
                .build();
    }


    public List<PatientDto> mapToDtos(List<Patient> patients){
        return patients.stream().map(this::mapToDto).toList();
    }


    public Patient mapToEntity(PatientDto patientDto) {
        return new Patient(
                patientDto.getId(),
                patientDto.getLogin(),
                patientDto.getPassword(),
                patientDto.getPesel(),
                patientDto.getName(),
                patientDto.getSurname(),
                patientDto.getAddress(),
                patientDto.getPostcode(),
                patientDto.getCity());
    }
}