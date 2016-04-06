package com.charan.asu.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		
		MealBuilder mb = new MealBuilder();
		
		Meal chkmeal = mb.prepareChickenMeal();
		chkmeal.showItems();
		System.out.println("Total cost:" + chkmeal.getCost());
	}
}
