package com.charan.asu.builder;

public class MealBuilder {

	public Meal prepareVegMeal() {
		
		Meal vegMeal = new Meal();
		vegMeal.addItem(new VegBurger());
		vegMeal.addItem(new SpicyFries());
		vegMeal.addItem(new Coke());
		
		return vegMeal;
	}

	public Meal prepareChickenMeal() {
		
		Meal chkMeal = new Meal();
		chkMeal.addItem(new ChickenBurger());
		chkMeal.addItem(new SpicyFries());
		chkMeal.addItem(new Coke());
		
		return chkMeal;
	}

}
