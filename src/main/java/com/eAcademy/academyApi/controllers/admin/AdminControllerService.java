package com.eAcademy.academyApi.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.eAcademy.academyApi.admin.AdminDetails;
import com.eAcademy.academyApi.question.Answer;
import com.eAcademy.academyApi.question.Question;
import com.eAcademy.academyApi.repositories.AdminDetailsRepository;
import com.eAcademy.academyApi.repositories.QuestionRepository;
import com.eAcademy.academyApi.repositories.UserRepository;
import com.eAcademy.academyApi.student.StudentDetails;
import com.eAcademy.academyApi.users.User;

@Service
public class AdminControllerService {
   @Autowired
   QuestionRepository questionRepository;
   @Autowired
   UserRepository userRepository;
   @Autowired
   AdminDetailsRepository adminDetailsRepository;
   
   
	public Question createQuestion(Question question) {
	     User user = getAuthenticatedUser();
	     question.setAdminId(user.getId());
		return questionRepository.save(question); 
	}
	
	public AdminDetails getDetails(long adminId) {
		String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User user = userRepository.findByUsernameAndId(username, adminId).get();
		AdminDetails adminDetails = adminDetailsRepository.findByAdminId(user).get();
		return adminDetails;
	}
	
	// post an answer to a question
	public void postAnswer(Answer answer, long questionId) {
		
	} 
	
	//post a resource like a link to bursary information, books etc
	public void postResource(Resource resource) {
		
	}
	
	
	//approves a given question
	public void approveQuestion(long questionId) {}
	
	
	/**
	 * @return
	 */
	public User getAuthenticatedUser() {
         String username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
         return userRepository.findByUsername(username).get();
	}
  
}
