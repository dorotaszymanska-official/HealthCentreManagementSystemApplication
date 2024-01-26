package com.example.HealthCentreManagementSystemApplication.mapper;


import com.example.HealthCentreManagementSystemApplication.dto.AppointmentDto;
import com.example.HealthCentreManagementSystemApplication.entity.Appointment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppointmentMapper {
    public AppointmentDto mapToDto(Appointment appointment){
        return AppointmentDto.builder()
                .id(appointment.getId())
                .patient(appointment.getPatient())
                .doctor(appointment.getDoctor())
                .date(appointment.getDateOfAppointment())
                .time(appointment.getTimeOfAppointment())
                .prescriptions(appointment.getPrescriptions())
                .build();
    }

    public List<AppointmentDto> mapToDtos(List<Appointment> appointments){
        return appointments.stream().map(this::mapToDto).toList();
    }

    public Appointment mapToEntity(AppointmentDto appointmentDto){
        return new Appointment(appointmentDto.getId(),
                                appointmentDto.getPatient(),
                                appointmentDto.getDoctor(),
                                appointmentDto.getDate(),
                                appointmentDto.getTime(),
                                appointmentDto.getPrescriptions());
    }

}
