package com.vamsee.dao;

import java.util.Set;

import com.vamsee.hibernate.entities.Person;


public interface PersonDao {
	public  Set<Person> getAllPersons();
	
	public Person getPersonByPersonId(Long personId);
	
	public void savePerson(Person person);
	
	
}
