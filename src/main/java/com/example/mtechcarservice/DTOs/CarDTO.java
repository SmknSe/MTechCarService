package com.example.mtechcarservice.DTOs;

import lombok.Data;

@Data
public class CarDTO {
    private String name;
    private Long wheel_id;
    private Long body_id;
    private int wheels_amount;
}
