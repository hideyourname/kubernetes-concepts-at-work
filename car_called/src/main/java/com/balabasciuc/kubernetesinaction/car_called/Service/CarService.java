package com.balabasciuc.kubernetesinaction.car_called.Service;

import com.balabasciuc.kubernetesinaction.car_called.Domain.Car;
import com.balabasciuc.kubernetesinaction.car_called.Repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    public Car findById(Long id) {
        return carRepository.findById(id).get();
    }

    public void save(Car car) {
        carRepository.save(car);
    }

    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
