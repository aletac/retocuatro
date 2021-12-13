package com.reto3web.repository.crud;

import com.reto3web.model.User;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Alejandro Tacue
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);
    
    //Para seleccionar el usuario con el id maximo
    Optional<User> findTopByOrderByIdDesc();
}
