package com.eAcademy.academyApi.controllers.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.eAcademy.academyApi.question.StudentQuestion;
import com.eAcademy.academyApi.repositories.StudentDetailsRepository;
import com.eAcademy.academyApi.repositories.StudentQuestionRepository;
import com.eAcademy.academyApi.repositories.UserRepository;
import com.eAcademy.academyApi.student.StudentDetails;
import com.eAcademy.academyApi.users.User;

@Service
public class StudentControllerService {
	@Autowired
	private StudentQuestionRepository studentQuestionRepo;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private StudentDetailsRepository studentDetailsRepository;

	public StudentQuestion postQuestion(StudentQuestion question) {
		return studentQuestionRepo.save(question);
	}

	public void reactToAnswer(long answerId, int reactionValue) {
	}

	public StudentDetails getDetails(long studentId) {
		String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = userRepository.findByUsernameAndId(username, studentId).get();
		StudentDetails studentDetails = studentDetailsRepository.findByStudentId(user).get();
		return studentDetails;
	}

}
