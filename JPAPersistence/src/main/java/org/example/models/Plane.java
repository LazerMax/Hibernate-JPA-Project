package org.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.math.BigDecimal;
@Entity
@Table(name = "planes")
public class Plane extends Vehicle{
    @Column(name = "passenger capacity")
    private Integer passengerCapacity;

    public Plane(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public Plane() {
    }


    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public Plane(String type, String model, BigDecimal price, String fuelType, Integer passengerCapacity) {
        super(type, model, price, fuelType);
        this.passengerCapacity = passengerCapacity;
    }

    protected void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Plane {" +
                super.toString() +
        '}';
    }


}
