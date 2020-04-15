package com.springdata.main.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdata.main.entity.AdvertisementEntity;
import com.springdata.main.entity.MessageEntity;
import com.springdata.main.entity.UserEntity;
import com.springdata.main.json.Advertisement;
import com.springdata.main.json.Message;
import com.springdata.main.repositories.AdvertisementRepositories;
import com.springdata.main.repositories.MessageRepositories;
import com.springdata.main.repositories.UserRepositories;
import com.springdata.main.utils.AdvertisementUtils;
import com.springdata.main.utils.MessageUtils;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

	@Autowired
	private  UserRepositories userRepositories;
	
	@Autowired
	private AdvertisementRepositories advertisementRepositories;
	
	@Autowired
	private MessageRepositories messageRepositories;
	
	
	@Override
	public Advertisement save(Advertisement advertisement, String key) {
		UserEntity userEntity=this.getUserUsingSessionId(key);
		if(userEntity!=null)
		{	AdvertisementEntity advadd=AdvertisementUtils.convertAdvJsonToAdvEntity(advertisement);
			
			advadd.setUserEntity(userEntity);
			advertisementRepositories.save(advadd);
			return AdvertisementUtils.convertAdvEntityToAdvJson(advadd);
		}
		else
		{
			return null;
		}
	}
	@Override
	public String update(Advertisement advertise,String key) {
		UserEntity userEntity=this.getUserUsingSessionId(key);
		if(userEntity!=null)
		{	Optional<AdvertisementEntity> option=userEntity.getAdvertisementEntities().stream().filter((AdvertisementEntity adv)->adv.equals(AdvertisementUtils.convertAdvJsonToAdvEntity(advertise))).findAny();
			if(option.isPresent())
			{	AdvertisementEntity advToPersist=AdvertisementUtils.convertAdvJsonToAdvEntity(advertise);
				
				advToPersist.setUserEntity(userEntity);
				advertisementRepositories.save(advToPersist);
				return "Update Succesfull\n"+advertisementRepositories.findById(advertise.getId()).toString();
			}
			else
			{
				return "No advertisement present";
			}
		}
		else
		{
			return "Login session has expired";
		}
	}


	@Override
	public Set<Advertisement> getUserAdvertisementList(String key) {
		UserEntity userEntity=this.getUserUsingSessionId(key);
		if(userEntity!=null)
		{
			return AdvertisementUtils.convertAdvEntitySetToAdvJsonSet(userEntity.getAdvertisementEntities());
		}
		else
		{
			return null;
		}
	}

	@Override
	public List<Advertisement> getAllAdvertisements() {
		return AdvertisementUtils.convertAdvEntityListToAdvJson(advertisementRepositories.findAll());
	} 
	@Override
	public List<Advertisement> getAdvertisementByPostIdByParticularUser(String key, String postId) {
		UserEntity userEntity=this.getUserUsingSessionId(key);
		if(userEntity!=null)
		{
			Optional<AdvertisementEntity> option=userEntity.getAdvertisementEntities().stream().filter((AdvertisementEntity adv)->adv.getPostId().equals(postId)).findAny();
			if(option.isPresent())
			{	
				return AdvertisementUtils.convertAdvEntityListToAdvJson( advertisementRepositories.findByPostId(postId));
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
	}

	
	@Override
	public String deleteAdvByPostId(String key, String id) {
		UserEntity userEntity=this.getUserUsingSessionId(key);
		if(userEntity!=null)
		{
			Optional<AdvertisementEntity> option=userEntity.getAdvertisementEntities().stream().filter((AdvertisementEntity adv)->adv.getPostId().equals(id)).findAny();
			if(option.isPresent())
			{	
				AdvertisementEntity advToBeDeleted=userEntity.getAdvertisementEntities().stream().filter((AdvertisementEntity adv)->adv.getPostId().equals(id)).collect(Collectors.toList()).get(0);
				advertisementRepositories.delete(advToBeDeleted);
				return "Deleted succesfully";
			}
			else
			{
				return "Not found any assignments";
			}
		}
		else
		{
			return "Login session has expired";
		}
	}
	
	@Override
	public String sendMessage(String postId, Message message,String key) {
		UserEntity userEntity=this.getUserUsingSessionId(key);
		if(userEntity!=null)
		{	AdvertisementEntity advertisementEntity=getAdvertisementByPostId(postId);
			if(advertisementEntity!=null)
			{	MessageEntity messageEntity=MessageUtils.convertMessageJsonToMessageEntity(message);
				messageEntity.setDateAndTimeOfMessage(LocalDateTime.now());
				messageEntity.setForAdvertisement(advertisementEntity);
				messageEntity.setUserSendingMessage(userEntity);
				messageRepositories.save(messageEntity);
				
				return "Message Sent Successfully";
			}
			else 
			{
				return "Adversitement for the given post id is not present";
			}
		}
		else
		{
			return "Login to continue session has expired or user not logged in";
		}

	}
	
	
	@Override
	public List<Advertisement> getAdvertisementByGivenSearchText(String searchText) {
		Optional<Advertisement> option= getAllAdvertisements().stream().filter((Advertisement adv)->adv.getCategory().contains(searchText)||adv.getDescription().contains(searchText)||adv.getName().contains(searchText)||adv.getTitle().contains(searchText)).findAny();
		if(option.isPresent())
		{
			return  getAllAdvertisements().stream().filter((Advertisement adv)->adv.getCategory().contains(searchText)||adv.getDescription().contains(searchText)||adv.getName().contains(searchText)||adv.getTitle().contains(searchText)).collect(Collectors.toList());
		}
		else
		{
			return null;
		}
	}



	
	
	public AdvertisementEntity getAdvertisementByPostId(String postId)
	{	List<AdvertisementEntity> advEntityList=advertisementRepositories.findByPostId(postId);
		if(advEntityList!=null&&advEntityList.size()>0)
		{
			AdvertisementEntity adv=advEntityList.get(0);
			return adv;
		}
		else
		{
			return null;
		}
	}
	public  UserEntity getUserUsingSessionId(String authtoken)
	{
		if(authtoken==null||authtoken.equals(""))
		{
			return null;
		}
		UserEntity user=userRepositories.findBySessionId(authtoken).get(0);
		if(user==null)
		{
			return null;
		}
		else
		{
			return user;
		}
	}
	
	
	
}
