package io.usama.springboot.courseapi.vendor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorsAPIController {

    @Autowired
    private VendorsService vendorsService;

    @RequestMapping("/vendors")
    public List<Vendor> getAllVendors(){
        return vendorsService.getVendors();
    }

    @RequestMapping("/vendors/{id}")
    public Vendor getVendor(@PathVariable int id){
        return vendorsService.getVendor(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/vendors")
    public Vendor addVendor(@RequestBody Vendor vendor){
        return vendorsService.addVendor(vendor);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/vendors/{id}")
    public Vendor updateVendor(@RequestBody Vendor vendor, @PathVariable int id){
        return vendorsService.updateVendor(vendor, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/vendors/{id}")
    public void deleteVendor(@PathVariable int id){
        vendorsService.removeVendor(id);
    }
}
