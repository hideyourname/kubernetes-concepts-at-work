package com.balabasciuc.kubernetesinaction.driver_calling.Service;

import com.balabasciuc.kubernetesinaction.driver_calling.CallingConfiguration.DriverCallingCar;
import com.balabasciuc.kubernetesinaction.driver_calling.Domain.CarDTO;
import com.balabasciuc.kubernetesinaction.driver_calling.Domain.Driver;
import com.balabasciuc.kubernetesinaction.driver_calling.Domain.DriverWithCar;
import com.balabasciuc.kubernetesinaction.driver_calling.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {

    private final DriverRepository driverRepository;
    private final DriverCallingCar driverCallingCar;

    @Autowired
    public DriverService(DriverRepository driverRepository, DriverCallingCar driverCallingCar) {
        this.driverRepository = driverRepository;
        this.driverCallingCar = driverCallingCar;
    }

    public void save(Driver driver) {
        driverRepository.save(driver);
    }

    public Driver findById(Long id) {
        return driverRepository.findById(id).get();
    }


    public DriverWithCar findBoth(Long id) {
        Driver driver = findById(id);
        CarDTO carDTO = driverCallingCar.callingDriver(driver.getDriverId());
        return new DriverWithCar(driver, carDTO);
    }
}
