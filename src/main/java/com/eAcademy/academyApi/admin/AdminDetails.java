package com.eAcademy.academyApi.admin;

import java.util.List;

import com.eAcademy.academyApi.question.Answer;
import com.eAcademy.academyApi.question.Question;
import com.eAcademy.academyApi.users.Gender;
import com.eAcademy.academyApi.users.User;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class AdminDetails {
	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@OneToOne
	private User adminId;
	@OneToMany
	private List<Answer> answers;
	@OneToMany
	private List<Question> questionsCreated;
	@OneToMany
	private List<Question> questionsVerified;
    
	public AdminDetails() {}
	public AdminDetails(String firstname, String lastname, Gender gender, User adminId, List<Answer> answers,
			List<Question> questionsCreated, List<Question> questionsVerified) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.adminId = adminId;
		this.answers = answers;
		this.questionsCreated = questionsCreated;
		this.questionsVerified = questionsVerified;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public User getAdminId() {
		return adminId;
	}

	public void setAdminId(User adminId) {
		this.adminId = adminId;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public List<Question> getQuestionsCreated() {
		return questionsCreated;
	}

	public void setQuestionsCreated(List<Question> questionsCreated) {
		this.questionsCreated = questionsCreated;
	}

	public List<Question> getQuestionsVerified() {
		return questionsVerified;
	}

	public void setQuestionsVerified(List<Question> questionsVerified) {
		this.questionsVerified = questionsVerified;
	}

}
