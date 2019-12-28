package com.girish.techgig;

public class MatricstreamInfotech_Techgig
{
	public static void main(String args[]) 
    { 
            R = 3; 
            C = 3; 
            char[][] grid = {{'A','A','K'}, 
                             {'A','S','K'}, 
                             {'A','K','K'}
                            }; 
		
		patternSearch(grid, "ASK");
		
		/*R = 2; 
        C = 2; 
        char[][] grid = {{'A','S'}, 
                         {'S','T'}
                        }; 
        patternSearch(grid, "AS"); */
    } 
	
	 // Searches given word in a given 
    // matrix in all 8 directions 
    static void patternSearch(char[][] grid, String word) 
    { 
    	System.out.println(word);
            // Consider every point as starting  
            // point and search given word 
    	    int totCount = 0;
            for (int row = 0; row < R; row++)  
            { 
                for (int col = 0; col < C; col++)  
                { 
                	System.out.print(grid[row][col]+" ");
                   // if (searchMatrix(grid, row, col, word)) {
                        //System.out.println("pattern found at " + row +  ", " + col); 
                        totCount = totCount + searchMatrix(grid, row, col, word);
                   // }
                } 
                System.out.println();
            } 
            System.out.println(totCount);
    } 
  
    
 
    static int R, C; 
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };  
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 }; 
    static int searchMatrix(char[][] grid, int row,int col, String word) 
    { 
            if (grid[row][col] != word.charAt(0)) 
                return 0; 
  
            int len = word.length(); 
            int total = 0;
            for (int dir = 0; dir < 8; dir++) 
            { 
                int k, rd = row + x[dir], cd = col + y[dir]; 
  
                for (k = 1; k < len; k++) 
                { 
                    if (rd >= R || rd < 0 || cd >= C || cd < 0) 
                        break; 
  
                    System.out.println(k+"--> "+grid[rd][cd]+" "+word.charAt(k));
                    if (grid[rd][cd] != word.charAt(k)) 
                        break; 
  
                    rd += x[dir]; 
                    cd += y[dir]; 
                }  
                if (k == len) 
                {
                	total++;
                   // k = 0; 
                }
            } 
        return total; 
    } 
}
