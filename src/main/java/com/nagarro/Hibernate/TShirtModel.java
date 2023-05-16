package com.nagarro.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TshirtModel")

public class TShirtModel {

	@Id
    private String id;
    private String name;
    private String colour;
    private String gender;
    private String size;
    private float price;
    private float rating;
    private String availability;

    public TShirtModel() {}
    public TShirtModel(String id, String name, String colour, String gender, String size, float price, float rating,
                       String availability) {
        super();
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.gender = gender;
        this.size = size;
        this.price = price;
        this.rating = rating;
        this.availability = availability;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public float getRating() {
        return rating;
    }

    public String getAvailability() {
        return availability;
    }

}
