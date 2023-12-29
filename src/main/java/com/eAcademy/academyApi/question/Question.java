package com.eAcademy.academyApi.question;

import java.util.Date;
import java.util.List;

import com.eAcademy.academyApi.users.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@GeneratedValue
	private long id;
    private long adminId;
    private String subject;
    private int grade;
    private String topic;
    private int level;
    private Date createdDate;
    private String description;
    private boolean hasImage;
    @OneToMany
    private List<ImageLink> imageLinks;
    @OneToMany
    private List<Option> options;
    @OneToOne
    private User approver;
    private int rightAnswerIndex;
    private String explainnation;
   
	public Question() {
	}

	public Question(long id, long adminId, String subject, int grade, String topic, int level, Date createdDate,
			String description, boolean hasImage, List<ImageLink> imageLinks, List<Option> options, User approver,
			int rightAnswerIndex, String explainnation) {
		super();
		this.id = id;
		this.adminId = adminId;
		this.subject = subject;
		this.grade = grade;
		this.topic = topic;
		this.level = level;
		this.createdDate = createdDate;
		this.description = description;
		this.hasImage = hasImage;
		this.imageLinks = imageLinks;
		this.options = options;
		this.approver = approver;
		this.rightAnswerIndex = rightAnswerIndex;
		this.explainnation = explainnation;
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

	public boolean isHasImage() {
		return hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}

	public List<ImageLink> getImageLinks() {
		return imageLinks;
	}

	public void setImageLinks(List<ImageLink> imageLinks) {
		this.imageLinks = imageLinks;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
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

	public String getExplainnation() {
		return explainnation;
	}

	public void setExplainnation(String explainnation) {
		this.explainnation = explainnation;
	}
	
}
