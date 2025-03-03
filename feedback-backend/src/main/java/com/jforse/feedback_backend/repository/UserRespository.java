package com.jforse.feedback_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jforse.feedback_backend.entity.UserFeedback;
public interface UserRespository extends JpaRepository<UserFeedback, Long>{

}
