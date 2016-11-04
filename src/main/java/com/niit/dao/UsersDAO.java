package com.niit.dao;

import java.util.List;

import com.niit.model.Users;

public interface UsersDAO {
	
	/*Used for creating or updating user*/
	public void saveOrUpdate(Users users);
	
	/*	Used for deleting user*/
	public void delete(Users users);
	
	public List<Users>list();
	
	/*Used to retrieve single user based on username
	public User getUser(String username);
	
	public User viewUser(int blogid);*/
}