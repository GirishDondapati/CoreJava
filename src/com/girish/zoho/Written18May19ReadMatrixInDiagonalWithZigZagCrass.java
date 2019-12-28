package com.girish.zoho;

/*
  3 rd Round System Test program
 */
/*
 * Reading Matrix
 * 
 * Input: 
 *    1   2   3   4
 *    5   6   7   8
 *    9   10  11  12
 *    13  14  15  16
 *   Output: 4,3,8,12,7,2,1,6,11,16,15,10,5,9,14,13
 */

public class Written18May19ReadMatrixInDiagonalWithZigZagCrass
{
	static final int ROW = 4; 
	static final int COL = 4; 
	// A utility function to find min  
	// of two integers 
	static int min(int a, int b) { 
	    return (a < b) ? a : b; 
	    } 
	  
	// A utility function to find min 
	// of three integers 
	static int min(int a, int b, int c) { 
	    return min(min(a, b), c); 
	    } 
	  
	// A utility function to find max  
	// of two integers 
	static int max(int a, int b) {  
	    return (a > b) ? a : b; 
	    } 
	  
	// The main function that prints given 
	// matrix in diagonal order 
	static void diagonalOrder(int matrix[][]) { 
	  
	    // There will be ROW+COL-1 lines in the output 
	    for (int line = 1; line <= (ROW + COL - 1); line++) { 
	  
	    // Get column index of the first element in this 
	    // line of output.The index is 0 for first ROW 
	    // lines and line - ROW for remaining lines 
	    int start_col = max(0, line - ROW); 
	  
	    // Get count of elements in this line. The count 
	    // of elements is equal to minimum of line number, 
	    // COL-start_col and ROW  
	    int count = min(line, (COL - start_col), ROW); 
	  
	    // Print elements of this line  
	    for (int j = 0; j < count; j++) 
	        System.out.print(matrix[min(ROW, line) - j - 1] 
	                            [start_col + j] + " "); 
	  
	    // Print elements of next diagonal on next line 
	    System.out.println(); 
	    } 
	} 
	  
	// Utility function to print a matrix 
	static void printMatrix(int matrix[][]) { 
	    for (int i = 0; i < ROW; i++) { 
	    for (int j = 0; j < COL; j++) 
	        System.out.print(matrix[i][j] + " "); 
	    System.out.print("\n"); 
	    } 
	} 
	  
	// Driver code 
	public static void main(String[] args) { 
	    int M[][] = { 
	        {1, 2, 3, 4},     {5, 6, 7, 8},     {9, 10, 11, 12}, 
	        {13, 14, 15, 16}}; 
	    System.out.print("Given matrix is \n"); 
	    printMatrix(M); 
	  
	    System.out.print("\nDiagonal printing of matrix is \n"); 
	    diagonalOrder(M); 
	} 
}