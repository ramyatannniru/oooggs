package com.example.demo.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.data.User;
import com.example.demo.repository.UserRepo;
import com.example.demo.dto.UserDto;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDto createUser(UserDto userDto) {
		userDto.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
	String spass = UUID.randomUUID().toString();
	System.out.println(spass);
		userDto.setUserid(spass);
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		User userEntity = mapper.map(userDto, User.class);
		userRepo.save(userEntity);
		UserDto tempDto = mapper.map(userEntity, UserDto.class);
		return tempDto;
	}

}