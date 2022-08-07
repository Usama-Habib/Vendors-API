package io.usama.springboot.courseapi.representative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class RepresentativeService {

    @Autowired
    private RepresentativeRepository representativeRepository;

    public List<Representative> getRepresentatives(int vendorId){
        List<Representative> representatives = new ArrayList<>();
        representativeRepository.findByVendorId(vendorId).forEach(representatives::add);
        return representatives;
    }
    public Representative getRepresentative(int id){
        if(representativeRepository.existsById(id)){
            Iterator<Representative> iterator = representativeRepository.findAll().iterator();
            while (iterator.hasNext()) {
                Representative r = iterator.next();
                if (r.getId() == id) {
                    return r;
                }
            }
        }
        return null;
    }
    public Representative addRepresentative(Representative representative){
        return representativeRepository.save(representative);
    }
    public Representative updateRepresentative(Representative representative, int id){
        if(representativeRepository.existsById(id) && (representative.getId() == id)){
            representativeRepository.save(representative);
            return representative;
        }
        return null;
    }

    public void removeRepresentative(int id) {
        if(representativeRepository.existsById(id))
            representativeRepository.deleteById(id);
    }
}
