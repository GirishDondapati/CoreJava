package com.girish.interviewwriten;

import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
 
    public int findDuplicateNumber(List<Integer> numbers){
         
        int highestNumber = numbers.size() - 1;
        System.out.println(highestNumber);
        int total = getSum(numbers);
        System.out.println(total);
        int cal=highestNumber*(highestNumber+1)/2;
        System.out.println(cal);
        int duplicate = total - cal;
        System.out.println(duplicate);
        return duplicate;
    }
     
    public int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<=30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(29);
        //numbers.add(20);
        DuplicateNumber dn = new DuplicateNumber();
        
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}