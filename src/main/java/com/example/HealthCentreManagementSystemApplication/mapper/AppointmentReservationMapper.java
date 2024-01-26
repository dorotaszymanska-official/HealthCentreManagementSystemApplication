package com.example.HealthCentreManagementSystemApplication.mapper;

import com.example.HealthCentreManagementSystemApplication.dto.AppointmentReservationDto;
import com.example.HealthCentreManagementSystemApplication.entity.AppointmentReservation;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentReservationMapper {

    public AppointmentReservationDto mapToDto(AppointmentReservation appointmentReservation){
        return AppointmentReservationDto.builder()
                .id(appointmentReservation.getId())
                .patient(appointmentReservation.getPatient())
                .doctor(appointmentReservation.getDoctor())
                .date(appointmentReservation.getDateOfAppointment())
                .time(appointmentReservation.getTimeOfAppointment())
                .build();
    }

    public List<AppointmentReservationDto> mapToDtos(List<AppointmentReservation> appointmentReservations){
        return appointmentReservations.stream().map(this::mapToDto).toList();
    }

    public AppointmentReservation mapToEntity(AppointmentReservationDto appointmentReservationDto){
        return new AppointmentReservation(
                appointmentReservationDto.getId(),
                appointmentReservationDto.getPatient(),
                appointmentReservationDto.getDoctor(),
                appointmentReservationDto.getDate(),
                appointmentReservationDto.getTime());
    }
}
