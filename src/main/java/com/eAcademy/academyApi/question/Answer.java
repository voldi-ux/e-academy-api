package com.eAcademy.academyApi.question;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Answer {
	@Id
	@GeneratedValue
	private long id;
	private long adminId;
	private Date createdDate;
	@OneToMany
	private List<Reaction> reactions;
	private String description;
	private boolean hasImage;
	@OneToMany
	private List<ImageLink> imageLinks;

	public Answer() {
	}

	public Answer(long id, long adminId, Date createdDate, List<Reaction> reactions, String description,
			boolean hasImage, List<ImageLink> links) {
		super();
		this.id = id;
		this.adminId = adminId;
		this.createdDate = createdDate;
		this.reactions = reactions;
		this.description = description;
		this.hasImage = hasImage;
		this.imageLinks = links;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public List<Reaction> getReactions() {
		return reactions;
	}

	public void setReactions(List<Reaction> reactions) {
		this.reactions = reactions;
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

	public void setImageLinks(List<ImageLink> links) {
		this.imageLinks = links;
	}
}
