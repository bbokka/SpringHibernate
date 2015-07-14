package com.vamsee.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employment_history")
public class EmploymentHistory  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4259830908295069948L;

	@Id
	@Column(name="employment_history_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long employmentHistoryId;
	
	@Column(name="client_name")
	private String clientName;
	
	@Column(name="client_address1")
	private String clientAddress1;
	
	@Column(name="client_address2")
	private String clientAddress2;
	
	public Long getEmploymentHistoryId() {
		return employmentHistoryId;
	}

	public void setEmploymentHistoryId(Long employmentHistoryId) {
		this.employmentHistoryId = employmentHistoryId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientAddress1() {
		return clientAddress1;
	}




	public void setClientAddress1(String clientAddress1) {
		this.clientAddress1 = clientAddress1;
	}




	public String getClientAddress2() {
		return clientAddress2;
	}




	public void setClientAddress2(String clientAddress2) {
		this.clientAddress2 = clientAddress2;
	}




	public String getClientZip() {
		return clientZip;
	}




	public void setClientZip(String clientZip) {
		this.clientZip = clientZip;
	}




	public String getClientCountry() {
		return clientCountry;
	}




	public void setClientCountry(String clientCountry) {
		this.clientCountry = clientCountry;
	}




	public Person getPerson() {
		return person;
	}




	public void setPerson(Person person) {
		this.person = person;
	}




	@Column(name="client_zip")
	private String clientZip;
	
	@Column(name="client_country")
	private String clientCountry;
	
	
	
	
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person;

	public EmploymentHistory(String clientName, String clientAddress1,
			String clientAddress2, String clientZip, String clientCountry,
			Person person) {
		super();
		this.clientName = clientName;
		this.clientAddress1 = clientAddress1;
		this.clientAddress2 = clientAddress2;
		this.clientZip = clientZip;
		this.clientCountry = clientCountry;
		this.person = person;
	}

	public EmploymentHistory() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
