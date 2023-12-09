package com.example.mtechcarservice.Services;

import com.example.mtechcarservice.Entities.CarWheel;
import com.example.mtechcarservice.Repos.CarWheelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarWheelService {
    private final CarWheelRepo carWheelRepo;

    public List<CarWheel> getAll(){
        return carWheelRepo.findAll();
    }
    public CarWheel getWheelById(Long id){
        return carWheelRepo.findById(id).orElseThrow();
    }

    public void save(String size){
        CarWheel wheel = new CarWheel();
        wheel.setSize(size);
        carWheelRepo.save(wheel);
    }

    public boolean isEmpty(){
        return carWheelRepo.count()==0;
    }
}
