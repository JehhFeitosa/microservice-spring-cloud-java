package com.jessicafeitosa.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import com.jessicafeitosa.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
	

}
