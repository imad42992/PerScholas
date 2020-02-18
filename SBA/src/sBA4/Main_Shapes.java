package sBA4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Shapes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the length and width seperated by a space");
		
		float length = 0.0F; 
		float width = 0.0F;
		
		try {
			length = in.nextFloat(); 
			width = in.nextFloat();
		} catch(InputMismatchException e) {
		System.out.println("Only float values are accepted, please try again (Ex: 2.2):");
		length = in.nextFloat();
		width = in.nextFloat();
		}
		while(!(length > 1.0F && length < 100.0F)&& !(width > 1.0F && width < 100.0F)) {
			System.out.println("Enter length and width (Must be from 2-99!!!)");
			length = in.nextFloat();
			width = in.nextFloat();
		}
		
		System.out.println("Enter side length of square");
		float side = in.nextFloat();
		while(!(length > 1.0F && length < 100.0F)) {
		length = in.nextFloat();
		}
		
		System.out.println("Enter radius of circle (Must be from 2-99!!!)");
		float radius = in.nextFloat();
		while(!(radius > 1.0F && radius < 100.0F)) {
			radius = in.nextFloat();
			}
		
		System.out.println("====================================");
		System.out.println("Finding area and perimeter of shapes");
		System.out.println("====================================");
		Rectangle rec = new Rectangle(length,width);
		rec.getArea();
		rec.getPerimeter();
		rec.toString();
		
		Square sq = new Square(side);
		System.out.println();
		System.out.println();
		rec.getArea();
		sq.getArea();
		rec.getPerimeter();
		sq.toString();
		
		Circle circ = new Circle(radius);
		System.out.println();
		System.out.println();
		circ.getArea();
		circ.getPerimeter();
		circ.toString();
		
		System.out.println("=========================");
		System.out.println("Printing shapes as string");
		System.out.println("=========================");
		System.out.println(rec.toString());
		System.out.println(sq.toString());
		System.out.println(circ.toString());
	}
	

}
