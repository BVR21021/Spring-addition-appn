package com.venky.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	private Integer eid;
	private String name;
	private String password;
	private String email;
	private String address;
	public Employee(Integer eid, String name, String password, String email, String address) {
		super();
		this.eid = eid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [getEid()=" + getEid() + ", getName()=" + getName() + ", getPassword()=" + getPassword()
				+ ", getEmail()=" + getEmail() + ", getAddress()=" + getAddress() + "]";
	}
	
	

}
