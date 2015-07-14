package com.vamsee.hibernate.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3149465816018916406L;

	@Id
	@Column(name="personid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long personId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="citizenship")
	private String citizenship;
	
	@OneToMany(mappedBy="person",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<EmploymentHistory> employmentHistory;
	
	@OneToMany(mappedBy="person",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<Address> address;
	
	@OneToMany(mappedBy="person",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<Contact> contact;
	
	public Set<Contact> getContact(){
		return contact;
	}

	public void setContact(Set<Contact> contact){
		this.contact = contact;
	}

	public Set<Address> getAddress(){
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<EmploymentHistory> getEmploymentHistory() {
		return employmentHistory;
	}

	public void setEmploymentHistory(Set<EmploymentHistory> employmentHistory) {
		this.employmentHistory = employmentHistory;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", citizenship=" + citizenship
				+ "]";
	}

	public Person(String firstName, String lastName, String citizenship) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.citizenship = citizenship;
	}

	public Person() {
		super();
	}
	

	
	
}
