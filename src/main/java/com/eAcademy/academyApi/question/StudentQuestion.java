package com.eAcademy.academyApi.question;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class StudentQuestion {
	@Id
	@GeneratedValue
	private long id;
	private long studentId;
	private String description;
	private String topic;
	private String subject;
	private int grade;
	@CreationTimestamp
	private Date createdDate;
	private boolean questionHasImage;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ImageLink> imageLinks;
	private boolean questionAnswered;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> answers;

	public StudentQuestion() {}
	public StudentQuestion(long id, long studentId, String description, String topic, String subject, int grade,
			Date createdDate, boolean questionHasImage, List<ImageLink> imageLinks, boolean questionAnswered,
			List<Answer> answers) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.description = description;
		this.topic = topic;
		this.subject = subject;
		this.grade = grade;
		this.createdDate = createdDate;
		this.questionHasImage = questionHasImage;
		this.imageLinks = imageLinks;
		this.questionAnswered = questionAnswered;
		this.answers = answers;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isQuestionHasImage() {
		return questionHasImage;
	}

	public void setQuestionHasImage(boolean questionHasImage) {
		this.questionHasImage = questionHasImage;
	}

	public List<ImageLink> getImageLinks() {
		return imageLinks;
	}

	public void setImageLinks(List<ImageLink> imageLinks) {
		this.imageLinks = imageLinks;
	}

	public boolean isQuestionAnswered() {
		return questionAnswered;
	}

	public void setQuestionAnswered(boolean questionAnswered) {
		this.questionAnswered = questionAnswered;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
