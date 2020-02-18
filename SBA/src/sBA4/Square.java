package sBA4;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(float side) {
		super(side, side);
	}

	@Override
	public float getArea() {
		float s = getLength() * getLength();
		System.out.println("Finding area of square with side = " + s);
		return s;
	}

	@Override
	public float getPerimeter() {
		float s = 4 * (getLength());
		System.out.println("Finding perimeter of square with side = " + s);
		return s;
	}

	@Override
	public String toString() {
		float s = getLength() * getLength();
		float p = 4 * (getLength());
		return "Square = [side: " + getLength() + ", area: " + s + ", perimeter: "
				+ p + "]";
	}
}