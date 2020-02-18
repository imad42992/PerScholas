package org.perscholas;

public class Suv extends Car {
	private int seats;
	
	public void stop() {
		System.out.println("Hit the brakes!");
	}
	
	public Suv(int seats, int year, String color, String model, String make, double engSize) {
		this.seats = seats;
		this.setYear(year);
		this.setColor(color);
		this.setModel(model);
		this.setMake(make);
		this.setEngSize(engSize);
	}
	
	public Suv() {}

	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * @param seats the seats to set
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
}
