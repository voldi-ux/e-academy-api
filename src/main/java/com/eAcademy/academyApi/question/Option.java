package com.eAcademy.academyApi.question;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Option {
	@Id
	@GeneratedValue
	private long id;
	private String option;

	public Option() {} 
	public Option(long id, String option) {
		super();
		this.id = id;
		this.option = option;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

}
