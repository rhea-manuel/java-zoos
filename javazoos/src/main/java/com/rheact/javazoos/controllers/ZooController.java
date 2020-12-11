package com.rheact.javazoos.controllers;

import com.rheact.javazoos.models.Zoo;
import com.rheact.javazoos.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/zoos")
public class ZooController {
    @Autowired
    private ZooServices zooServices;

    @GetMapping(value = "/zoos", produces = "application/json")
    public ResponseEntity<?> getAllZoos(){
        List<Zoo> zoos = zooServices.allZoos();
        return new ResponseEntity<>(zoos, HttpStatus.OK);
    }



}
