package io.usama.springboot.courseapi.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class VendorsService {

    @Autowired
    private VendorsRepository vendorsRepository;

    public List<Vendor> getVendors(){
        List<Vendor> vendors = new ArrayList<>();
        vendorsRepository.findAll().forEach(vendors::add);
        return vendors;
    }
    public Vendor getVendor(int id){
        if(vendorsRepository.existsById(id)){
            Iterator<Vendor> iterator = vendorsRepository.findAll().iterator();
            while (iterator.hasNext()) {
                Vendor v = iterator.next();
                if (v.getId() == id) {
                    return v;
                }
            }
        }
        return null;
    }
    public Vendor addVendor(Vendor vendor){
        return vendorsRepository.save(vendor);
    }
    public Vendor updateVendor(Vendor vendor, int id){
        if(vendorsRepository.existsById(id) && (vendor.getId() == id)){
            vendorsRepository.save(vendor);
            return vendor;
        }
        return null;
    }

    public void removeVendor(int id) {
        if(vendorsRepository.existsById(id))
            vendorsRepository.deleteById(id);
    }
}
