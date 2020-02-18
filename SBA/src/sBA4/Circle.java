package sBA4;

public class Circle implements Shape {
	private float radius;
	String name ="";

	public Circle() {
	}

	public Circle(float new_radius) {
		this.radius = new_radius;
	}

	@Override
	public float getArea() {
		float c = (float) ((Math.pow(radius, 2) * (Math.PI)));
		System.out.println("Finding area of circle with radius = " + radius);
		return c;
	}

	@Override
	public float getPerimeter() {
		float c = (float) (6.28 * radius);
		System.out.println("Finding perimeter of circle with radius = " + radius);
		return c;
	}

	@Override
	public String toString() {
		float c = (float) ((Math.pow(radius, 2) * (Math.PI)));
		float p = (float) (6.28 * radius);
		return "Circle = [radius: " + this.radius + ", area: " + c + ", perimeter: " + p
				+ "]";

	}
}