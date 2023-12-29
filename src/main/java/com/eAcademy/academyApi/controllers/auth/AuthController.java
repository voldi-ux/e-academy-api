package com.eAcademy.academyApi.controllers.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @Autowired
    AuthControllerService authControllerService;
	@PostMapping("/register-admin")
	public ResponseEntity<AuthResponse> registerAdmin(@Valid @RequestBody RegisterReqBody rbody) {
		return ResponseEntity.ok(authControllerService.registerAdmin(rbody));
	}
	
	@PostMapping("/register-student")
	public ResponseEntity<AuthResponse> registerStudent(@Valid @RequestBody RegisterReqBody rbody) {
		return ResponseEntity.ok(authControllerService.registerStudent(rbody));
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthBody rbody) {
		return ResponseEntity.ok(authControllerService.authenticate(rbody));
	}
	
	
}
