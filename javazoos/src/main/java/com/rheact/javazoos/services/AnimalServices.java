package com.rheact.javazoos.services;

import com.rheact.javazoos.models.Animal;
import com.rheact.javazoos.views.AnimalCounts;

import java.util.List;

public interface AnimalServices {
    List<AnimalCounts> animalCounts();
    Animal getById(long id);
}
