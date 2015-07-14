package com.vamsee.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8823617534983440621L;

	@Id
	@Column(name="contact_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long contactId;
	
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person;
	
	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getSecondaryPhone() {
		return secondaryPhone;
	}

	public void setSecondaryPhone(String secondaryPhone) {
		this.secondaryPhone = secondaryPhone;
	}

	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(name="email")
	private String email;
	
	@Column(name="primary_phone")
	private String primaryPhone;
	
	public Contact(Person person, Address address, String email,
			String primaryPhone, String secondaryPhone) {
		super();
		this.person = person;
		this.address = address;
		this.email = email;
		this.primaryPhone = primaryPhone;
		this.secondaryPhone = secondaryPhone;
	}

	@Column(name="secondary_phone")
	private String secondaryPhone;

	public Contact() {
		super();
	}
	
	
	
	

}
