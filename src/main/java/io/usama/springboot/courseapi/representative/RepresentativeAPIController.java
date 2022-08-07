package io.usama.springboot.courseapi.representative;

import io.usama.springboot.courseapi.vendor.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RepresentativeAPIController {

    @Autowired
    private RepresentativeService representativeService;

    @RequestMapping("/vendors/{vendorId}/representatives")
    public List<Representative> getAllRepresentatives(@PathVariable int vendorId){
        return representativeService.getRepresentatives(vendorId);
    }

    @RequestMapping("/vendors/{vendorId}/representatives/{id}")
    public Representative getRepresentative(@PathVariable int id){
        return representativeService.getRepresentative(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/vendors/{vendorId}/representatives")
    public Representative addRepresentative(@RequestBody Representative representative, @PathVariable int vendorId){
        representative.setVendor(new Vendor(vendorId,"","",""));
        return representativeService.addRepresentative(representative);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/vendors/{vendorId}/representatives/{id}")
    public Representative updateRepresentative(@RequestBody Representative representative, @PathVariable int id, @PathVariable int vendorId){
        representative.setVendor(new Vendor(vendorId,"","",""));
        return representativeService.updateRepresentative(representative, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/vendors/{vendorId}/representatives/{id}")
    public void deleteRepresentative(@PathVariable int id){
        representativeService.removeRepresentative(id);
    }
}
