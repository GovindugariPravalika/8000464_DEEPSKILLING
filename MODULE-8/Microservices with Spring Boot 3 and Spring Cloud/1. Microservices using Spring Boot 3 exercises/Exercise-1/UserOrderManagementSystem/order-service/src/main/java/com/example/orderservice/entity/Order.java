package com.example.orderservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Order {


@Id
private Long id;

private String product;

private Long userId;



public Long getId(){

return id;

}


public void setId(Long id){

this.id=id;

}



public String getProduct(){

return product;

}



public void setProduct(String product){

this.product=product;

}



public Long getUserId(){

return userId;

}



public void setUserId(Long userId){

this.userId=userId;

}

}