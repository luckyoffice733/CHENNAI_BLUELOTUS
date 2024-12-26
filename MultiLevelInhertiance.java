package com.training;


class Shape{
	public void draw() {
		System.out.println("drawing a shape...");
	}
	
}

class Circle extends Shape{
	public void drawCircle() {
		System.out.println("Circle shape");
	}

}

class Color extends Circle{
	public void fillColor() {
		System.out.println("rgb :  mix of blue,red,green");
	}
}

public class MultiLevelInhertiance {
	public static void main(String[] args) {
	   
		Color col = new Color();
		col.draw();
		col.drawCircle();
		col.fillColor();

	}

}
