package com.eAcademy.academyApi.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eAcademy.academyApi.admin.AdminDetails;
import com.eAcademy.academyApi.question.Question;
import com.eAcademy.academyApi.student.StudentDetails;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
	@Autowired
	AdminControllerService adminControllerService;
	
	//endpoint for creating questions
	@PostMapping("/question")
	public ResponseEntity<Question> createQuestion(@RequestBody Question qBody) {
		System.out.println("creating question");
		return ResponseEntity.ok(adminControllerService.createQuestion(qBody));
	}

	//endpoint for getting admin details
	@GetMapping("/details/{adminId}")
	 public ResponseEntity<AdminDetails> getDetails(@PathVariable long adminId) {
		return ResponseEntity.ok(adminControllerService.getDetails(adminId));
	}
}
