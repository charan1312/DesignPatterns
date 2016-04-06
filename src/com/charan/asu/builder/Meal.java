package com.charan.asu.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float total=0.0f;
		
		for(Item item : items) {
			total += item.price();
		}
		
		return total;
	}
	
	public void showItems() {
		
		for(Item item : items) {
			System.out.println("Item Name:" + item.name());
			System.out.println("Item Packing Type:" + item.packing().pack());
			System.out.println("Item Price:" + item.price());
		}
	}
}
