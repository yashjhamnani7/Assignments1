package com.springdata.main.services;

import java.util.List;

import com.springdata.main.json.User;



public interface UserService {
public List<User> getAllUsers();
	
	public User getCurrentUserDetails(String id);
	
	public List<User> getUsersByFirstName(String firstName);
	
	public User save(User user);
	
	public User update(User user);
	
	public boolean delete(String id);
	
	public List<User> getUsersByOrderByFirstNameAsc();
	
	public List<User> getUsersByOrderByFirstNameDesc();
	public String Login(User user);
	public String Logout(String authtoken);
}
