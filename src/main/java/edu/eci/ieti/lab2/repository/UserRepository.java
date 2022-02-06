/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.ieti.lab2.repository;

import edu.eci.ieti.lab2.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jgarc
 */
public interface UserRepository extends MongoRepository<User, String > {
    
}
