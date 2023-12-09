package com.example.mtechcarservice.Controllers;

import com.example.mtechcarservice.Services.CarWheelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/wheel")
@RequiredArgsConstructor
public class CarWheelController {
    private final CarWheelService carWheelService;

    @GetMapping("/all")
    public ResponseEntity<?> getAllCarWheels(){
        return ResponseEntity.status(HttpStatus.OK).body(carWheelService.getAll());
    }
}
