package com.girish.games;

public class ChessQueens {
	int[] x;

	public ChessQueens(int N) {
		x = new int[N];
	}

	public boolean canPlaceQueen(int r, int c) {
		/**
		 * Returns TRUE if a queen can be placed in row r and column c.
		 * Otherwise it returns FALSE. x[] is a global array whose first (r-1)
		 * values have been set.
		 */
		for (int i = 0; i < r; i++) {
			if (x[i] == c || (i - r) == (x[i] - c) || (i - r) == (c - x[i])) {
				return false;
			}
		}
		return true;
	}

	int boardCount = 1;

	public void printQueens(int[] x) {
		double N = x.length;
		System.out.print(", " + boardCount + ", N: " + N + "\n");
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
		boardCount++;
	}

	int countLR = 0;
	int methodCount = 0;

	public void placeNqueens(int r, int n) {
		/**
		 * Using backtracking this method prints all possible placements of n
		 * queens on an n x n chess board so that they are non-attacking.
		 */
		methodCount++;
		for (int c = 0; c < n; c++) {
			countLR++;
			if (canPlaceQueen(r, c)) {
				x[r] = c;
				if (r == n - 1) {
					System.out.println("countLR: " + countLR);
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

		ChessQueens Q = new ChessQueens(8);
		Q.callplaceNqueens();
		System.out.println(Q.methodCount);
	}
}
