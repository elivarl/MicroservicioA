package com.exmerdevmicroa.model;
public class RequestMicroservicioB {
	//name, lastname y phone
	private String name;
	private String lastname;
	private String phone;
	public RequestMicroservicioB() {

	}
	public RequestMicroservicioB(String name, String lastname, String phone) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "DatosMicroservicioB [name=" + name + ", lastname=" + lastname + ", phone=" + phone + "]";
	}		
}
