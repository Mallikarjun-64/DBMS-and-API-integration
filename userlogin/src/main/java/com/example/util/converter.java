package com.example.util;

import org.hibernate.annotations.Comment;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.example.entity.User;
import com.example.model.UserDTO;

@Component
public class converter {
	
	//convert from DTO entity
	public User convertUserDTOToUser(UserDTO userDto)
	{
		User user =new User();
		
		if(userDto!=null)
		{
			BeanUtils.copyProperties(userDto, user);
		}
		return user;
		}
	
	 //convert from entity to DTO
	public UserDTO convertUserToUserDTO(User user)
	{
		UserDTO userDto =new UserDTO();
		
		if(user!=null)
		{
			BeanUtils.copyProperties(userDto, user);
		}
		return userDto;
	}
	}