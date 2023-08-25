package org.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Bikes")
public class Bike extends Vehicle{
    public Bike() {
    }

    public Bike(String type, String model, BigDecimal price, String fuelType) {
        super(type, model, price, fuelType);
    }
    @Override
    public String toString() {
        return "Bike {" +
                super.toString() +
                '}';
    }
}
