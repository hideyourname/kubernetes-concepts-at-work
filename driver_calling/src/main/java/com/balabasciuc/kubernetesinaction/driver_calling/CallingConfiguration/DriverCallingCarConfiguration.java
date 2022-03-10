package com.balabasciuc.kubernetesinaction.driver_calling.CallingConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DriverCallingCarConfiguration {

        @Bean
        public RestTemplate restTemplate()
        {
            return new RestTemplate();
        }
}
