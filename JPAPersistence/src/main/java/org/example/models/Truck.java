package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Trucks")
public class Truck extends Vehicle{
    @Column(name = "load capacity")
    private Double loadCapacity;

    public Truck(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    protected Truck() {
    }

    public Truck(String type, String model, BigDecimal price, String fuelType, Double loadCapacity) {
        super(type, model, price, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    protected void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String toString() {
        return "Truck {" + super.toString() +
                ", LoadCapacity='" + this.getLoadCapacity() + '\'' + '}';
    }

}
