package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "Cars")
public class Car extends Vehicle {
    @Column(name = "seats")
    private Integer Seats;

    public Car(String type, String model, BigDecimal price, String fuelType, Integer seats) {
        super(type, model, price, fuelType);
        Seats = seats;
    }

    protected Car() {

    }

    public Integer getSeats() {
        return Seats;
    }

    protected void setSeats(Integer seats) {
        Seats = seats;
    }

    @Override
    public String toString() {
        return "Car {" + super.toString() +
                ", Seats=" + this.getSeats();

    }
}
