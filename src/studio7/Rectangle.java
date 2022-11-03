package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle 
{
	private double length;
	private double height;

	public Rectangle(double length, double height) {
		this.length = length;
		this.height = height;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return this.length*this.height;
	}
	public double perimeter() {
		return 2 * this.length + 2 * this.height;
	}
	public boolean isSmaller(Rectangle r){
		boolean isSmaller = false;
		if (this.area() < r.area())
		{
			isSmaller = true;
		}
		return isSmaller;
	}
	public boolean isSquare() {
		boolean isSquare = false;
		if (this.length == this.height)
		{
			isSquare = true;
		}
		return isSquare;
	}
	public void draw() {
		StdDraw.filledRectangle(0.5, 0.5, this.length/2, this.height/2);
	}
}
