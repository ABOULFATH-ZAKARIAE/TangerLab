package com.gestion.employee.sql;
import java.sql.DriverManager;


import java.sql.SQLException;

import java.sql.Connection;

public class Configuration {
	private String url;
	private String username;
	private String password;
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
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
	
	public Configuration(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public Configuration() {
		
	}
	
	public Connection connect() throws SQLException {
		
		Connection conn = DriverManager.getConnection(this.url,this.username,this.password);
		return conn;
		
	}
}
	