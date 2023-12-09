package com.example.mtechcarservice.Controllers;

import com.example.mtechcarservice.Services.CarBodyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/body")
@RequiredArgsConstructor
public class CarBodyController {
    private final CarBodyService carBodyService;
    @GetMapping
    public ResponseEntity<?> getAllCarBody(){
        return ResponseEntity.status(HttpStatus.OK).body(carBodyService.getAll());
    }
}
