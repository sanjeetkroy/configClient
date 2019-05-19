package com.config.client.configClient.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProperties {

    @Autowired
    private Environment environment;

    @GetMapping("/rest/search/prod")
    public String getString(){
        return environment.getProperty("vehicle.default.model");
    }
}
