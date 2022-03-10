package com.balabasciuc.kubernetesinaction.driver_calling.CallingConfiguration;

import com.balabasciuc.kubernetesinaction.driver_calling.Domain.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class DriverCallingCar {

    private RestTemplate restTemplate;

    @Autowired
    public DriverCallingCar(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CarDTO callingDriver(Long id)
    {
        String uri = "http://car-called-service:7000/cars/";
       return restTemplate.getForObject(uri + id, CarDTO.class);
    }

}
