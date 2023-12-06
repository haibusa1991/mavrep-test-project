package com.personal.mrt;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MrtController {

    @GetMapping
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }
}
