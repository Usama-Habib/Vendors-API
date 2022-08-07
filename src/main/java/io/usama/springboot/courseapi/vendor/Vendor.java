package io.usama.springboot.courseapi.vendor;

import io.usama.springboot.courseapi.representative.Representative;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vendor {
    @Id
    private int id;
    private String name;
    private String location;
    private String area_of_service;

    public Vendor(){

    }
    public Vendor(int id, String name, String location, String area_of_service) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.area_of_service = area_of_service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArea_of_service() {
        return area_of_service;
    }

    public void setArea_of_service(String area_of_service) {
        this.area_of_service = area_of_service;
    }

}
