package com.eAcademy.academyApi.question;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import com.eAcademy.academyApi.users.User;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class Question {
	@Id
	@GeneratedValue
	private long id;
	private long adminId;
	@Size(min = 2, message = "subject length must be more than two characters")
	private String subject;
	@Positive
	private int grade;
	private String topic;
	@Positive
	private int level;
	@CreationTimestamp
	private Date createdDate;
	@Size(min = 20, message = "description length must be more than 19 characters")
	@Column(columnDefinition="LONGTEXT")
	private String description;
//	private boolean hasImage;
	private boolean isApproved;
//	@OneToMany(cascade = CascadeType.ALL)
//	@Nonnull
//	private List<ImageLink> imageLinks;
	@Nonnull
	private List<String> options;
	@OneToOne
	private User approver;
	@Positive
	private int rightAnswerIndex;
	@Column(columnDefinition="LONGTEXT")
	@Size(min = 20, message = "explainnation length must be more than 19 characters")
	private String explanation;

	public Question() {
	}

	public Question(long id, long adminId, String subject, int grade, String topic, int level, Date createdDate,
			String description, List<String> options, User approver,
			int rightAnswerIndex, String explanation, boolean isApproved) {
		super();
		this.id = id;
		this.adminId = adminId;
		this.subject = subject;
		this.grade = grade;
		this.topic = topic;
		this.level = level;
		this.createdDate = createdDate;
		this.description = description;
		this.options = options;
		this.approver = approver;
		this.rightAnswerIndex = rightAnswerIndex;
		this.explanation = explanation;
		this.isApproved = isApproved;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
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

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public User getApprover() {
		return approver;
	}

	public void setApprover(User approver) {
		this.approver = approver;
	}

	public int getRightAnswerIndex() {
		return rightAnswerIndex;
	}

	public void setRightAnswerIndex(int rightAnswerIndex) {
		this.rightAnswerIndex = rightAnswerIndex;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

}
