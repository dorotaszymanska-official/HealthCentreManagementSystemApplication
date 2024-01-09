package com.example.HealthCentreManagementSystemApplication.entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "patient")
public class Patient{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String login;

    private String password;

    private String pesel;

    private String name;

    private String surname;

    private String address;

    private String postcode;

    private String city;

    @OneToMany(mappedBy = "patient")
    private List<Prescription> prescriptions = new ArrayList<>();

    @OneToMany(mappedBy = "patient")
    private List<DoctorsAppointment> doctorsAppointments = new ArrayList<>();

    public Patient(long id, String login, String password, String pesel, String name, String surname, String address,
                   String postcode, String city) {
        //super();
        this.id = id;
        this.login = login;
        this.password = password;
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postcode = postcode;
        this.city = city;
    }


}
