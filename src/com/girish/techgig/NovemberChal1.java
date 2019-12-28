package com.girish.techgig;

import java.io.*;
import java.util.*;
public class NovemberChal1 {
    public static void main(String args[] ) throws Exception {

    	System.out.println(2*10^5);
    	System.out.println(10^16);
    	long startTime = System.currentTimeMillis();
    	Scanner scan = new Scanner(System.in);
        String noOfDaysStr = "12";//scan.nextLine();
        String profitsScale = "14564545154411 14564545154425 14564545154416 14564545154409 14564545154424 14564545154413 14564545154400 14564545154418 14564545154406 14564545154404 14564545154390 14564545154425";//scan.nextLine();
        
        int noOfDays = Integer.parseInt(noOfDaysStr);
        if(noOfDays < 2 || noOfDays > (2*10^2))
        {
            System.out.println(0);
            return;
        }

        String[] profils = profitsScale.split(" ");
        if(profils.length != noOfDays)
        {
            System.out.println(0);
            return;
        }

        int limitValue = 10^16;
        ArrayList<Double> profitsList = new ArrayList<Double>();
        for(int i = 0; i < profils.length; i++)
        {
            double eachVal = Double.parseDouble(profils[i]);
            if(limitValue < eachVal )
            {
                System.out.println(0);
                return;
            }
            profitsList.add(eachVal);
        }

        double minLoss = 99999999999.0;
        for(int i = 0; i < noOfDays-1; i++)
        {
            double iDateValue = profitsList.get(i);
            for (int j = i+1 ; j < noOfDays; j++)
            {
                double lossCr = iDateValue - profitsList.get(j);
                if(lossCr > 0 && minLoss > lossCr)
                    minLoss = lossCr;
            }
        }
        System.out.println((int)minLoss);
        System.out.println(System.currentTimeMillis() - startTime);

   }
}