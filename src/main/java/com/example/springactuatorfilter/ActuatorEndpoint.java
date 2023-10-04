package com.example.springactuatorfilter;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Endpoint(id = "feature")
public class ActuatorEndpoint {

    @ReadOperation
    public Map<String, String> featureOperation() {
        return Map.of(
            "source", "actuator",
            "status", String.valueOf(TestFilter.CONTEXT.get())
        );
    }

}
