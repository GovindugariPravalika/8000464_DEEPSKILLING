package com.example.orderservice.service;


import org.springframework.stereotype.Service;

import com.example.orderservice.client.UserClient;
import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;


@Service
public class OrderService {


private final OrderRepository repository;

private final UserClient userClient;



public OrderService(OrderRepository repository,
                    UserClient userClient){

this.repository=repository;
this.userClient=userClient;

}



public Object getOrderDetails(Long id){


Order order=repository.findById(id).orElse(null);


Object user=userClient.getUser(order.getUserId());


return new Object(){

public Order orderData=order;

public Object userData=user;

};


}


public Order saveOrder(Order order){

return repository.save(order);

}


}