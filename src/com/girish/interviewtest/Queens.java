package com.girish.interviewtest;

public class Queens {
	 
    int[] x;
 
    public Queens(int N) {
        x = new int[N];
    }
 
    public boolean canPlaceQueen(int r, int c) {
        for (int i = 0; i < r; i++) {
            if (x[i] == c || (i - r) == (x[i] - c) ||(i - r) == (c - x[i]))
            {
                return false;
            }
        }
        return true;
    }
 
    int boardCount = 1;
    public void printQueens(int[] x) {
        double N = x.length;
        boardCount=boardCount++;
        System.out.println(", "+boardCount+", N: "+N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (x[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
 
    public void placeNqueens(int r, int n) {
    
       int countLR = 0;
        for (int c = 0; c < n; c++) {
             countLR++;
            if (canPlaceQueen(r, c)) {
                x[r] = c;
                if (r == n - 1) {
                    System.out.print("countLR: "+countLR);
                    printQueens(x);
                } else {
                    placeNqueens(r + 1, n);
                }
            }
        }
    }
 
    public void callplaceNqueens() {
        placeNqueens(0, x.length);
    }
 
    public static void main(String args[]) {
        Queens Q = new Queens(8);
        Q.callplaceNqueens();
    
    }
}