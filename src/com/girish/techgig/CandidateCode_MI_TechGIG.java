package com.girish.techgig;
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode_MI_TechGIG {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      int matrixSize = Integer.parseInt(sc.nextLine());
      if(matrixSize <= 0 || matrixSize > 10000)
      {
         System.out.print(0);
         return;
      }
      
      R = matrixSize;
      C = matrixSize;
      char[][] matrix = new char[matrixSize][matrixSize];
      for(int row = 0; row < matrixSize; row++)
      {
         String columnLine = sc.nextLine();
         columnLine = (columnLine.replaceAll("#","")).toUpperCase();
         char[] ch = columnLine.toCharArray(); 
         for (int col = 0; col < matrixSize; col++) { 
            matrix[row][col] = ch[col];
         } 
      }
      String searchStr = sc.nextLine();
      patternSearch(matrix,searchStr.toUpperCase());
   }

   static int R, C; 
   static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };  
   static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };  

   static void patternSearch(char[][] grid, String word) 
   { 
      int totCount = 0;
      for (int row = 0; row < R; row++)  
      { 
         for (int col = 0; col < C; col++)  
         { 
             totCount = totCount + searchMatrix(grid, row, col, word);
         } 
      }
      System.out.print(totCount);
   } 

   static int searchMatrix(char[][] grid, int row,int col, String word) 
   { 
      if (grid[row][col] != word.charAt(0)) 
            return 0; 

      int len = word.length();  
      int matchCount = 0; 
      for (int dir = 0; dir < 8; dir++) 
      { 
            int k, rd = row + x[dir], cd = col + y[dir]; 

            for (k = 1; k < len; k++) 
            { 
               if (rd >= R || rd < 0 || cd >= C || cd < 0) 
                  break; 

               if (grid[rd][cd] != word.charAt(k)) 
                  break; 

               rd += x[dir]; 
               cd += y[dir]; 
            }  

            if (k == len) 
               matchCount++;
      } 
      return matchCount; 
   } 
}