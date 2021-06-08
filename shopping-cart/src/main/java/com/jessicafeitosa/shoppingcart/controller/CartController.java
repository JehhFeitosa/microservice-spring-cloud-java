package com.jessicafeitosa.shoppingcart.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jessicafeitosa.shoppingcart.model.Cart;
import com.jessicafeitosa.shoppingcart.model.Item;
import com.jessicafeitosa.shoppingcart.repository.CartRepository;

@RestController
@RequestMapping(value= "/cart")
public class CartController {
	
	@Autowired
	private CartRepository cartRepository;
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
		Optional<Cart> savedCart = cartRepository.findById(id);
		Cart cart;
		if (savedCart.equals(Optional.empty())) {
			cart = new Cart(id);
		}else {
			cart = savedCart.get();
		}
		cart.getItems().add(item);
		return cartRepository.save(cart);
	}
	
	@RequestMapping(value= "/{id}", method= RequestMethod.GET)
	public Optional<Cart> findById(@PathVariable("id") Integer id) { return cartRepository.findById(id);}
	
	@RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
	public void clear(@PathVariable("id") Integer id) { cartRepository.deleteById(id);}
	
	

}
