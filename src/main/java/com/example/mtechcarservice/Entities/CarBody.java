package com.example.mtechcarservice.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Car_bodies")
@Entity
@Data
public class CarBody {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
}
