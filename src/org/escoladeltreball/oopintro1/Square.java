package org.escoladeltreball.oopintro1;

public class Square extends FigureImpl {

	protected double base; // protected permet a les subclasses veure aquest atribut
	
	public Square(double base) {
		super();
		this.base = base;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return base * 4;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base * base;
	}

}
