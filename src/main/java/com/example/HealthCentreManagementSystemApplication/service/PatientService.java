package com.example.HealthCentreManagementSystemApplication.service;

import java.util.List;

import com.example.HealthCentreManagementSystemApplication.dto.PatientDto;
import com.example.HealthCentreManagementSystemApplication.entity.Patient;
import com.example.HealthCentreManagementSystemApplication.mapper.PatientMapper;
import com.example.HealthCentreManagementSystemApplication.repository.PatientRepository;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class PatientService {

    private final PatientRepository patientRepo;

    private PatientMapper patientMapper;

    public void addPatient(PatientDto patientDto) {
        Patient patient = patientMapper.mapToEntity(patientDto);
        patientRepo.save(patient);
    }

    public List<PatientDto> getPatients(){
        List<Patient> patients = patientRepo.findAll();
        return patientMapper.mapToDtos(patients);
    }

}
