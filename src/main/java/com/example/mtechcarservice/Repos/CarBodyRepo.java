package com.example.mtechcarservice.Repos;

import com.example.mtechcarservice.Entities.CarBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBodyRepo extends JpaRepository<CarBody,Long> {
}
