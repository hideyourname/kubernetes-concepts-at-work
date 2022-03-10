package com.balabasciuc.kubernetesinaction.car_called.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long carId;

    private String carBrand;
    private float carPrice;


    protected Car() {}

    public Car(String carBrand, float carPrice) {
        this.carBrand = carBrand;
        this.carPrice = carPrice;
    }

    public Long getCarId() {
        return carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public float getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(float carPrice) {
        this.carPrice = carPrice;
    }
}
