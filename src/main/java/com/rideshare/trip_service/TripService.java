package com.rideshare.trip_service;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class TripService {

    private final DynamoDbClient dynamoDbClient;

    public TripService(DynamoDbClient dynamoDbClient) {
        this.dynamoDbClient = dynamoDbClient;
    }

    public void saveRideRequest(RideRequest rideRequest) {
        String rideRequestId = UUID.randomUUID().toString(); // Generate rideRequestId
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("rideRequestId", AttributeValue.builder().s(rideRequestId).build());
        item.put("riderId", AttributeValue.builder().s(rideRequest.getRiderId()).build());
        item.put("pickUpLongitude", AttributeValue.builder().s(rideRequest.getPickUpLongitude()).build());
        item.put("pickUpLatitude", AttributeValue.builder().s(rideRequest.getPickUpLatitude()).build());
        item.put("status", AttributeValue.builder().s(rideRequest.getStatus()).build());

        PutItemRequest request = PutItemRequest.builder()
                .tableName("RideRequest")
                .item(item)
                .build();

        try {
            dynamoDbClient.putItem(request);
            System.out.println("Ride request saved to DynamoDB with ID: " + rideRequestId);
        } catch (Exception e) {
            System.err.println("Failed to save ride request to DynamoDB: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
