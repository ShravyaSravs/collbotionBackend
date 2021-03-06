package com.niit.dao;

import java.util.List;

import com.niit.model.Users;

public interface UsersDAO {

	public boolean saveOrUpdate(Users users);
	public boolean delete(Users users);
	public List<Users>list();
	public Users getuser(int id);
	public Users authuser(String username,String password);
}