package com.rabo.yepp.generics.two;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StartVehicle {

    public static void main(String[] args) throws JsonProcessingException {

        Vehicle vehicle = new Car( "Blue");

        System.out.println(vehicle);

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(vehicle);
        System.out.println(json);

        Vehicle vehicleFromJson = objectMapper.readValue(json, Vehicle.class);
    }
}
