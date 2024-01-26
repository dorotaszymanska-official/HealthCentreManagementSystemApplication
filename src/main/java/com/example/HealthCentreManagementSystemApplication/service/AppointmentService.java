package com.example.HealthCentreManagementSystemApplication.service;

import com.example.HealthCentreManagementSystemApplication.dto.AppointmentDto;
import com.example.HealthCentreManagementSystemApplication.entity.Appointment;
import com.example.HealthCentreManagementSystemApplication.mapper.AppointmentMapper;
import com.example.HealthCentreManagementSystemApplication.repository.AppointmentRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    private AppointmentMapper appointmentMapper;

    public void addAppointment(AppointmentDto appointmentDto){
        Appointment appointment = appointmentMapper.mapToEntity(appointmentDto);
        appointmentRepository.save(appointment);
    }

    public List<AppointmentDto> getAppointments(){
        List<Appointment> appointments = appointmentRepository.findAll();
        return appointmentMapper.mapToDtos(appointments);
    }

}
