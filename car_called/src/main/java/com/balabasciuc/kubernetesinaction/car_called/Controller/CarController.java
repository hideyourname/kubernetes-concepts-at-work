package com.balabasciuc.kubernetesinaction.car_called.Controller;

import com.balabasciuc.kubernetesinaction.car_called.Domain.Car;
import com.balabasciuc.kubernetesinaction.car_called.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/cars")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.findById(id);
    }

    @PostMapping()
    public void save(@RequestBody Car car) {
        carService.save(car);
    }

    @GetMapping(value = "/all")
    public List<Car> findAllCars() {
        return carService.findAll();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCar(@PathVariable("id") Long id)
    {
        carService.deleteCar(id);
    }
}
