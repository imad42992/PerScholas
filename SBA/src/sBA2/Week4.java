package sBA2;

import java.util.Scanner;

public class Week4 {
	
	public static final int n = 8; 
	public static final int m = 8; 
	static int allPossibleMoves(int arr[][], int p, int q) {
		 // All possible moves of a knight 
       int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; 
       int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; 
 
       int count = 0; 
 
       // Check if each possible move is valid or not 
       for (int i = 0; i < 8; i++) { 
 
           // Position of knight after move 
           int x = p + X[i]; 
           int y = q + Y[i]; 
 
           // count valid moves 
           if (x >= 0 && y >= 0 && x < n && y < m && arr[x][y] == 0) {
               count++;
               System.out.println(x + " " + y);
           }
           
       }
 
       // Return number of possible moves 
       return count; 
   } 
	
	

	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

  
    // Driver program to check findPossibleMoves() 
    
    { 
        int chessBoard[][] = new int[8][8];        		
        				
  
        int p = 2, q = 2; 
      
        System.out.println(allPossibleMoves(chessBoard, 0, 0)); 
    } 
} 
	}