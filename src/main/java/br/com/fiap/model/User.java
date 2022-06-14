package br.com.fiap.model;

import java.time.LocalDate;

public class User {
	
	
	private String name = "emanuelle";
	private String username = "emanuelle";
	private String email = "emanuelle@gmail.com";
	private LocalDate birthday =  LocalDate.of(1989, 9, 14);
	private String password = "ffff23e";
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", email=" + email + ", birthday=" + birthday
				+ ", password=" + password + "]";
	}
	
	

}
