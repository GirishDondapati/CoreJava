package com.girish.zoho;

import java.util.Scanner;

/*
 	K caterpillars are eating their way through N leaves, each caterpillar falls from leaf to leaf in a
 	 unique sequence, all caterpillars start at a twig at position 0 and falls onto the leaves at position
 	  between 1 and N. Each caterpillar j has as associated jump number Aj. A caterpillar with jump number 
 	  j eats leaves at positions that are multiple of j. It will proceed in the order j, 2j, 3j…. till
 	   it reaches the end of the leaves and it stops and build its cocoon. Given a set A of K elements
 	    K<-15, N<=10^9, we need to determine the number of uneaten leaves.

Input:
	N = No of uneaten leaves
	K = No. of caterpillars
	A = Array of integer jump numbers
Output:
	The integer nu. Of uneaten leaves

Sample Input:
			10
			3
			2
			4
			5
Output:
			4
Explanation:
		[2, 4, 5] is a j member jump numbers, all leaves which are multiple of 2, 4, and 5 are eaten, 
		leaves 1,3,7,9 are left, and thus the no. 4

 
 */
public class Written18May19Caterpiller
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leaves = sc.nextInt();
        int k = sc.nextInt();
        int[] jump = new int[k]; int i = 0;
        while(i < k) {
            jump[i] = sc.nextInt();
            i++;
        }
        System.out.println(findUneatenLeaves(leaves, k, jump));
    }
    
    public static int findUneatenLeaves(int leaves, int k, int[] jump) {
        int n = jump[0];
        int uneaten = n-1;
        int j = 0;
        while(n <= leaves) {
            j = 0;
            while(j < k) {
                if((n % jump[j]) == 0 ) break;
                j++;
            }
            if(j == k) uneaten++;
            n++;
        }
        return uneaten;
    }

}
