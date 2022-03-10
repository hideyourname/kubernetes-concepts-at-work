package com.balabasciuc.kubernetesinaction.simple_example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class KubeTestController {

    @GetMapping()
    public String working()
    {
        return "Hello from inside kubernetes!";
    }
}
