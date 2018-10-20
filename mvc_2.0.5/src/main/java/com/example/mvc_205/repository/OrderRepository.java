/**
 * 
 */
package com.example.mvc_205.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mvc_205.model.Orders;

/**
 * @author bjit
 *
 */
public interface OrderRepository extends CrudRepository<Orders, Long> {

}
