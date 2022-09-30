package com;

import java.sql.Date;
import java.util.Random;
public class OrderTest {
    
	public Order createOrder(Order order) {
		
		Order orderDao = null;
        Order newOrder = new Order();
        newOrder.setOrderId(new Random().nextInt());
        newOrder.setSecurityCode("XYZ");
        newOrder.setOrderStatus("INITIATED");
        newOrder.setOrderDate(new Date(00L));
        orderDao.createOrder(newOrder);
    return newOrder;
	}
}
