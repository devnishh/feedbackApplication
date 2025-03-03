package com.jforse.feedback_backend.mapper;

import com.jforse.feedback_backend.dto.UserDTO;
import com.jforse.feedback_backend.entity.UserFeedback;

public class UserMapper {

	public static UserDTO mapToUserDTO(UserFeedback user) {
		return new UserDTO(   user.getId(),user.getUserName(), user.getEmail(), user.getPassWord(), user.getConfirmPassword());
	}

	public static UserFeedback mapToUser(UserDTO dto) {
		return new UserFeedback(dto.getId(),dto.getUserName(), dto.getEmail(), dto.getPassword(),dto.getConfirmPassword());
	}
}
