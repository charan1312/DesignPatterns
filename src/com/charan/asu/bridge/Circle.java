package com.charan.asu.bridge;

public class Circle extends Shape {         // THIS CLASS IMPLEMENTS THE ABSTRACTION CLASS, 
	private int x, y, radius;				//    BUT THE IMLEMENTER CLASSES ARE INDEPENDENT OF THIS CLASS

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;  
		this.y = y;  
		this.radius = radius;
	}

	public void draw() {
		drawAPI.drawCircle(radius,x,y);
	}
}