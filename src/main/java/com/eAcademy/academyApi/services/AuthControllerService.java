package com.eAcademy.academyApi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.eAcademy.academyApi.admin.AdminDetails;
import com.eAcademy.academyApi.controllers.auth.AuthBody;
import com.eAcademy.academyApi.controllers.auth.AuthResponse;
import com.eAcademy.academyApi.controllers.auth.RegisterReqBody;
import com.eAcademy.academyApi.repositories.AdminDetailsRepository;
import com.eAcademy.academyApi.repositories.StudentDetailsRepository;
import com.eAcademy.academyApi.repositories.UserRepository;
import com.eAcademy.academyApi.security.jwt.JwtService;
import com.eAcademy.academyApi.student.StudentDetails;
import com.eAcademy.academyApi.users.Role;
import com.eAcademy.academyApi.users.User;

@Component
public class AuthControllerService {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserRepository userRepo;
	@Autowired
	AdminDetailsRepository adminRepo;
	@Autowired
	StudentDetailsRepository studentRepo;
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	JwtService jwtService;

	public AuthResponse registerAdmin(RegisterReqBody rbody) {
		User savedUser = saveUser(rbody, List.of(Role.ADMIN, Role.STUDENT));
		// building  details from the user
		AdminDetails adminDetails = new AdminDetails();
		adminDetails.setLastname(rbody.getLastname());
		adminDetails.setFirstname(rbody.getFirstname());
		adminDetails.setGender(rbody.getGender());
		adminDetails.setAdminId(savedUser);
		adminRepo.save(adminDetails);
		String token = jwtService.generateJwtToken(savedUser);

		return new AuthResponse(token);

	}

	public AuthResponse registerStudent(RegisterReqBody rbody) {

		User savedUser = saveUser(rbody, List.of(Role.STUDENT));

		// building  details from the user
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setLastname(rbody.getLastname());
		studentDetails.setFirstname(rbody.getFirstname());
		studentDetails.setGender(rbody.getGender());
		studentDetails.setStudentId(savedUser);
		studentDetails.setSchool(rbody.getSchool());

		studentRepo.save(studentDetails);
		String token = jwtService.generateJwtToken(savedUser);

		return new AuthResponse(token);

	}

	/**
	 * @param rbody
	 * @return
	 */
	public User saveUser(RegisterReqBody rbody, List<Role> roles) {
		User user = new User();
		user.setEmail(rbody.getEmail());
		user.setPassword(passwordEncoder.encode(rbody.getPassword()));
		user.setRoles(roles);
		user.setUsername(rbody.getUsername());
		User savedUser = userRepo.save(user);
		return savedUser;
	}

	public AuthResponse authenticate(AuthBody rbody) {

		// we are creating an unauthenticated auth object
		UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(rbody.getUsername(),
				rbody.getPassword());
		//Here we are authenticating the auth object
		User user = (User) authenticationManager.authenticate(auth).getPrincipal(); // this line throws an error when
																					// authenticatin fails
		String token = jwtService.generateJwtToken(user);

		return new AuthResponse(token);

	}

}
