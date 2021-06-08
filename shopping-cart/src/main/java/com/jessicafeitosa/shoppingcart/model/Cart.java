package com.jessicafeitosa.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("cart")
public class Cart {
	
	private Integer id;
	private List<Item> items;
	
	public Cart() {
	}
	
	public Cart(Integer id){this.id = id;}	
	
	public Integer getId() { return id;}
	
	public void setId(Integer id) { this.id = id;}
	
	public List<Item> getItems(){
		if (items == null) {
			items = new ArrayList<>();
		}
		return items;
	}
	
	public void setItems(List<Item> items) {this.items = items;	}

}
