package com.rheact.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable = false, unique = true)
    private long zooid;

    @Column
    private String zooname;

    @OneToMany(mappedBy = "zoo",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    private List<Telephone> telephones = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "zooanimals",
            joinColumns = @JoinColumn(name = "zooid"),
            inverseJoinColumns = @JoinColumn(name = "animalid")
    )
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Set<Animal> animals =new HashSet<>();

//    Default constructor
    public Zoo() {
    }

//    Getters and Setters
    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
