package com.rideshare.trip_service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trip")
public class TripController {

    @PostMapping("/request-trip")
    public String requestTrip(@RequestBody RideRequest rideRequest) {
        System.out.println("Received trip request: " + rideRequest);
        return rideRequest.toString();
    }

    @PostMapping("/start-matching")
    public String startMatching() {
        System.out.println("Matching started");
        return "Matching started";
    }

    @PostMapping("/driver-accepts")
    public String driverAccepts() {
        System.out.println("Driver accepted the trip");
        return "Driver accepted the trip";
    }

    @PostMapping("/driver-arrives")
    public String driverArrives() {
        System.out.println("Driver arrived at the pickup location");
        return "Driver arrived at the pickup location";
    }

    @PostMapping("/trip-start")
    public String tripStart() {
        System.out.println("Trip started");
        return "Trip started";
    }

    @PostMapping("/trip-completed")
    public String tripCompleted() {
        System.out.println("Trip completed");
        return "Trip completed";
    }

    @PostMapping("/rider-cancel-trip")
    public String riderCancelTrip() {
        System.out.println("Rider canceled the trip");
        return "Rider canceled the trip";
    }

    @PostMapping("/driver-cancel-trip")
    public String driverCancelTrip() {
        System.out.println("Driver canceled the trip");
        return "Driver canceled the trip";
    }
}