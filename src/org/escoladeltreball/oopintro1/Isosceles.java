package org.escoladeltreball.oopintro1;

public class Isosceles extends Triangle {

	public Isosceles(double base, double height) {
		super(base, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return ( Math.sqrt(Math.pow(base/2, 2) + Math.pow(height, 2)) * 2 ) + base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.area();
	}

}
