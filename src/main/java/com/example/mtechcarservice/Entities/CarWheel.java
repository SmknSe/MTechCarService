package com.example.mtechcarservice.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Car_wheels")
@Entity
@Data
public class CarWheel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String size;
}
