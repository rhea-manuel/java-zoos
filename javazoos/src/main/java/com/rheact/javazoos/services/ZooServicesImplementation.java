package com.rheact.javazoos.services;

import com.rheact.javazoos.models.Zoo;
import com.rheact.javazoos.repositories.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooServices")
public class ZooServicesImplementation implements ZooServices {
    @Autowired
    ZooRepository zooRepos;

    @Override
    public List<Zoo> allZoos(){
        List<Zoo> zoos = new ArrayList<>();
        zooRepos.findAll().iterator().forEachRemaining(zoos::add);

        return zoos;
    }


}
