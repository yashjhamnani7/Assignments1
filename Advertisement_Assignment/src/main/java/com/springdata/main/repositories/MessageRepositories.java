package com.springdata.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdata.main.entity.MessageEntity;

public interface MessageRepositories extends JpaRepository<MessageEntity, Long> {
	
}


