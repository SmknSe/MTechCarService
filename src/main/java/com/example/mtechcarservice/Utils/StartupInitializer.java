package com.example.mtechcarservice.Utils;

import com.example.mtechcarservice.Services.CarBodyService;
import com.example.mtechcarservice.Services.CarWheelService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StartupInitializer implements CommandLineRunner {
    private final CarWheelService carWheelService;
    private final CarBodyService carBodyService;
    @Override
    public void run(String... args) throws Exception {
        if (carBodyService.isEmpty()){
            carBodyService.save("Hatchback");
            carBodyService.save("Sedan");
        }
        if (carWheelService.isEmpty()){
            carWheelService.save("R15");
            carWheelService.save("R16");
            carWheelService.save("R17");
        }
    }
}
