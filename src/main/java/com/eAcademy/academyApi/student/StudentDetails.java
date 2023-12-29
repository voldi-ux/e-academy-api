package com.eAcademy.academyApi.student;

import java.util.List;

import com.eAcademy.academyApi.question.QuestionPractice;
import com.eAcademy.academyApi.question.StudentQuestion;
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
public class StudentDetails {

	@Id
	@GeneratedValue
	private long id;
	private String firstname;
	private String lastname;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToOne
	private User studentId;

	@OneToMany
	private List<QuestionPractice> questionsDone;
	@OneToMany
	private List<StudentQuestion> questionsPosted;
	private int grade;
	private String school;

	public StudentDetails() {
		super();
	}

	public StudentDetails(long id, String firstname, String lastname, List<QuestionPractice> questionsDone, int grade,
			String school, Gender gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.questionsDone = questionsDone;
		this.grade = grade;
		this.school = school;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public List<QuestionPractice> getQuestionsDone() {
		return questionsDone;
	}

	public void setQuestionsDone(List<QuestionPractice> questionsDone) {
		this.questionsDone = questionsDone;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	public  User getStudentId() {
		return studentId;
	}

	public void setStudentId(User userId) {
		this.studentId = userId;
	}
    
    
}
