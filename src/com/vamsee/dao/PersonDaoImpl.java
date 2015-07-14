package com.vamsee.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vamsee.hibernate.entities.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public Set<Person> getAllPersons() {
		// TODO Auto-generated method stub
		Set<Person> persons = new HashSet<Person>();
		persons.addAll((List<Person>) sessionFactory.getCurrentSession().createQuery("from Person").list());
		return persons;
	}

	@Override
	public Person getPersonByPersonId(Long personId) {
		// TODO Auto-generated method stub
		return (Person) sessionFactory.getCurrentSession().get(Person.class, personId);
	}

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(person);
	}

	
	
	
}
