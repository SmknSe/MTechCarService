package com.example.mtechcarservice.Services;

import com.example.mtechcarservice.DTOs.CarDTO;
import com.example.mtechcarservice.Entities.Car;
import com.example.mtechcarservice.Repos.CarRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepo carRepo;
    private final CarWheelService carWheelService;
    private final CarBodyService carBodyService;

    public Car getById(Long id){
        return carRepo.findById(id).orElseThrow();
    }

    public Car createCar(CarDTO dto) throws Exception {
        if (dto.getWheels_amount() < 2) throw new Exception("Number of wheels should be at least 2");
        if (dto.getBody_id() == null) throw new Exception("A car must have a body");
        Car car = Car.builder()
                .wheel(carWheelService.getWheelById(dto.getWheel_id()))
                .body(carBodyService.getBodyById(dto.getBody_id()))
                .name(dto.getName())
                .wheels_amount(dto.getWheels_amount())
                .build();
        carRepo.save(car);
        return car;
    }

    public List<Car> getAll(){
        return carRepo.findAll();
    }

    public List<Car> getAllByPage(int page) {
        return carRepo.findAll(PageRequest.of(page,20)).getContent();
    }
}
