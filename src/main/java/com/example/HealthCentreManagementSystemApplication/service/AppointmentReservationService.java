package com.example.HealthCentreManagementSystemApplication.service;


import com.example.HealthCentreManagementSystemApplication.dto.AppointmentReservationDto;
import com.example.HealthCentreManagementSystemApplication.entity.AppointmentReservation;
import com.example.HealthCentreManagementSystemApplication.mapper.AppointmentReservationMapper;
import com.example.HealthCentreManagementSystemApplication.repository.AppointmentReservationRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AppointmentReservationService {

    private final AppointmentReservationRepository appointmentReservationRepository;

    private AppointmentReservationMapper appointmentReservationMapper;

    public void addAppointmentReservation(AppointmentReservationDto appointmentReservationDto){
        AppointmentReservation appointmentReservation = appointmentReservationMapper.mapToEntity(appointmentReservationDto);
        appointmentReservationRepository.save(appointmentReservation);
    }

    public List<AppointmentReservationDto> getAppointmentReservations(){
        List<AppointmentReservation> reservations = appointmentReservationRepository.findAll();
        return appointmentReservationMapper.mapToDtos(reservations);
    }

}
