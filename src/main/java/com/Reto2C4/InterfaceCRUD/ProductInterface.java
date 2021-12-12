package com.Reto2C4.InterfaceCRUD;

import com.Reto2C4.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Home
 */
public interface ProductInterface extends MongoRepository<Product, Integer>{
    
}
