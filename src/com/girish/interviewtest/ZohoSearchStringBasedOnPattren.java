package com.girish.interviewtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class ZohoSearchStringBasedOnPattren {
       public static void main(String[] args) {
              String[] countryNames = {"India","Chaina","Russia","Germany","London","Australiya","Singapure","South Africa","Cenada"};
             
              Scanner sc = new Scanner(System.in);
              System.out.println("Please enter letters: ");
              String seachPattran = sc.next();
             
              for(int i = 0; i < countryNames.length; i++)
              {
                     String eachCountry = countryNames[i];
                     boolean macthFlag = isMatch(eachCountry, seachPattran, true);
                     if(macthFlag)
                           System.out.print(eachCountry+",");
              } 
       }
      
       public static boolean isMatch(String o,String ss,boolean isNotCaseSensitive)
       {
              String outString=o;
              String searchString=ss;
              if ((o == null) && (ss == null))
                     return true;
              else if ((o != null) && (ss == null))
                     return true;
              else if ((o == null) && (ss != null))
                     return true;
              if (ss.equals("*"))
                     return (true);
              int ir = ss.indexOf("*");
              if (ir < 0)
                     return o.equalsIgnoreCase(ss);
              if(isNotCaseSensitive)
              {
                     outString = o.toLowerCase();
                     searchString = ss.toLowerCase();
              }
              boolean flag = false;
              boolean startsWithCond = false;
              boolean endsWithCond = false;
              // Make it  not case sensitive
              if (!searchString.startsWith("*"))
                           startsWithCond = true;
              if (!searchString.endsWith("*"))
                           endsWithCond = true;
              StringTokenizer st = new StringTokenizer(searchString,"*");
              int count = st.countTokens();
              String newString = new String(outString);
              String[] patterns = new String[count];
              if (count <=0)
                           return (false);
              for(int i=0;i<count;i++)
              {
                     patterns[i] = st.nextToken();
              }
              int index = 0;
              if (startsWithCond) {
                     if (!newString.startsWith(patterns[0])){
                           return (false);
                     }
              }
              if (endsWithCond) {
                     if (!newString.endsWith(patterns[count-1])){
                           return (false);
                     }
              }
              for(int j=0;j<count;j++)
              {
                     if((index = newString.indexOf(patterns[j])) >= 0)
                     {
                           flag = true;
                           index += patterns[j].length();
                           newString = newString.substring(index);
                     }
                     else
                     {
                           return(false);
                     }
              }
              return(flag);
       }
      
}