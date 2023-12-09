package com.example.mtechcarservice.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "Cars")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CarBody body;
    @ManyToOne
    private CarWheel wheel;
    private int wheelsNum;
    private String name;

}
