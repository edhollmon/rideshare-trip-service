package com.rideshare.trip_service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RideRequest {
    private String pickUpLongitude;
    private String pickUpLatitude;
    private String riderId;
    private String status;

    @JsonCreator
    public RideRequest(
        @JsonProperty("pickUpLongitude") String pickUpLongitude,
        @JsonProperty("pickUpLatitude") String pickUpLatitude,
        @JsonProperty("riderId") String riderId
    ) {
        this.pickUpLongitude = pickUpLongitude;
        this.pickUpLatitude = pickUpLatitude;
        this.riderId = riderId;
    }

    // Getters and setters
    public String getPickUpLongitude() {
        return pickUpLongitude;
    }

    public void setPickUpLongitude(String pickUpLongitude) {
        this.pickUpLongitude = pickUpLongitude;
    }

    public String getPickUpLatitude() {
        return pickUpLatitude;
    }

    public void setPickUpLatitude(String pickUpLatitude) {
        this.pickUpLatitude = pickUpLatitude;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RideRequest{" +
                "pickUpLongitude='" + pickUpLongitude + '\'' +
                ", pickUpLatitude='" + pickUpLatitude + '\'' +
                ", riderId='" + riderId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
