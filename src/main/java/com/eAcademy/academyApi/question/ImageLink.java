package com.eAcademy.academyApi.question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ImageLink {
	@Id
	private long id;
	private String link;

	public ImageLink( ) {}
	public ImageLink(long id, String link) {
		super();
		this.id = id;
		this.link = link;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
