package com.reto3web.repository;

import com.reto3web.model.HairProducts;
import java.util.List;
import java.util.Optional;

import com.reto3web.model.HairProducts;
import com.reto3web.repository.crud.HairProductsCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandro Tacue
 */
@Repository
public class HairProductsRepository {
    @Autowired
    private HairProductsCrudRepository repository;

    public List<HairProducts> getAll() {
        return repository.findAll();
    }

    public Optional<HairProducts> getHairProducts(String reference) {
        return repository.findById(reference);
    }
    
    public HairProducts create(HairProducts hairProducts) {
        return repository.save(hairProducts);
    }

    public void update(HairProducts hairProducts) {
        repository.save(hairProducts);
    }
    
    public void delete(HairProducts hairProducts) {
        repository.delete(hairProducts);
    }
}
