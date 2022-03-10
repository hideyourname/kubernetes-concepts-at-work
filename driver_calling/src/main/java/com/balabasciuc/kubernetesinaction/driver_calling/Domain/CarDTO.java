package com.balabasciuc.kubernetesinaction.driver_calling.Domain;

public class CarDTO {

    private String carBrand;
    private float carPrice;

    protected CarDTO() {}

    public CarDTO(String carBrand, float carPrice) {
        this.carBrand = carBrand;
        this.carPrice = carPrice;
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
