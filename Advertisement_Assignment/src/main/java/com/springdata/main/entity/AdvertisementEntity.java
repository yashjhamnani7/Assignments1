package com.springdata.main.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Advertisement_Master")
public class AdvertisementEntity {
	

	@Id
	@Column(name="advertisement_ID")
	long id;
	
	@Column(name = "advertisement_name")
	private String name;
	
	@Column(name = "advertisement_title")
	private String title;
	
	@Column(name = "advertisement_category")
	private String category;
	
	@Column(name = "adv_description")
	private String description;
	
	@Column(name = "advertisement_status")
	private String status;
	
	@Column(name="advertisement_postId")
	private String postId;
	
	@ManyToOne
	private UserEntity userEntity;
	
	@OneToMany
	@JoinColumn(name = "Message")
	private Set<MessageEntity> messageSet;
	

	
	public AdvertisementEntity() {
		super();
		// TODO Auto-generated constructor stub
		this.postId="";
		this.status="closed";
	}
	
	
	public AdvertisementEntity(long id,String name,String title, String category, String description,String postId, String status) {
		super();
		this.id=id;
		this.postId = postId;
		this.status = status;
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		
	}
	
	


	public AdvertisementEntity(long id,String name,String title, String category, String description) {
		super();
		this.title = title;
		this.name = name;
		this.category = category;
		this.description = description;
		this.id=id;
		this.postId="";
		this.status="closed";
		
	}
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public UserEntity getUserEntity() {
		return userEntity;
	}



	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	

	public Set<MessageEntity> getMessageSet() {
		return messageSet;
	}



	public void setMessageSet(Set<MessageEntity> messageSet) {
		this.messageSet = messageSet;
	}
	


	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdvertisementEntity other = (AdvertisementEntity) obj;
		if (this.id != other.getId())
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "AdvertisementEntity [id=" + id + ", name=" + name + ", title=" + title + ", category=" + category
				+ ", description=" + description + ", status=" + status + ", postId=" + postId + ", userEntity="
				+ userEntity +  "]";
	}
	

}
