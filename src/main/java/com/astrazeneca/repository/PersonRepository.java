package com.astrazeneca.repository;

import org.springframework.data.repository.CrudRepository;

import com.astrazeneca.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
