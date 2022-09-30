package com;

import java.sql.Date;

public class Order {
	String setSecurityCode(String str)
	{
		return "XYZ";
	}
	String setOrderStatus(String str1) {
		return "INITIATED";
	}
	Order orderDao;
	
	
	void setOrderDate(Date date) {
		// TODO Auto-generated method stub
		System.out.println("Orders Date"+date);
		
	}
	
	void setOrderId(int nextInt) {
		// TODO Auto-generated method stub
	      System.out.println("OrderId:-"+nextInt);
		
	}
	public void createOrder(Order newOrder) {
		// TODO Auto-generated method stub
		
	}


}
