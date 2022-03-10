package com.balabasciuc.kubernetesinaction.driver_calling.Controller;

import com.balabasciuc.kubernetesinaction.driver_calling.Domain.Driver;
import com.balabasciuc.kubernetesinaction.driver_calling.Domain.DriverWithCar;
import com.balabasciuc.kubernetesinaction.driver_calling.Service.DriverService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/driver")
public class DriverController {

    private final DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public String greet()
    {
        return "sal";
    }

    @PostMapping
    public void save(@RequestBody Driver driver)
    {
        driverService.save(driver);
    }

    @GetMapping(value = "/{id}")
    public Driver findDriver(@PathVariable ("id") Long id)
    {
        return driverService.findById(id);
    }

    @GetMapping(value = "/both/{id}")
    public DriverWithCar getBothOfThem(@PathVariable Long id)
    {
        return driverService.findBoth(id);
    }

}
