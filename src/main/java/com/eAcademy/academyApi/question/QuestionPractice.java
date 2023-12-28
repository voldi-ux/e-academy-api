package com.eAcademy.academyApi.question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class QuestionPractice {
    @Id  
	private long id;
    private String questionId;
    private boolean isCorrect;
   
    public QuestionPractice() {}
    
	public QuestionPractice(long id, String questionId, boolean isCorrect) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.isCorrect = isCorrect;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public boolean isCorrect() {
		return isCorrect;
	}
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
    
    
}
