package io.usama.springboot.courseapi.representative;

import io.usama.springboot.courseapi.vendor.Vendor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Representative {
    @Id
    private int id;
    private String name;
    private String department;
    @ManyToOne
    private Vendor vendor;

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Representative(){

    }

    public Representative(int id, String name, String department, int vendor_id) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.vendor = new Vendor(vendor_id,"","","");
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
