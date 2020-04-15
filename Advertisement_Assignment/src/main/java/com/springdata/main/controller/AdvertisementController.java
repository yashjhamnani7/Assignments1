package com.springdata.main.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.main.json.Advertisement;
import com.springdata.main.json.Message;
import com.springdata.main.services.AdvertisementService;


@RestController
@RequestMapping("/advertisement")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@RequestMapping(value="/addAdvertisement",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Advertisement addAdvertisement(@RequestBody Advertisement advertisement,@RequestHeader String authtoken) {
		return advertisementService.save(advertisement,authtoken);
	}
	@RequestMapping(value="/updateadvertisemnt",method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String updateAdvertisement(@RequestBody Advertisement advertisement,@RequestHeader String authtoken) {
		return advertisementService.update(advertisement,authtoken);
	}
	@RequestMapping(value="/getuserAdvertisement",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Advertisement> updateAdvertisement(@RequestHeader String authtoken) {
		 List<Advertisement> advertisementlist=new ArrayList<Advertisement>();
		 advertisementlist.addAll(advertisementService.getUserAdvertisementList(authtoken));
		 return advertisementlist;
	}
	
	@RequestMapping(value="/deletedbypostid/{postid}",method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String DeleteAdvByPostId(@RequestHeader String apikey,@PathVariable(name ="postid") String postId) {
		 return advertisementService.deleteAdvByPostId(apikey, postId);
	}
	
	

	@RequestMapping(value="/sendmessage/{postid}",method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public String sendMessageByUser(@RequestHeader String apikey,@PathVariable(name ="postid") String postId,@RequestBody Message message){
		 return advertisementService.sendMessage(postId, message, apikey);
	}
	
	@RequestMapping(value="/getadbysearchtext/{searchtext}",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Advertisement> sendMessageByUser(@PathVariable(name = "searchtext") String searchText){
		 return advertisementService.getAdvertisementByGivenSearchText(searchText);
	}




}