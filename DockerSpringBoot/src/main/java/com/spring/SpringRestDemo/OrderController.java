package com.spring.SpringRestDemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myapp")
public class OrderController {
	
	@RequestMapping(value="/order", method=RequestMethod.GET)
	public String getOrder(@RequestParam int orderId) {
		return new Order(orderId, "Chairs", 555).toString();
	}
	
}
