package com.rideshare.trip_service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trip")
public class TripController {

    @PostMapping("/requestTrip")
    public String requestTrip() {
        System.out.println("Trip requested");
        return "Trip requested";
    }

    @PostMapping("/startMatching")
    public String startMatching() {
        System.out.println("Matching started");
        return "Matching started";
    }

    @PostMapping("/driverAccepts")
    public String driverAccepts() {
        System.out.println("Driver accepted the trip");
        return "Driver accepted the trip";
    }

    @PostMapping("/driverArrives")
    public String driverArrives() {
        System.out.println("Driver arrived at the pickup location");
        return "Driver arrived at the pickup location";
    }

    @PostMapping("/tripStart")
    public String tripStart() {
        System.out.println("Trip started");
        return "Trip started";
    }

    @PostMapping("/tripCompleted")
    public String tripCompleted() {
        System.out.println("Trip completed");
        return "Trip completed";
    }

    @PostMapping("/riderCancelTrip")
    public String riderCancelTrip() {
        System.out.println("Rider canceled the trip");
        return "Rider canceled the trip";
    }

    @PostMapping("/driverCancelTrip")
    public String driverCancelTrip() {
        System.out.println("Driver canceled the trip");
        return "Driver canceled the trip";
    }
}