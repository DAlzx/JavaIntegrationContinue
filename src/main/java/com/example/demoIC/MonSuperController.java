package com.example.demoIC;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonSuperController {
    @RequestMapping(path = "/bob")
    public ResponseEntity <Coucou> getBob() {
        return new ResponseEntity(new Coucou("salam a tous les frr"), HttpStatus.OK);
    }
}