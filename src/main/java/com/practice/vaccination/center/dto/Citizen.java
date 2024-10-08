package com.practice.vaccination.center.dto;

import lombok.Data;

@Data
public class Citizen {
    private Integer id;
    private String name;
    private int vaccinationCenterId;
}