package com.example.mtechcarservice.Services;

import com.example.mtechcarservice.Entities.CarBody;
import com.example.mtechcarservice.Repos.CarBodyRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarBodyService {
    private final CarBodyRepo carBodyRepo;

    public List<CarBody> getAll(){
        return carBodyRepo.findAll();
    }
    public CarBody getBodyById(Long id){
        return carBodyRepo.findById(id).orElseThrow();
    }
}
