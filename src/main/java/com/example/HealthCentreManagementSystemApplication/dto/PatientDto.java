package com.example.HealthCentreManagementSystemApplication.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PatientDto {

    private long id;

    private String login;

    private String password;

    private String pesel;

    private String name;

    private String surname;

    private String address;

    private String postcode;

    private String city;



    @Builder
    public PatientDto(long id, String pesel, String name, String surname, String address, String postcode, String login,
                      String password, String city) {
        this.id = id;
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.postcode = postcode;
        this.login = login;
        this.password = password;
        this.city = city;
    }
}
