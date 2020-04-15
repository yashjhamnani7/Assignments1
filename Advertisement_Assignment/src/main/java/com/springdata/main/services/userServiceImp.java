package com.springdata.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.main.entity.UserEntity;
import com.springdata.main.json.User;
import com.springdata.main.repositories.UserRepositories;
import com.springdata.main.utils.UserUtils;
@Service
public class userServiceImp implements UserService {
	
	@Autowired
	private UserRepositories userRepository;
	@Override
	public List<User> getAllUsers() {
		List<UserEntity> userEntityList = userRepository.findAll();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public User getCurrentUserDetails(String id) {
		UserEntity userEntity = userRepository.findBySessionId(id).get(0);
		return UserUtils.convertUserEntityToUser(userEntity);	}

	@Override
	public List<User> getUsersByFirstName(String firstName) {
		List<UserEntity> userEntityList = userRepository.findByFirstName(firstName);
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		UserEntity userEntity = 
				userRepository.save(UserUtils.convertUserToUserEntity(user));
		return UserUtils.convertUserEntityToUser(userEntity);
	}

	@Override
	public User update(User user) {
		UserEntity userEntity = userRepository.findById(user.getId()).get();
		if(userEntity != null) {
			userEntity.setFirstName(user.getFirstName());
			userEntity.setUserName(user.getUserName());
			userEntity.setPassword(user.getPassword());
			userEntity.setLastName(user.getLastName());
			userEntity.setEmail(user.getEmail());
			userEntity.setPhone(user.getPhone());
			userEntity = userRepository.save(userEntity);
			return UserUtils.convertUserEntityToUser(userEntity);
		}
		return null;
	}

	@Override
	public boolean delete(String id) {
		if(userRepository.existsById(Long.valueOf(id))) {
			userRepository.deleteById(Long.valueOf(id));
			return true;
		}
		return false;
	}

	@Override
	public List<User> getUsersByOrderByFirstNameAsc() {
		List<UserEntity> userEntityList = userRepository.findByOrderByFirstNameAsc();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	@Override
	public List<User> getUsersByOrderByFirstNameDesc() {
		List<UserEntity> userEntityList = userRepository.findByOrderByFirstNameDesc();
		return UserUtils.convertUserEntityListToUserList(userEntityList);
	}

	

	@Override
	public String Login(User user) {
		String  username=user.getUserName();
		String password=user.getPassword();
		
	List<UserEntity> userList=userRepository.findByUserName(username);
		if(userList==null || userList.size()==0)
		{
			return "{\"result\": \"failed\", \"message\": \"Invaliduser\""+username+ "}";
					
			}
			else
		{  //username is found
			UserEntity userentity=userList.get(0);
			if(password.equals(userentity.getPassword()))  //login is successful
			{
				  String sessionId=new java.rmi.server.UID().toString().substring(0,10);
				  userentity.setSessionId(sessionId);
				  userRepository.save(userentity);
				  return "{\"result\": \"success\", \"message\": \"Login successful\",\"auth-token\":\""+sessionId+ "}";	 
			}
			else
			{
				return "{\"result\": \"failed\", \"message\": \"Invalid password\"}";
			}
		 }
	   
	
			
	}

	@Override
	public String Logout(String authtoken) {
		UserEntity user1=userRepository.findBySessionId(authtoken).get(0);
		user1.setSessionId(null);
		UserEntity userEntity=userRepository.save(user1);	
		return  "{\"result\": \"failed\", \"message\": \"Logged Out\""+user1.getUserName()+ "}";
	}

	

}
