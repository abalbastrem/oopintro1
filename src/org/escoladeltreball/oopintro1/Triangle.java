package org.escoladeltreball.oopintro1;

public abstract class Triangle extends FigureImpl {
	
	protected double base; // protected permet a les subclasses veure aquest atribut
	protected double height;
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public abstract double perimeter();

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.base * this.height / 2;
	}

}
