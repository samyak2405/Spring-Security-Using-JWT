package com.samyak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samyak.entity.Role;
import com.samyak.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	/**
	 * Create a new role
	 * @param role
	 * @return role
	 */
	@Override
	public Role createNewRole(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.save(role);
	}

}
