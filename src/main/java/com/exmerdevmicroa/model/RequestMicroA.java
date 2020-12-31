package com.exmerdevmicroa.model;

public class RequestMicroA {
	private String name;
	private String lastname;
	private String email;
	private String pass;
	private String phone;
	public RequestMicroA() {
		
	}
	
	public RequestMicroA(String name, String lastname, String email, String pass, String phone) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.pass = pass;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "RequestMicroA [name=" + name + ", lastname=" + lastname + ", email=" + email + ", pass=" + pass
				+ ", phone=" + phone + "]";
	}


}
