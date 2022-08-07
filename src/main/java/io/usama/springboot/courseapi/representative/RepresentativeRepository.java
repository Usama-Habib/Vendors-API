package io.usama.springboot.courseapi.representative;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RepresentativeRepository extends CrudRepository<Representative,Integer> {
    public List<Representative> findByVendorId(int id);
}
