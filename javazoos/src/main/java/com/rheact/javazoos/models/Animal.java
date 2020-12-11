package com.rheact.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "animals")
public class Animal extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private long animalid;

    @Column
    private String animaltype;

    @ManyToMany(mappedBy = "animals")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Set<Zoo> zoos = new HashSet<>();

    public Animal() {
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public Set<Zoo> getZoos() {
        return zoos;
    }

    public void setZoos(Set<Zoo> zoos) {
        this.zoos = zoos;
    }
}
