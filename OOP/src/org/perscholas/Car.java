package org.perscholas;

public class Car {
	private int year;
	private String color;
	private String model;
	private String make;
	private double engSize;
	
	public Car() {}
	
	public Car(int year, String color, String model, String make, double engSize) {
		this.year = year;
		this.color = color;
		this.model = model;
		this.make = make;
		this.engSize = engSize;
		
	}
	public void drive() {
		System.out.println("Go Forward!");
	}
	
	public void reverse() {
		System.out.println("Go Backwards!");
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the engSize
	 */
	public double getEngSize() {
		return engSize;
	}

	/**
	 * @param engSize the engSize to set
	 */
	public void setEngSize(double engSize) {
		this.engSize = engSize;
	}
}
