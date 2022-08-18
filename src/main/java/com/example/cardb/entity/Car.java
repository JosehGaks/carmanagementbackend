package com.example.cardb.entity;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    private String brand;
    private String model;
    private String color;
    private String registerNumber;

    @Column(name = "year")
    private Integer year;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;




    public Car() {
    }

    public Car(String brand, String model, String color, String registerNumber, Integer year, Integer price, Owner owner) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
