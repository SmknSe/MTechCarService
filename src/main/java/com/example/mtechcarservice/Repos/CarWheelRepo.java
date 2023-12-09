package com.example.mtechcarservice.Repos;

import com.example.mtechcarservice.Entities.CarWheel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarWheelRepo extends JpaRepository<CarWheel,Long> {
}
