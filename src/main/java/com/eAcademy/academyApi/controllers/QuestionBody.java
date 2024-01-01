package com.eAcademy.academyApi.controllers;

import java.util.List;

public class QuestionBody {

	    private String subject;
	    private int grade;
	    private String topic;
	    private int level;
	    private String description;
	    private boolean hasImage;
	    private List<String> imageLinks;
	    private List<String> options;
	    private int rightAnswerIndex;
	    private String explainnation;
	    
		public QuestionBody(String subject, int grade, String topic, int level, String description, boolean hasImage,
				List<String> imageLinks, List<String> options, int rightAnswerIndex, String explainnation) {
			super();
			this.subject = subject;
			this.grade = grade;
			this.topic = topic;
			this.level = level;
			this.description = description;
			this.hasImage = hasImage;
			this.imageLinks = imageLinks;
			this.options = options;
			this.rightAnswerIndex = rightAnswerIndex;
			this.explainnation = explainnation;
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

		public List<String> getImageLinks() {
			return imageLinks;
		}

		public void setImageLinks(List<String> imageLinks) {
			this.imageLinks = imageLinks;
		}

		public List<String> getOptions() {
			return options;
		}

		public void setOptions(List<String> options) {
			this.options = options;
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
