package com.vehicle.rental.entities;

import com.vehicle.rental.enums.VehicleType;

public class Vehicle {

    private String id;

    private VehicleType vehicleType;

    private Double price;

    public Vehicle(String id, VehicleType vehicleType, Double price) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", vehicleType=" + vehicleType +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
