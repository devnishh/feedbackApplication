package com.jforse.feedback_backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jforse.feedback_backend.dto.UserDTO;
import com.jforse.feedback_backend.entity.UserFeedback;
import com.jforse.feedback_backend.mapper.UserMapper;
import com.jforse.feedback_backend.repository.UserRespository;
import com.jforse.feedback_backend.service.UserService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Service
public class userServiceImpl implements UserService{

	@Autowired
	private UserRespository respository;
	
	@Override
	public UserDTO createUser(UserDTO dto) {
		
		UserFeedback user = UserMapper.mapToUser(dto);
		UserFeedback saveUser = respository.save(user);
		return UserMapper.mapToUserDTO(saveUser);
	}

}
