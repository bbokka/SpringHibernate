package com.vamsee.hibernate.entities;

public class FormData{
	
	//person data
	private String firstName;
	
	private String lastName;
	
	private String citizenShip;
	
	//employement history
	private String clientName;
	
	private String client1;
	
	private String client2;
	
	private String clientzip;
	
	private String clicountry;
	
	//address information
	
	private String addr1;
	
	private String addr2;
	
	private String zip;
	
	private String country;
	
	// contact information
	
	private String email;
	
	private String primaryPhone;
	
	private String secondaryPhone;

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

	public String getCitizenShip() {
		return citizenShip;
	}

	public void setCitizenShip(String citizenShip) {
		this.citizenShip = citizenShip;
	}
	
	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClient1() {
		return client1;
	}

	public void setClient1(String client1) {
		this.client1 = client1;
	}

	public String getClient2() {
		return client2;
	}

	public void setClient2(String client2) {
		this.client2 = client2;
	}

	public String getClientzip() {
		return clientzip;
	}

	public void setClientzip(String clientzip) {
		this.clientzip = clientzip;
	}

	public String getClicountry() {
		return clicountry;
	}

	public void setClicountry(String clicountry) {
		this.clicountry = clicountry;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@Override
	public String toString() {
		return "FormData [firstName=" + firstName + ", lastName=" + lastName
				+ ", citizenShip=" + citizenShip + ", client1=" + client1
				+ ", client2=" + client2 + ", clientzip=" + clientzip
				+ ", clicountry=" + clicountry + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", zip=" + zip + ", country=" + country
				+ ", email=" + email + ", primaryPhone=" + primaryPhone
				+ ", secondaryPhone=" + secondaryPhone + "]";
	}

	
}