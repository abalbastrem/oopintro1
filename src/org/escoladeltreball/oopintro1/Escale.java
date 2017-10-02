package org.escoladeltreball.oopintro1;

public class Escale extends Triangle {

	private double side1;
	private double side2;
	
	/**
	 * @param base
	 * @param height
	 */
	public Escale(double base, double height, double side1, double side2) {
		super(base, height);
		this.side1 = side1;
		this.side2 = side2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.side1 + this.side2 + this.base;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.area();
	}

}
