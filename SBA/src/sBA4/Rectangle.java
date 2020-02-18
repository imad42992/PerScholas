package sBA4;

public class Rectangle implements Shape {

	private float type = 1.0F;
	private float length = 1.0F;
	private float width = 1.0F;

	public Rectangle() {
	}

	public Rectangle(float new_length, float new_width) {
		this.length = new_length;
		this.width = new_width;
	}

	@Override
	public float getArea() {
		float a = this.length * this.width;
		System.out.println("Finding area of rectangle with length = " + this.length + " and width = " + this.width);
		return a;
	}

	@Override
	public float getPerimeter() {
		float a = 2 * (this.length + this.width);
		System.out
				.println("Finding perimeter of rectangle with length = " + this.length + " and width = " + this.width);
		return a;
	}

	@Override
	public String toString() {
		float a = this.length * this.width;
		float p = 2 * (this.length + this.width);
		return "Rectangle = [length: " + this.length + ", width: " + this.width + ", area: " + a
				+ ", perimeter: " + p + "]";
	}

	/**
	 * @return the type
	 */
	public float getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(float type) {
		this.type = type;
	}

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(float width) {
		this.width = width;
	}

}
