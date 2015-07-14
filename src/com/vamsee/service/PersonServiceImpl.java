package com.vamsee.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamsee.dao.PersonDao;
import com.vamsee.hibernate.entities.Person;
@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public Set<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personDao.getAllPersons();
	}

	@Override
	public void persistPerson(Person person) {
		// TODO Auto-generated method stub
		personDao.savePerson(person);
		
	}

	@Override
	public Person getPersonByPersonId(Long id) {
		// TODO Auto-generated method stub
		return personDao.getPersonByPersonId(id);
	}

}
