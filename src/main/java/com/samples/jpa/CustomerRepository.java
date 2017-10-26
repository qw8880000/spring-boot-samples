package com.samples.jpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Administrator on 2017-10-26.
 */
// You don’t have to write an implementation of the repository interface.
// Spring Data JPA creates an implementation on the fly when you run the application.
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}

