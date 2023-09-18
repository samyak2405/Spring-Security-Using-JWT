/**
 * 
 */
package com.samyak.service;

import org.springframework.stereotype.Service;

import com.samyak.entity.User;

/**
 * 
 */
@Service
public interface UserService {

	User registerUser(User user);
	
}
