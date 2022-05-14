package com.practice.airplane.store.entity;


import com.practice.airplane.store.dto.FullName;

import javax.persistence.*;

@Entity
@Table(name = "customer_tbl")
public class CustomerEntity {
	@Id
	@GeneratedValue
	@Column
	private int cid;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private FullName fullName;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String gender;

	public int getCid() {
		return cid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ProfileEntity [cid=" + cid + ", username=" + username + ", password=" + password + ", fullName="
				+ fullName + ", email=" + email + ", phone=" + phone + "]";
	}

	public CustomerEntity(int cid, String username, String password, FullName fullName, String email, String phone) {
		super();
		this.cid = cid;
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.email = email;
		this.phone = phone;
	}

	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
