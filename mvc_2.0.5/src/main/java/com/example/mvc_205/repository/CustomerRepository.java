/**
 * 
 */
package com.example.mvc_205.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mvc_205.model.Customer;

/**
 * @author bjit
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
