package com.rheact.javazoos.repositories;

import com.rheact.javazoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepository extends CrudRepository<Zoo, Long> {
}
