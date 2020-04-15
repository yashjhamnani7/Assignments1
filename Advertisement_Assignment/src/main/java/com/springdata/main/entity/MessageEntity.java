package com.springdata.main.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Messages_Master")
public class MessageEntity {
	
	@Id
	@Column(name = "message_id")
	private long id;
	
	@Column(name = "message_content")
	private String message;
	
	@ManyToOne
	private UserEntity userMessage;
	
	@ManyToOne
	private AdvertisementEntity Advertisement;
	
	@Column(name ="date_of_message")
	private LocalDateTime dateMessage;
	
	public MessageEntity() {
		super();
		
	}
	public MessageEntity(long id, String message,LocalDateTime dateMessage) {
		super();
		this.id = id;
		this.message = message;
		this.dateMessage=dateMessage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserEntity getUserSendingMessage() {
		return userMessage;
	}
	public void setUserSendingMessage(UserEntity userMessage) {
		this.userMessage = userMessage;
	}
	public AdvertisementEntity getForAdvertisement() {
		return Advertisement;
	}
	public void setForAdvertisement(AdvertisementEntity Advertisement) {
		this.Advertisement = Advertisement;
	}
	
	
	public LocalDateTime getDateAndTimeOfMessage() {
		return dateMessage;
	}
	public void setDateAndTimeOfMessage(LocalDateTime dateAndTimeOfMessage) {
		this.dateMessage = dateAndTimeOfMessage;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageEntity other = (MessageEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MessageEntity [id=" + id + ", message=" + message + ", userSendingMessage=" + userMessage
				+ ", forAdvertisement=" + Advertisement + ", dateAndTimeOfMessage=" + dateMessage + "]";
	}
	
}
