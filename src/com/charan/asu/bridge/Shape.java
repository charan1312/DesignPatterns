package com.charan.asu.bridge;

public abstract class Shape {            // ABSTRACT CLASS WITH ABSTRACT METHODS
	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	public abstract void draw();	
}