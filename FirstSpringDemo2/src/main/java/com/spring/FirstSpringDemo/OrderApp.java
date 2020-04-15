package com.spring.FirstSpringDemo;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class OrderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sum=0;
		
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		//Order orderbean = (Order)ctx.getBean("Order1");
		 
		Map<String,OrderBeans> map = ctx.getBeansOfType(OrderBeans.class);
		for(String str : map.keySet())
		{
			OrderBeans o = map.get(str);
			sum=sum+ o.getPrice();
		}
		
		System.out.println(sum);
		
	}

}
