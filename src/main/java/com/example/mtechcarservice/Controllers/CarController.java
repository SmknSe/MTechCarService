package com.example.mtechcarservice.Controllers;

import com.example.mtechcarservice.DTOs.CarDTO;
import com.example.mtechcarservice.Entities.Car;
import com.example.mtechcarservice.Services.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllCars(@RequestParam(name = "page", required = false) Integer page){
        if(page != null){
            return ResponseEntity.status(HttpStatus.OK).body(carService.getAllByPage(page));
        }
        else return ResponseEntity.status(HttpStatus.OK).body(carService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getCarById(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carService.getById(id));
        }
        catch (NoSuchElementException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Car doesn't exist");
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCar(@RequestBody CarDTO dto){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(carService.createCar(dto));
        }
        catch (NoSuchElementException exception){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No element with given id found");
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }
}
