package com.vamsee.service;

import java.util.Set;


import com.vamsee.hibernate.entities.Person;


public interface PersonService {

	public Set<Person> getAllPersons();
	
	public void persistPerson(Person person);
	
	public Person getPersonByPersonId(Long id);
}
