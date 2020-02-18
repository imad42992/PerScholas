package org.perscholas;

public class Review2dArrays {
	
	public static void print2D(int num[][]) {
		for(int[] row : num)
			for(int x : row)
				System.out.println(x + " ");
	}

	public static void main(String[] args) {

		int num [] [] = {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12}};
		print2D(num);
		}
		
	}

