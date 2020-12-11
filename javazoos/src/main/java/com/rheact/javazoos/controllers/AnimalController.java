package com.rheact.javazoos.controllers;

import com.rheact.javazoos.models.Animal;
import com.rheact.javazoos.services.AnimalServices;
import com.rheact.javazoos.views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalServices animalServices;

    @GetMapping(value = "count", produces = "application/json")
    public ResponseEntity<?> getCount(){
        List<AnimalCounts> counts = animalServices.animalCounts();
        return new ResponseEntity<>(counts, HttpStatus.OK);
    }

    @GetMapping(value = "/animal/{id}", produces = "application/json")
    public ResponseEntity<?> getAnimalById(@PathVariable long id){
        Animal animal = animalServices.getById(id);
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }
}
