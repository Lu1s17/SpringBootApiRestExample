package com.astrazeneca.service;

import java.util.List;

import com.astrazeneca.model.Person;

public interface PersonService {

	public void createPerson(Person person);

	public List<Person> getPersons();

	public Person getPerson(Long id);

	public Person updatePerson(Person person);

	public void deletePerson(Long id);

	public void deletePersons();
}
