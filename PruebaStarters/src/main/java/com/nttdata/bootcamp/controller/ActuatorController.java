package com.nttdata.bootcamp.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RestControllerEndpoint(id="customEndPoint")
@RequestMapping("/")
public class ActuatorController {
    
	@GetMapping("/random")
    public ResponseEntity<String> customEndPoint() {
        return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
    }
}


