package com.girish.interviewwriten;

import java.util.Scanner;
//http://java-latte.blogspot.in/2013/05/find-next-higher-number-with-same-digits.html
public class HighestNumber {
 public static void main(String pardeep[]) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number:");
  int inputInt = sc.nextInt();
  char inputStr[] = Integer.toString(inputInt).toCharArray();
  //System.out.println(inputInt[0]);
  String output = "";
  int pivotIndex = -1, len = inputStr.length, min = 99999999, replaceIndex = -1;

   for (int i = len - 1; i >= 0; i--) 
   {
   if (i == 0) {//if no is already highest
    break;
   }
   if (inputStr[i - 1] < inputStr[i] && i > 0) { //finding pivot element
    pivotIndex = i - 1;
    for (int j = pivotIndex + 1; j < len; j++) { // finding next highest of pivot element
     int d = inputStr[j] - inputStr[pivotIndex];
     if (d < min && d > 0) {
    	 System.out.println(d);
      replaceIndex = j;
      System.out.println(replaceIndex);
      min = d;
     }
    }
    /**
     * Replacing pivot element with next highest element
     */
    char temp = inputStr[pivotIndex];
    inputStr[pivotIndex] = inputStr[replaceIndex];
    inputStr[replaceIndex] = temp;
    //reversing
    for (i = 0; i <= pivotIndex; i++)
     output += inputStr[i];
    for (i = len - 1; i > pivotIndex; i--)
     output += inputStr[i];
    break;
   }
  }
  if (pivotIndex == -1)
  {
	  System.out.println("It if true");
   System.out.println("output=" + inputInt);
  }
  else
  {
   System.out.println("ouput=" + output);
  }

  }
}