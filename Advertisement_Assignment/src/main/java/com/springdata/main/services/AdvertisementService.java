package com.springdata.main.services;

import java.util.List;
import java.util.Set;

import com.springdata.main.json.Advertisement;
import com.springdata.main.json.Message;


public interface AdvertisementService {
	
	public Advertisement save(Advertisement advertisement,String key);
	
	public Set<Advertisement> getUserAdvertisementList(String key);
	
	public List<Advertisement> getAllAdvertisements();
	
	public String deleteAdvByPostId(String key,String id);


	public String sendMessage(String postId,Message message,String key);
	
	
	
	public String update(Advertisement advertise,String key);
	public List<Advertisement> getAdvertisementByPostIdByParticularUser(String key,String postId);

	public List<Advertisement> getAdvertisementByGivenSearchText(String searchText);
	
	
	

}
