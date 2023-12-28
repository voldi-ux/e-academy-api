package com.eAcademy.academyApi.question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reaction {
	@Id
	private long id;
	private long likeCount;
	private long dislikeCount;

	public Reaction(long id, long likeCount, long dislikeCount) {
		super();
		this.id = id;
		this.likeCount = likeCount;
		this.dislikeCount = dislikeCount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(long likeCount) {
		this.likeCount = likeCount;
	}

	public long getDislikeCount() {
		return dislikeCount;
	}

	public void setDislikeCount(long dislikeCount) {
		this.dislikeCount = dislikeCount;
	}

}
