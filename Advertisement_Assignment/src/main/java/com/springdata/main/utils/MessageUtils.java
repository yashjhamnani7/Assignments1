package com.springdata.main.utils;

import com.springdata.main.entity.MessageEntity;
import com.springdata.main.json.Message;

public class MessageUtils {

	public static MessageEntity convertMessageJsonToMessageEntity(Message message)
	{
		return new MessageEntity(message.getId(),message.getMessage(),message.getDateAndTimeOfMessage());
	}
	
	public static Message convertMessageEntityToMessageJson(MessageEntity message)
	{
		return new Message(message.getId(),message.getMessage(),message.getDateAndTimeOfMessage());
	}
}
