package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate_jpa_demo");
             EntityManager em = emf.createEntityManager()) {

            Car car1 = new Car("Sedan","Reno B35", BigDecimal.valueOf(364100),"oil95",4);
            Plane plane1 = new Plane("passenger's","Л-42М",BigDecimal.valueOf(3500000),"aviation gasolines",4);
            Truck truck1 = new Truck("cargo","Scania S-Series, 2020",BigDecimal.valueOf(2134545),"Disel",19000.0);
            Bike bike1 = new Bike("Castom","Harley-Davidson Softail Custom, 2007",BigDecimal.valueOf(138747308),"Petrol");
            try {
                em.getTransaction().begin();
                em.persist(car1);
                em.persist(plane1);
                em.persist(truck1);
                em.persist(bike1);
                em.getTransaction().commit();
                em.getTransaction().begin();
                for (int i = 1; i < 6; i++) 	{System.out.println(em.find(Vehicle.class,i));}
                em.getTransaction().commit();
            } catch (Exception e) {
                if (em.getTransaction() != null)
                    em.getTransaction().rollback();
                throw e;
            }
        }


    }
}