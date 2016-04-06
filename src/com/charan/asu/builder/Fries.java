package com.charan.asu.builder;

public abstract class Fries implements Item{

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new  Box();
	}

}
