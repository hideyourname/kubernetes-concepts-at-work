package com.balabasciuc.kubernetesinaction.driver_calling.Domain;


public class DriverWithCar {

    private Driver driver;
    private CarDTO carDTO;

    protected DriverWithCar() {}

    public DriverWithCar(Driver driver, CarDTO carDTO) {
        this.driver = driver;
        this.carDTO = carDTO;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public CarDTO getCarDTO() {
        return carDTO;
    }

    public void setCarDTO(CarDTO carDTO) {
        this.carDTO = carDTO;
    }
}
