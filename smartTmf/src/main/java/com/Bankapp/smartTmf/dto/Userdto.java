package com.Bankapp.smartTmf.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_data")
public class Userdto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="userid")
    private Integer userid;
	@Column(unique = true)
	private String Username;
	@Column()
	private String Address;
	@Column()
	private Integer Phone_No;
	@Column()
	private String email;
	@Column()
	private String password;
	@Column()
	private String ConfirmPassword;
	public Userdto(Integer userid, String username, Integer phone_No, String address, String email, String password,
			String confirmPassword) {
		super();
		this.userid = userid;
		Username = username;
		Phone_No = phone_No;
		Address = address;
		this.email = email;
		this.password = password;
		ConfirmPassword = confirmPassword;
	}
	public Userdto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public Integer getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(Integer phone_No) {
		Phone_No = phone_No;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
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
	public String getConfirmPassword() {
		return ConfirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		ConfirmPassword = confirmPassword;
	}
	
	
}