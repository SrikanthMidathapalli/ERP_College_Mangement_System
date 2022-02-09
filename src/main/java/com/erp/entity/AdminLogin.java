package com.erp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "adminlogincredential")
@Setter
@Getter
public class AdminLogin {
	@Id
	private String email; ;
	private String password;
		
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLogin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
}
