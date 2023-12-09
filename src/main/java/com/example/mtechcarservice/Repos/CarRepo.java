package com.example.mtechcarservice.Repos;

import com.example.mtechcarservice.Entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car,Long>, PagingAndSortingRepository<Car,Long> {
}
