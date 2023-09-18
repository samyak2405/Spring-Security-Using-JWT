/**
 * 
 */
package com.samyak.service;


import org.springframework.stereotype.Service;

import com.samyak.entity.Role;

/**
 * 
 */
@Service
public interface RoleService {
	public Role createNewRole(Role role);
}
