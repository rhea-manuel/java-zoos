package com.rheact.javazoos.services;

import com.rheact.javazoos.models.Animal;
import com.rheact.javazoos.repositories.AnimalRepository;
import com.rheact.javazoos.views.AnimalCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service(value = "animalServices")
public class AnimalServicesImplementation implements AnimalServices{

    @Autowired
    AnimalRepository animalRepos;

    @Override
    public List<AnimalCounts> animalCounts() {
        return animalRepos.animalCounts();
    }

    @Override
    public Animal getById(long id) {
        return animalRepos.getByAnimalid(id);
    }
}
