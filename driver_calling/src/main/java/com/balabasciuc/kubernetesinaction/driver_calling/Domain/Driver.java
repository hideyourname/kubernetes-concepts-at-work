package com.balabasciuc.kubernetesinaction.driver_calling.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    @GeneratedValue
    private Long driverId;

    private String driverName;
    private String carBrand;

    protected Driver() {}

    public Driver(String driverName, String carBrand) {
        this.driverName = driverName;
        this.carBrand = carBrand;
    }

    public Long getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
