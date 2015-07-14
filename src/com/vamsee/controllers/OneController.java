package com.vamsee.controllers;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



import com.vamsee.hibernate.entities.Address;
import com.vamsee.hibernate.entities.Contact;
import com.vamsee.hibernate.entities.EmploymentHistory;
import com.vamsee.hibernate.entities.FormData;
import com.vamsee.hibernate.entities.Person;
import com.vamsee.service.PersonService;

@Controller
public class OneController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getMyPage(){
		// add my person nobjects from db 
		
//		Person p = new Person("Test3", "Test", "Test3");
//		
//		Set<EmploymentHistory> employmentHistory = new HashSet<EmploymentHistory>();
//		
//		EmploymentHistory em = new EmploymentHistory("Test Client Name", "Test", "Test", "22182", "USA", p);
//		employmentHistory.add(em);
//		p.setEmploymentHistory(employmentHistory);
//		
//		Set<Address> address = new HashSet<Address>();
//		Address a = new Address("Person Address", "Person Address", "19131", "USA");
//		a.setPerson(p);
//		
//		Set<Contact> contact = new HashSet<Contact>();
//		Contact c = new Contact(p, a, "test@gmail.com", "1901234567890", "09875432");
//		a.setContact(c);
//		c.setAddress(a);
//		
//		address.add(a);
//		contact.add(c);
//		
//		p.setAddress(address);
//		p.setContact(contact);
//		
//		personService.persistPerson(p);
//		
		
		
		return new ModelAndView("home").addObject("persons", personService.getAllPersons());
	}	
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView getRegistration(){
		
		FormData fm = new FormData();
		return new ModelAndView("register").addObject("fm",fm);
	}
	
	@RequestMapping(value="/register",method= RequestMethod.POST)
	public ModelAndView getFormData(@ModelAttribute("fm")FormData fm)
	
	{
		ModelAndView mav = new ModelAndView();
		//person infromation
		Person fp = new Person(fm.getFirstName(), fm.getLastName(), fm.getCitizenShip());
		
		//Set the employment history
		Set<EmploymentHistory> fe = new HashSet<EmploymentHistory>();
		EmploymentHistory em = new EmploymentHistory(fm.getClientName(),fm.getClient1(), fm.getClient2(),fm.getClientzip(),fm.getClicountry(), fp);
		fe.add(em);
		fp.setEmploymentHistory(fe);
		
		// set the address
		Set<Address> address = new HashSet<Address>();
		Address a = new Address(fm.getAddr1(), fm.getAddr2(),fm.getZip(), fm.getCountry());
		a.setPerson(fp);
		
		//set contact
		Set<Contact> contact = new HashSet<Contact>();
		Contact c = new Contact(fp, a, fm.getEmail(),fm.getPrimaryPhone(),fm.getSecondaryPhone());
		a.setContact(c);
		c.setAddress(a);
		
		address.add(a);
		contact.add(c);
		
		fp.setAddress(address);
		fp.setContact(contact);
		
		personService.persistPerson(fp);
		
		System.out.println(fp);
		return mav;
	}
	
}
