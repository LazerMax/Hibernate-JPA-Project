package org.example.models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Vehicle")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Long Id;
    @Column(name = "type", nullable = false)
    private String Type;
    @Column(name = "model", nullable = false)
    private String Model;
    @Column(name = "price", precision = 19, scale = 2, nullable = false)
    private BigDecimal Price;
    @Column(name = "fuel_type")
    private String FuelType;

    public Vehicle(String type, String model, BigDecimal price, String fuelType) {
        Type = type;
        Model = model;
        Price = price;
        FuelType = fuelType;
    }

    protected Vehicle() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getType() {
        return Type;
    }

    protected void setType(String type) {
        Type = type;
    }

    public String getModel() {
        return Model;
    }

    protected void setModel(String model) {
        Model = model;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    protected void setPrice(BigDecimal price) {
        Price = price;
    }

    public String getFuelType() {
        return FuelType;
    }

    protected void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Id=" + Id +
                ", Type='" + Type + '\'' +
                ", Model='" + Model + '\'' +
                ", Price=" + Price +
                ", FuelType='" + FuelType + '\'';
    }
}
