package com.eAcademy.academyApi.controllers.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eAcademy.academyApi.question.StudentQuestion;
import com.eAcademy.academyApi.student.StudentDetails;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @Autowired
    StudentControllerService studentControllerService;
    
    
	@PostMapping("/question")
    public ResponseEntity<StudentQuestion> postQuestion(@RequestBody StudentQuestion question) {
		ResponseEntity<StudentQuestion> responseEntity = new ResponseEntity<StudentQuestion>(studentControllerService.postQuestion(question),
				HttpStatus.CREATED);
		return responseEntity;
	}
	
	
	@GetMapping("/details/{studentId}")
	 public ResponseEntity<StudentDetails> getDetails(@PathVariable long studentId) {
		return ResponseEntity.ok( studentControllerService.getDetails(studentId));
	}
}
