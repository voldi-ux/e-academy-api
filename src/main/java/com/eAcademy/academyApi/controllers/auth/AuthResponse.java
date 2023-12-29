package com.eAcademy.academyApi.controllers.auth;

public class AuthResponse {
	private String token;
    private String username;
  
    public AuthResponse(String token, String username) {
    	this(token);
    	this.username = username;
    }
    
	public AuthResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
	

}
