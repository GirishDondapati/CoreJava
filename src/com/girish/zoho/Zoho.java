http://www.geeksforgeeks.org/zoho-interview-experience-set-14-on-campus/      //Check This URL Once

// 1) Write a program to print sum of all numbers in given matrix?
		Ex: 1) (1 5          output: 16
				4 6)

		   2) ( 2  5  -12    output: 0
				4  1)

// 2) Dispaly the all odd values from for give array with index of odd possitions only?
		Ex: 1) [1,2,3,4,5,6,7]      output: 1,3,5,7
			2) [2,3,5,6,7,9,12,11]  output: 5,7
			3) [3,5,7]              output: 5

// 3) Display count of all o's in given number binary values?.
		Ex: 1) Input 8,   (1000)   output: 3
			2) Input 32,  (100000) Output: 5

// 4) Display total number of vowel's in given string except consicute vowel's?
		Ex: 1) Hi How are man         output: 5
		    2) Haa haa you are good   output: 2
			3) good                   output: 0

// 5) Combaind two arrays in assending order?
		Ex: 1) Input: [3,6,2,7,9] [1 5,4,8]   Output: 1,3,4,5,6,7,8,9
			2) input: [8,4,7]  [4,7,2]        Output: 2,4,4,7,7,8



// Second time Zoho interview

	Third Round: Create Collage Time table with below below conditions:
	-> 4 core subjects 3 Non Core subjects
	-> In week each core subject minimum 4 times and Non core subjects 3 minimun times
	-> In week 5 working days per day 5 periods.
	-> For Core subjects wwe have alternate staff also


1. A train overtakes two persons who are walking in the same direction in which the train is going, at the rate of 2 kmph and 4 kmph and passes them completely 
   in 9 and 10 seconds respectively. The length of the train is:

2. There is game which lasts for ninety minutes which is played only with 8 players. 

1st round aptitude questions in pipes,trains,ages,etc
c program predict the output it is not an multiple choice question  

1) Find out the angle 2hrs : 45 mins in a clock?

2) In an exam, there were 25 math qns and 75 nonmath qns. To answer a math qn, a candidate was supposed to spend twice the time he spends to answer a nonmath qn.
  If the entire exam duration was 2 hrs, find the time he spent on the math qns.
Ans:  1) Considering candidate uses full 2 hrs. or 120 min. of the exam for answering the questions.
		 If candidate spent 'x' min. on non math question and '2x' min. on maths question, then
		 (25*2x) +(75*x)=120, x=24/25 
		 So time spent on math question=25*2*24/25=48 min.
	  2) 25*2 : 75
		 50 : 75
		 2 : 3   So 120/5 = 24,  for the maths 24*2 = 48 mints

1. (1/2) of a number is 3 more than the (1/6) of the same number? Find the number. 

a. 6 b. 7 c. 8 d. 9 
	Ans: x/2 = 3+(x/6)
		=> x/2 = (18+x)/6
		=> x/3 = 3
		=> x = 9

2. 10 people, type 10 lines in 10 minutes, then to type 60 lines in 60 minutes, people needed are? 

a. 16 b. 6 c. 10 d. 60
	Ans : One person one line in 10 mints
		  10 persons will do 60 lines in 60 mints

3. If Rs. 1260 is divided amongst A, B and C in the ratio 2:3:4. What is C’s share? 

a. 850 b. 560 c. 270 d. 625 

4. If the value of x/2y = 2a, then what is the value of 2x/(x-2ay) equal to? 

a. 4 b. 8 c. 16 d. 2
	Ans:	 X=4AY PUT IT AND SOLVE
			8AY/2AY=4
			SO 4 IS THE ANSWER

5.Find the next number in the series of numbers 77,49,36,18,.........?
	Ans:  7*7=49
		  4*9=36
		  3*6=18
		  1*8=8 is Ans

6. A Caterpillar crawls a distance with speed of 21inches/min in the one direction and after feeding moves back in the same direction 
	with 7inches/min and what is the average speed of it?
		Ans: formula is 2xy/x+y. i.e; 2*21*7/21+7 =10.5 inch/min.

7. Alice,Bob,Chris,Dave,Eric,Fred,Laura used to work in a restaurant for 6 days from Tue-Sun and every one is worked for one day and at least 2 members work on a day, Mon is holiday

Restrictions:

1) Either Alice or Bob work on 1st day
2) Laura works only on 4th and 5th days
3) A 1day gap is left between Laura and Chris
4) Eric works Immediately after Bob

Questions:

1.What is the order of their working ?

A).......... B)........C)........D)..........E)........

3-5 questions will be asked from this passage

These sort of questions will be asked up to 20 from 25 in objective type, giving nearly 5-6 Passages

And rest 5 questions will be Aptitude like

1) A clock misses 1min for each hour after the midnight and the time in the clock before 1hour 30min is 13.45 and what is the current time in the clock?

A)15.00 B)15.13 C)14.59 D)14.35 E)14.30 



public class PrintNNoWith3And4RelNos {
       public static void main(String[] args) {
              System.out.println("Output For m=5,n=5: ");
              //printOutput(5,5);
              System.out.println();
              printOutput(4,3);
       }
      
       public static void printOutput(int m, int n)
       {
              int i, k = 0, l = 0;
              int r = m,c = n;
             
              char a[][] = new char[m][n];
              char x = 'X';
             
              while(k < m && l < n)
              {
                     // For filling the first row
                     for(i = l; i < n; ++i)
                     {
                           a[k][i] = x;
                     }
                     k++;
                    
                     //For filling the last row
                     for(i = k; i < m; ++i)
                     {
                           a[i][n-1] = x;
                     }
                     n--;
                    
                     //fill the last row in ma
                     if(k < m)
                     {
                           for(i = n - 1; i >= l; --i)
                           {
                                  a[m-1][i] = x;
                           }
                           m--;
                     }
                    
                    
                     if(l < n)
                     {
                           for(i = m-1; i >= k; --i)
                           {
                                  a[i][l] = x;
                           }
                           l++;
                     }
                     x = (x == '0')?'X':'0';
              }
             
              for(i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
       }
}



public class PrintLettersWithGiveNumBased {
 
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Please enter number: ");
              int gNo = sc.nextInt();
             
              printInChar(gNo);
       }
 
       public static void printInChar(int gNo)
       {
              //Think max value is 3 digits
              char str[] = new char[3];
              int i = 0;
              while(gNo > 0)
              {
                     int rem = gNo % 26;
                     if(rem == 0)
                     {
                           str[i++] = 'Z';
                           gNo = (gNo/26) - 1;
                     }
                     else
                     {
                           str[i++] = (char) ('A' + (rem - 1));
                           gNo = gNo/26;
                     }
              }
             
              System.out.println(str[2]+""+str[1]+""+str[0]);
       }
}
 
            public String round (double d, int place)
            {
                        if (place <= 0)
                        {
                                    String s = ""+(int)(d+((d > 0)? 0.5 : -0.5));
                                    return (s);
                        }
                        String s = "";
                        if (d < 0)
                        {
                                    s += "-";
                                    d = -d;
                        }
                        d += 0.5*Math.pow(10,-place);
                        if (d > 1)
                        {
                                    int i = (int)d;
                                    s += i;
                                    d -= i;
                        }
                        else
                                    s += "0";
                        if (d > 0)
                        {
                                    d += 1.0;
                                    String f = ""+(int)(d*Math.pow(10,place));
                                    s += "."+f.substring(1);
                        }
                        return (s);
            }


public class UsingRecuRevStringInReqMena {
       String reverse = "";
   
    public String reverseString(String str){
        
        if(str.lastIndexOf(" ") == -1){
            return str;
        } else {
            reverse += str.substring(str.lastIndexOf(" ")).trim()+" "
                    +reverseString(str.substring(0,str.lastIndexOf(" ")));
            return reverse;
        }
    }
    
    public static void main(String a[]){
       UsingRecuRevStringInReqMena srr = new UsingRecuRevStringInReqMena();
        System.out.println("Result: "+srr.reverseString("I Lo In is on of be cou"));
    }
}


public class ArrangeNosFirMaxInFirstFirMinInSec {
       public static void main(String[] args) {
              int gNoArr[] = {1,2,3,4,5,6,7,8,9,10};
             
              int size = gNoArr.length;
              int outNoArr[] = new int[size];
             
              int index = 0;
              for(int i = 0,j = size - 1; i < size/2; i++, j--)
        {
                     outNoArr[index] = gNoArr[j];
                     ++index;
                     outNoArr[index] = gNoArr[i];
                     ++index;
        }
             
              if(size % 2 != 0)
              {
                     int tempIndex = size/2;
                     outNoArr[size-1] = gNoArr[tempIndex];
              }
             
              for(int i = 0; i < size; i++)
              {
                     System.out.print(outNoArr[i]+ " ");
              }
             
       }
 
}

Question 1 : Write a program to determine whether a given number can be expressed as sum of two prime numbers or not.

For example 34 can be expressed as sum of two prime numbers but 23 cannot be.

public class FindGivenNoSumOfTwoPrOrNot {
 
       public static void main(String[] args) {
              Scanner sc =new Scanner(System.in);
              System.out.println("Please enter any number: ");
              int givenNo = sc.nextInt();
              System.out.println(givenNo);
             
              for( int i = 2; i < givenNo/2 ; i++)
              {
                     int temp = givenNo - i;
                     boolean firstNoPri = givenNoPriOrNot(i);
					boolean secondNoPri = flase;
                     if(firstNoPri)
                     secondNoPri = givenNoPriOrNot(temp);
                    
                     if(firstNoPri && secondNoPri)
                     {
                           System.out.println("Given No is Some of i: "+i+", temp: "+temp);
                           break;
                     }
                     else
                     {
                           continue;
                           //System.out.println("the given no is not some pri no");
                     }
              }
       }
      
       public static boolean givenNoPriOrNot(int stNo)
       {
              int count = 0;
              for(int i = 2; i <= stNo; i++)
              {
                     if(stNo%i == 0)
                     {
                           ++count;
                           if(count > 1)
                                  break;
                     }
              }
             
              if(count == 1)
                     return true;
              else
                     return false;
       }
 


public class RevOnlyEvenPossitionInGivenNo {
      
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Please enter No: ");
              int gNo = sc.nextInt();
             
              //First way converting in to string
              String noInStr = String.valueOf(gNo);
              char ar[]=noInStr.toCharArray();
        char temp;
              for(int i=1,j=ar.length-2; i < (ar.length/2); i+=2,j-=2)
        {
               temp=ar[i];
               ar[i]=ar[j];
               ar[j]=temp;
        }
              System.out.println(String.valueOf(ar));
       }
}
 

Q) Given a string, reverse only the vowels present in it and print the resulting string?


Q).	Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M 

public class UsingMatrixDisNameInPattra {
 
       public static void main(String[] args) {
              Scanner sc =new Scanner(System.in);
              System.out.println("Please enter name: ");
              String gName = sc.next();
              int size = gName.length();
             
              char Number[][]=new char[size][size];
               int i,j;
               for(i=0;i < size;i++)
               {
                   for(j=0;j < size;j++)
                   {
                   if(i == j || i+j == size-1)
                           Number[i][j]=gName.charAt(j);
                   else
                           Number[i][j]=' ';
                          
                   }
               }
              
               System.out.println("Elements in Matrix are : ");
                                       System.out.println("");
               for(i=0;i < size;i++)
               {
                   for(j=0;j < size;j++)
                   {
                       System.out.print(Number[i][j]+" ");
                   }
                   System.out.println();
               }
           } 
}
 

/* Question 4 : Write a program to check if the given words are present in matrix given below. The words can be left to right, top to bottom and the diagonals (in top to bottom direction)

zoho(Copy Above line of question  and search it in net u will get full question)
 
Given a 2D grid (G[]) of characters and a word(x), find all occurrences of given word in grid. A word can be matched in all 8 directions at any point. Word is said be found in a direction if all characters match in this direction (not in zig-zag form).

The 8 directions are, Horizontally Left, Horizontally Right, Vertically Up, Vertically down and 4 Diagonal directions.
Input:  G[][] = {"GEEKSFORGEEKS",
                 "GEEKSQUIZGEEK",
                 "IDEQAPRACTICE"};
        x = "GEEKS"

Output: pattern found at 0, 0
        pattern found at 0, 8
        pattern found at 1, 0 */


public class UsingMatrixFoundGivWordIndexs {
       public static void main(String[] args) {
              String str = "PWKCTBOFALOOERMXLATEACOTN";
              int k = 0;
              int matrixSize = 5;
             
              char Number[][]=new char[5][5];
        int i,j;
        for(i=0;i < matrixSize;i++)
        {
            for(j=0;j < matrixSize;j++)
            {
            Number[i][j]=str.charAt(k);
            k++;
                   
            }
        }
 
        System.out.println("Elements in Matrix are : ");
        System.out.println("");
        for(i=0;i < matrixSize;i++)
        {
            for(j=0;j < matrixSize;j++)
            {
                System.out.print(Number[i][j]+"  ");
            }
            System.out.println();
        }
 
              Scanner sc =new Scanner(System.in);
              System.out.println("Please enter name: ");
              String gName = sc.next();
              int size = gName.length();
             
             
         for(i=0;i < matrixSize;i++)
        {
            for(j=0;j < matrixSize;j++)
            {
            ArrayList al = new ArrayList();
            char matrixChar = Number[i][j];
            if(gName.charAt(0) == matrixChar) // && j+size < matrixSize
            {
                    if(j+size <= matrixSize)
                    {
                           al.add("("+i+", "+j+")");
                           for(int m = 1; m < size; m++)
                           {
                                  if(gName.charAt(m) == Number[i][j+m])
                                  {
                                         al.add("("+i+", "+(j+m)+")");
                                  }
                                  else
                                  {
                                         al = new ArrayList();
                                         break;
                                  }
                           }
                    }
                   
                    if(al.size() == 0 && (i+size <= matrixSize))// && (i+size < matrixSize)
                    {
                           al.add("("+i+", "+j+")");
                           for(int m = 1; m < size; m++)
                           {
                                  if(gName.charAt(m) == Number[i+m][j])
                                  {
                                         al.add("("+(i+m)+", "+j+")");
                                  }
                                  else
                                  {
                                         al = new ArrayList();
                                         break;
                                  }
                           }
                    }
                   
                    if(al.size() == 0 && (i+size <= matrixSize) && (j+size <= matrixSize))// && (i+size < matrixSize) && (j+size < matrixSize)
                    {
                           al.add("("+i+", "+j+")");
                           for(int m = 1; m < size; m++)
                           {
                                  if(gName.charAt(m) == Number[i+m][j+m])
                                  {
                                         al.add("("+(i+m)+", "+(j+m)+")");
                                  }
                                  else
                                  {
                                         al = new ArrayList();
                                         break;
                                  }
                           }
                    }
                    if(al.size() > 0)
                           System.out.println(gName+": "+al);
            }
           
            }
        }
       }
}

Question 2 : Take a 2 or 3 digit input number, reverse it and add it to the original number until the obtained number is a palindrome or 5 iterations are completed.

Input : n = 32
Output : 55
23 + 32 = 55 which is a palindrome.

Input : 39
Output : 363

 
public class CheckNoIsPalindOrNotWithSomeCond {
 
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Please enter No: ");
              int gNo = sc.nextInt();
             
              int tempNo = gNo;
             
              int itraration = 1;
              boolean isPalind = false;
             
              while(!isPalind && itraration < 5)
              {
                     itraration++;
                     int revNo = reverceNo(tempNo);
                     System.out.println("revNo: "+revNo);
                     tempNo = tempNo + revNo;
                     isPalind = isPalinCheck(tempNo);
              }
             
              if(isPalind)
                     System.out.println("Given number is "+gNo+" after calculation is palin: "+tempNo);
              else
                     System.out.println("Given no is not palin: "+gNo);
       }
      
       public static int reverceNo(int oldNo)
       {
              int revNo = 0;
              while(oldNo != 0)
              {
                     int decimalVal = oldNo % 10;
                     oldNo = oldNo / 10;
                     revNo = (revNo * 10) + decimalVal;
              }
              return revNo;
       }
      
       public static boolean isPalinCheck(int someNo)
       {
              int oldNo = someNo;
              int revNo = 0;
              while(oldNo != 0)
              {
                     int decimalVal = oldNo % 10;
                     oldNo = oldNo/10;
                     revNo = (revNo * 10) + decimalVal;
              }
              if(revNo == someNo)
                     return true;
              else
                     return false;
       }
}




 public class PrintGivenNoPossibleLetters {
       public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
              System.out.println("Please enter number: ");
              String gStr = sc.next();
             
              printInChar(gStr, "");
       }
 
       public static void printInChar(String gStr, String outStr)
       {
              if(gStr.isEmpty())
                     System.out.println(outStr);
              else
              {
                     int no = Integer.parseInt(gStr.substring(0,1));
                     printInChar(gStr.substring(1),outStr + (char)('A'+(no-1)));
                    
                     if(gStr.length() >= 2 && (no = Integer.parseInt(gStr.substring(0,2))) <= 26)
                     {
                           printInChar(gStr.substring(2),outStr + (char)('A'+(no-1)));
                     }
              }
       }
}
 
 
 
 
 
 public class FindCountOfCharInGivenString
{
       static final int noOfChar = 256;
      
       void fillCharCount(String str, int[] count)
       {
              for(int i = 0; i < str.length(); i++)
              {
                     System.out.println(count[str.charAt(i)]++);
              }
       }
      
       void printDups(String str)
       {
              int count[] = new int[noOfChar];
              //fillCharCount(str, count);
             
              for(int i = 0; i < str.length(); i++)
              {
                     count[str.charAt(i)]++;
              }
             
              for(int i = 0; i < noOfChar; i++)
              {
                     if(count[i] > 1)
                           System.out.println("Char: " +(char) i+" "+count[i]);
              }
       }
      
       public static void main(String[] args)
       {
              String inputLine = "couuoont coun";
              FindCountOfCharInGivenString obj = new FindCountOfCharInGivenString();
              obj.printDups(inputLine);
 
       }
}



public class ConvertRomanNumbersToNumaricNumbers
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num, th, h, t, u;
		System.out.print("Enter a Number : ");
		num = Integer.parseInt(br.readLine()); // accepting decimal number
		if (num > 0 && num < 4000) // checking whether the number is within the range [1-3999]
		{
			String thou[] = { "", "M", "MM", "MMM" };
			String hund[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC",	"DCCC", "CM" };
			String ten[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
			String unit[] = { "", "I", "II", "III", "IV", "V", "VI", "VII",	"VIII", "IX" };
			/* Finding the digits in the thousand, hundred, ten and units place */
			th = num / 1000;
			h = (num / 100) % 10;
			t = (num / 10) % 10;
			u = num % 10;
			/* Displaying equivalent roman number */
			System.out.println("Roman Equivalent = " + thou[th] + hund[h] + ten[t] + unit[u]);
		}
		/* Displaying an error message if the number entered is out of range */
		else
			System.out.println("\nYou entered a number out of Range.\nPlease enter a number in the range [1-3999]");
	}
}


       public static void romanToDecimal(java.lang.String romanNumber)

       {

                      int decimal = 0;

                      int lastNumber = 0;

                      String romanNumeral = romanNumber.toUpperCase();

                      //operation to be performed on upper cases even if user enters roman values in lower case chars

                      for (int x = romanNumeral.length() - 1; x >= 0 ; x--)

                      {

                          char convertToDecimal = romanNumeral.charAt(x);

                          switch (convertToDecimal)

                          {

                              case 'M':

                                  decimal = processDecimal(1000, lastNumber, decimal);

                                  lastNumber = 1000;

                                  break;

 

                              case 'D':

                                  decimal = processDecimal(500, lastNumber, decimal);

                                  lastNumber = 500;

                                  break;

 

                              case 'C':

                                  decimal = processDecimal(100, lastNumber, decimal);

                                  lastNumber = 100;

                                  break;

 

                              case 'L':

                                  decimal = processDecimal(50, lastNumber, decimal);

                                  lastNumber = 50;

                                  break;

 

                              case 'X':

                                  decimal = processDecimal(10, lastNumber, decimal);

                                  lastNumber = 10;

                                  break;

 

                              case 'V':

                                  decimal = processDecimal(5, lastNumber, decimal);

                                  lastNumber = 5;

                                  break;

 

                              case 'I':

                                  decimal = processDecimal(1, lastNumber, decimal);

                                  lastNumber = 1;

                                  break;

                          }

                      }

                      System.out.println(decimal);

                  }

 

                  public static int processDecimal(int decimal, int lastNumber, int lastDecimal)

                  {

                      if (lastNumber > decimal)

                          return lastDecimal - decimal;

                      else

                          return lastDecimal + decimal;

                  }

 

      

        private static String getRomanEquivalentOfInteger(int number)

       {

                if(number<=0)

                {

                       return "not defined";

                }

      

                //Noting down all Unique characters where Roman numbers deviated from usual Pattern.

                //unique patterns noted here are to support integers from 1 to 399 as program only support till 399.

                //if we want program to support more integers then identify patterns where Roman numbers have unusual patterns after 399 and add it in map.

                Map<Integer, String> map = new LinkedHashMap<Integer, String>();

                map.put(1000, "M");

                map.put(900, "CM");

                map.put(500, "D");

                map.put(400, "CD");

                map.put(100, "C");

                map.put(90, "XC");

                map.put(50, "L");

                map.put(40, "XL");

                map.put(10, "X");

                map.put(9, "IX");

                map.put(5, "V");

                map.put(4, "IV");

                map.put(1, "I");

               

                String romanEqui="";

         

                // Iterate map, check how many times given number has 100 in it, then check how many time remaining number has 90 in it and so on.

                // or we can also say, is number divisible by 100, remaining number is divisible by 90 and so on.

                // if number is 153, then first will see how many time number has 100 in it, which is 1 time.

                // 100 - 1 time in 150 (remaining number is 150 - 100 = 53) OR 153/100 = 1 remaining 153%100 = 53

                // 90  - 0 time in  53 (remaining number is  53 -  90 = 0)  OR  53/90 = 0 remaining   53 % 90 = 53 (we only need to find perfectly divisible numbers.) 

                // 50  - 1 time in  53 (remaining number is  53 -  50 = 3)  OR  53/50 = 1 remaining   53 % 50 = 3

                // 40  - 0 time in   3 (remaining number is   3 -  40 = 0)  OR   3/40 = 0 remaining    3 % 40 = 3

                // 10  - 0 time in   3 (remaining number is   3 -  10 = 0)  OR   3/10 = 0 remaining    3 % 10 = 3

                // 9   - 0 time in   3 (remaining number is   3 -   9 = 0)  OR    3/9 = 0 remaining    3 %  9 = 3

                // 5   - 0 time in   3 (remaining number is   3 -   5 = 0)  OR    3/5 = 0 remaining    3 %  5 = 3

                // 4   - 0 time in   3 (remaining number is   3 -   4 = 0)  OR    3/4 = 0 remaining    3 %  4 = 3

                // 1   - 3 time in   3 (remaining number is   3 -   1 = 0)  OR    3/1 = 3 remaining    3 %  1 = 0

 

                for (Map.Entry<Integer, String> entry : map.entrySet())

                {

                       int key = entry.getKey();

                     //  System.out.println(key+"  -> "+(number/key));

                       if(number/key!=0)

                       {

                           // System.out.println(key+"  --> "+number);

                             for (int i = 0; i < (number/key); i++)

                             {

                                    romanEqui = romanEqui + map.get(key);

                                  //  System.out.println(romanEqui);

                             }

                             number = number % key;

                       }  

                }

                return romanEqui;

             }     

       }



public class CombainedTwoMatrixAndShort {
	public static void main(String[]args)
	{

		  int[]a = {1, 2,6, 3};
		  int[]b = {5,4,6,7};
		  int[]c = new int[a.length+b.length];
		  int i;
		  
		  int d[] = merge(a,b);
		  for(int k=0; k<d.length; k++)
			  System.out.print(d[k]+" ");
		  System.out.println();
		  
		  /*for(i=0; i<a.length; i++)
		     c[i] = a[i];

	     for(int j=0; j<b.length; j++)
	        c[i++]=b[j];

		  for(int k=0; k<c.length; k++)
		  System.out.print(c[k]+" ");*/
		}
	
	
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)  
	       answer[k++] = a[i] < b[j] ? a[i++] :  b[j++];

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}
}


package com.preparation.zoho;
//Java program to construct binary tree from
//given array in level order fashion

public class FindAllLeafsFromBinary
{
     Node root;
     // Tree Node
     static class Node
     {
          int data;
          Node left, right;
          Node(int data)
          {
              this.data = data;
              this.left = null;
              this.right = null;
          }
     }

     // Function to insert nodes in level order
     public Node insertLevelOrder(int[] arr, Node root, int i)
     {
          // Base case for recursion
          if (i < arr.length)
          {
            Node temp = new Node(arr[i]);
            root = temp;
            // insert left child
             root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
              // insert right child
              root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
          }
          return root;
     }

     // Function to print tree nodes in InOrder fashion
     public void inOrder(Node root)  //left root right
      {
          if (root != null) {
              inOrder(root.left);
              System.out.print(root.data + " ");
              inOrder(root.right);
          }
     }

     public void postOrder(Node node)
     {
             if (node == null)
                 return;

             // first recur on left subtree
             postOrder(node.left);

             // then recur on right subtree
             postOrder(node.right);

             // now deal with the node
             System.out.print(node.data + " ");
     }

     void preOrder(Node node)
     {
      if (node == null)
          return;

      /* first print data of node */
      System.out.print(node.data + " ");

      /* then recur on left sutree */
      preOrder(node.left);

      /* now recur on right subtree */
      preOrder(node.right);
  }



     // Driver program to test above function
     public static void main(String args[])
     {
    	 FindAllLeafsFromBinary t2 = new FindAllLeafsFromBinary();
          int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 , 10 ,11};
          t2.root = t2.insertLevelOrder(arr, t2.root, 0);
          System.out.println("In Order");
          t2.inOrder(t2.root);
          System.out.println();
          System.out.println("Post Order");
          t2.postOrder(t2.root);
          System.out.println();
          System.out.println("Pre Order");
          t2.preOrder(t2.root);
     }
}

--------------------------------------------------------------------------------
	Count Leafs from binary tree
	-------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CandidateCode {

	 static int delNodeIndex;
		Node root;
		// Tree Node
		static class Node
		{
			int data;
			int index;
			Node left, right;
			Node(int data,int index)
			{
				this.data = data;
				this.index = index;
				this.left = null;
				this.right = null;
			}
		}
		
	    public static void main(String args[] ) throws Exception {
	        //Write code here
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String noOfNodesStr = reader.readLine();
			int noOfNodes = Integer.parseInt(noOfNodesStr);

			int nodesArr[] = new int[noOfNodes];
			String nodesStr = reader.readLine();

			String deleteIndexStr = reader.readLine();
			delNodeIndex = Integer.parseInt(deleteIndexStr);

			StringTokenizer sz = new StringTokenizer(nodesStr," ");
			int count = sz.countTokens();
			for(int i = 0; i < noOfNodes; i++)
			{
				String temp = sz.nextToken();
				nodesArr[i] = Integer.parseInt(temp);
			}

			CandidateCode obj = new CandidateCode();
			obj.root = obj.insertLevelOrder(nodesArr, obj.root, 0);
			System.out.println(obj.getLeafCount());
		}
		

		
			// Function to insert nodes in level order
		public Node insertLevelOrder(int[] arr, Node root, int i)
		{
			// Base case for recursion
			if (i < arr.length) {
				Node temp = new Node(arr[i],i);
				root = temp;

				// insert left child
				root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

				// insert right child
				root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
			}
			return root;
		}
		
		int getLeafCount()
		{
		return getLeafCount(root);
		}

		int getLeafCount(Node node)
		{
			if (node == null)
				return 0;

			// first recur on left subtree
			if(delNodeIndex == node.index)
				return 0;

			if (node.left == null && node.right == null)
				return 1;
			else
				return getLeafCount(node.left) + getLeafCount(node.right);
		}
	}


         public String round (double d, int place)
            {
				if (place <= 0)
				{
							String s = ""+(int)(d+((d > 0)? 0.5 : -0.5));
							return (s);
				}
				String s = "";
				if (d < 0)
				{
							s += "-";
							d = -d;
				}
				d += 0.5*Math.pow(10,-place);
				if (d > 1)
				{
							int i = (int)d;
							s += i;
							d -= i;
				}
				else
							s += "0";
				if (d > 0)
				{
							d += 1.0;
							String f = ""+(int)(d*Math.pow(10,place));
							s += "."+f.substring(1);
				}
				return (s);
            }








Why Java does not support multiple inheritance?
===============================================
1) First reason is ambiguity around Diamond problem, 

We have two classes B and C inheriting from A.
Assume that B and C are overriding an inherited method and they provide their own implementation. 
Now D inherits from both B and C doing multiple inheritance. 
D should inherit that overridden method, which overridden method will be used? 
Will it be from B or C? Here we have an ambiguity.

2) Second reason is that multiple inheritances does complicate the design and creates problem during casting and constructor chaining.
Also java avoids this ambiguity.

So this can be solved interfaces.
Since interface only have method declaration and doesn't provide any implementation.
There will only be just one implementation of specific method hence there would not be any ambiguity.

JDBC
===========
Write a pgm to connect the database
------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection 
{
	public static void main(String args[])
	{
		Connection conn = null;
		Statement st = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost","username","pw");
			st = conn.createStatement();
			String sqlQuery = "create table emp(id int primary key, name varchar(20), dept varchar(20), sal int)";
			boolean b = st.execute(sqlQuery);
			if(b == true)
				System.out.println("suceessfully created");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

Create one database and exit
----------------------------
mysql> create database databasename;
mysql> exit

statement,preparedStatement and read the data from database and print it
--------------------------------------------------------------------------------
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database
{
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DATABASE_URL = "jdbc:mysql://localhost";
	private static final String USERNAME = "uname";
	private static final String PASSWORD = "pw";

	public static void createConnection() throws ClassNotFoundException
	{
		Connection conn = null;
		Statement st = null;
		try 
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
			st = conn.createStatement();
			String sqlQuery = "CREATE TABLE emp(id int primary key,name varchar(15),department int,salary int)";
			boolean b = st.execute(sqlQuery);
			if(b == true)
				System.out.println("Query executed successfully");
		}
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try 
			{st.close();	conn.close();
			} catch (Exception e) {System.exit(1);}
		}
	}

	public static void createEmployee(int id, String name, int dept, int sal) throws ClassNotFoundException
	{
		Connection conn = null;
		PreparedStatement preparedStatement = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
			String sqlQuery = "INSERT INTO emp VALUES(?,?,?,?)";
			preparedStatement = conn.prepareStatement(sqlQuery);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, dept);
			preparedStatement.setInt(4, sal);
			boolean b = preparedStatement.execute();
			if(b == true)
				System.out.println("1 record inserted...");
		}
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
			preparedStatement.close();
			conn.close();
			} catch (Exception e) {System.exit(1);}
		}
	}
	
	public static void getEmployee() throws ClassNotFoundException
	{
		Connection conn = null;
		Statement st = null;
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
			String sqlQuery = "secect * from emp";
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sqlQuery);
			if(rs != null)
			{
				while(rs.next())
				{
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String dept = rs.getString("dept");
					int sal = rs.getInt("sal");
					System.out.println(id+" "+name+" "+dept+" "+sal);
				}
			}
		}
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
			st.close();
			conn.close();
			} catch (Exception e) {System.exit(1);}
		}
	}

	public static void main(String[] args)
	{
	
	}
}

Exception Handling
=====================
Exception Handling-->write a pgm which throw checked exception, null pointer exception, program with try, catch finally
------------------------------------------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWrite
{
	public static void main(String args[]) throws IOException,FileNotFoundException //checked exception
	{
		String s = null;
		System.out.println(s.length()); // null pointer exception will occur
		
		BufferedReader br = new BufferedReader(new FileReader("e:\\read.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\write.txt"));
		String thisLine = "";
		try
		{
			while ((thisLine = br.readLine()) != null) 
			{
				bw.write(thisLine);
				bw.newLine();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				br.close();
				bw.close();
			} catch (IOException e) {e.printStackTrace();}
		}
	}
}

write a program to get list of all from a folder in java
---------------------------------------------------------
import java.io.File;
class FileTest
{
	public static void main(String[] args) 
	{
		File folder = new File("e:");
		File[] listOfFiles = folder.listFiles();
		if(listOfFiles == null)
		{
			System.out.println("ther is no files");
			return;
		}
		for (int i=0; i<listOfFiles.length; i++)
		{
			if (listOfFiles[i].isFile())
			{
				System.out.println("File " + listOfFiles[i].getName());
			}
		}
	}
}

---------------------(Or) use below method with recursion------------------------------------
private void listContents(File file)
{
	String as[] = file.list();
	for(int i = 0; i < as.length; i++)
	{

	    File file1 = new File(file, as[i]);
	    if(file1.isDirectory())
	    {
		folders++;
		System.out.println("Folder Name: "+file1.getName());
		System.out.println();
		listContents(file1);
	    }
	    else
	    {
		total_files++;
		filesSize+=file1.length();
		System.out.println("  File Name:   "+file1.getName());
		/*String s1 = file1.getAbsolutePath();
		System.out.println(s1+" "+file1.length());*/
	    }
}

-----------------------------------------------------------------------------------------

Write a program to read input from console and print until it receives quit as input
------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadData 
{
	public static void main(String args[])throws Exception
	{
		System.out.println("Enter data: ");
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);  
		String line = "";
		while(!line.equalsIgnoreCase("quit"))
		{
			line = br.readLine();  
			System.out.println("The data is: "+line);
		}
		br.close();
		r.close();
	}
}


String
===========
write a program to reverse a string and print it
-------------------------------------------------------
public class ReverseString 
{
	public static void main(String args[])
	{
		String original = "mohanapriya";
		int length = original.length();
		String reverse = "";
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse + original.charAt(i);
		}
		System.out.println(reverse);
	}
}
Write a program to differentiate string(equals, = ) method
-----------------------------------------------------------------
"==" used to compare data for primitive data type variables .
"==" operator compares objects references
equals() method and compares data of two objects.
public class ReverseString 
{
	public static void main(String[] args) 
	{
		Integer i = new Integer(10);
		Integer j = i;
		boolean b = (i == j);
		System.out.println(b);
		 
		i = new Integer(10);
		j = new Integer(10);
		b = (i == j);
		System.out.println(b);
		 
		b = i.equals(j);
		System.out.println(b);
		 
	}
}

Constructor & Design Pattern
================================
Write a singleton class
-----------------------------
Singleton class means we can create only one object for the given class.
A singleton class constructor is private, so that we can restrict the creation of the object.
Provide a static method to get instance of the object, wherein we can handle the object creation inside the class only.

public class MySingleton 
{
	private static MySingleton myObj;
	private MySingleton()
	{
	}

	public static MySingleton getInstance()
	{
		myObj = new MySingleton();
		return myObj;
	}

	public void test()
	{
		System.out.println("It is working!!!");
	}

	public static void main(String a[])
	{
		MySingleton ms = getInstance();
		ms.test();
	}
}

Write a Constructor overloading program and print some message from both the constructor.
-------------------------------------------------------------------------------------------
public class ConstructorOverLoading 
{
	ConstructorOverLoading()
	{
		System.out.println("parameterless constructor");
	}
	ConstructorOverLoading(String s)
	{
		System.out.println("parameterised constructor==>"+s);
	}

	public static void main(String a[])
	{
		ConstructorOverLoading obj = new ConstructorOverLoading();
		ConstructorOverLoading obj1 = new ConstructorOverLoading("yes");
	}
}

Sorting & Logger
==================
write a program to sort the numbers in ascending order from an array like 10,2,8,3,7,1,0,13 and print the sorting in each step
------------------------------------------------------------------------------------------------------------------------------
public class SortTest 
{
	public static void main(String[] args) 
	{
		int[] input = {10,2,8,3,7,1,0,13};
		int length = input.length;
		for(int j=length; j>=0; j--) 
		{
			for(int i=0; i<length-1; i++) 
			{
				int k = i+1;
				if(input[i] > input[k]) 
				{
					int temp = input[i];
					input[i] = input[k];
					input[k] = temp;
				}
			}
		}
		for(int i=0; i<length; i++) 
		{
			System.out.print(input[i]+" ");
		}
	}
}

Write a java logger
---------------------
Java contains the Java Logging API. This logging API allows you to configure which message types are written.
Logging is the process of writing log messages to log files during the execution of a program. 
This logging is used to report error, warning and info messages. So these messages can be retrieved and analysed later.

The java.util.logging package provides the logging capabilities via the Logger class.
The log levels define the severity of a message.
lists of  Log Levels:
SEVERE	The important messages (e.g. fatal program errors).
WARNING	Intended for warning messages.
INFO	Informational runtime messages.
CONFIG	Informational messages about configuration settings/setup.
FINE	Used for greater detail, when debugging/diagnosing problems.
FINER	Even greater detail.
FINEST	The lowest value; greatest detail.
we can define,
private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

Collections
==============
Write a program to use Iterator
---------------------------------
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample 
{
	public static void main(String a[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);al.add(2);al.add(1);
		al.add(3);al.add(1);

		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Integer i = (Integer) itr.next();
			System.out.println("i==>"+i);
		}
	}
}

System Properties
====================
write a program to print the system properties of java and check which OS it is.
--------------------------------------------------------------------------------------
import java.util.Enumeration;
import java.util.Properties;
public class ListSystemProperties 
{
	public static void main(String[] args)
	{
		String os_name = System.getProperty("os.name");
		System.out.println("os_name-->"+os_name);
		Properties systemProperties = System.getProperties();
		Enumeration enuProp = systemProperties.propertyNames();
		while(enuProp.hasMoreElements()) 
		{
			String propertyName = (String) enuProp.nextElement();
			String propertyValue = systemProperties.getProperty(propertyName);
			System.out.println(propertyName + ": " + propertyValue);
		}

		//By Using getEnv method
		Map systemProperties1 = System.getenv();
		Set keySet = systemProperties1.keySet();
		Iterator itr = keySet.iterator();
		while(itr.hasNext()) 
		{
			String propertyName = (String) itr.next();
			String propertyValue = System.getenv(propertyName);
			System.out.println(propertyName + ": " + propertyValue);
		}
	}
}


Networking
===========
Write a program to get IP address of a Host in Java
----------------------------------------------------
import java.net.InetAddress;
import java.net.UnknownHostException;
public class MyPcLocalhostName 
{
	public static void main(String[] args)
	{
		InetAddress ip = null;
		try 
		{
			ip = InetAddress.getLocalHost();
			System.out.println("Current IP address : " + ip);
		}
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
	}
}

Write a program to get Host name by IP address in Java
-------------------------------------------------------
import java.net.InetAddress;
public class HostNameByIpAddress
{
	public static void main(String args[]) throws Exception
	{
		InetAddress inetAddress = InetAddress.getByName("169.254.86.225");//get the host Inet using ip
		System.out.println ("Host Name: "+ inetAddress.getHostName());//display the host
	}
}
Write a program to get my machine or local host's Host name in Java
-------------------------------------------------------------------
import java.net.InetAddress;
import java.net.UnknownHostException;
public class GetIPAddressFromHostname
{
	public static void main(String[] args)
	{
		try
		{
			InetAddress inetAddr = InetAddress.getByName("mohanapriya");
			byte[] addr = inetAddr.getAddress();
			// Convert to dot representation
			String ipAddr = "";
			for (int i = 0; i < addr.length; i++) 
			{
				if (i > 0)
				{
					ipAddr += ".";
				}
				ipAddr += addr[i] & 0xFF;
			}
			System.out.println("IP Address: " + ipAddr);
		}
		catch (UnknownHostException e) 
		{
			System.out.println("Host not found: " + e.getMessage());
		}
	}
}

Write a program to get list of all IPs of a given Host in Java
--------------------------------------------------------------
import java.net.InetAddress;
import java.net.UnknownHostException;
public class ListOfAllIpsByHost
{
	public static void main(String a[])
	{
		try
		{
			InetAddress[] myHost = InetAddress.getAllByName("mohanapriya");
			for(InetAddress host:myHost)
			{
				System.out.println(host.getHostAddress());
			}
		} 
		catch (UnknownHostException ex) 
		{
			ex.printStackTrace();
		}
	}
}

Threads
========
Runnable vs Thread

If the class provides more functionality rather than just running as Thread, 
Then we can implement Runnable interface to provide a way to run it as Thread. 

If the class only goal is to run as Thread, we can extend Thread class.

Implementing Runnable is preferred because java supports implementing multiple interfaces.
If you extend Thread class, you can?t extend any other classes.

Write a program by extending thread
-----------------------------------
By extending Thread class, we must  override run() method.
Call start() method to start executing the thread object.

class MyRunnableThread extends Thread
{
	public static int myCount = 0;
	public MyRunnableThread()
	{
	}
	public void run() 
	{
		while(myCount <= 10)
		{
			try
			{
				System.out.println("Runnable Thread: "+(++myCount));
				Thread.sleep(100);
			} 
			catch (InterruptedException iex) 
			{
				System.out.println("Exception in thread: "+iex.getMessage());
			}
		}
	} 
}
public class ThreadTest
{
	public static void main(String a[])
	{
		System.out.println("Starting Main Thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		mrt.start();
		while(MyRunnableThread.myCount <= 10)
		{
			try
			{
				System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
				Thread.sleep(100);
			} 
			catch (InterruptedException iex){
				System.out.println("Exception in main thread: "+iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}

Write a program by implementing runnable Interface
--------------------------------------------------
class MyRunnableThread implements Runnable
{
	public static int myCount = 0;
	public MyRunnableThread()
	{
	}
	public void run() 
	{
		while(myCount <= 10)
		{
			try
			{
				System.out.println("Runnable Thread: "+(++myCount));
				Thread.sleep(100);
			} 
			catch (InterruptedException iex) 
			{
				System.out.println("Exception in thread: "+iex.getMessage());
			}
		}
	} 
}
public class RunnableTest
{
	public static void main(String a[])
	{
		System.out.println("Starting Main Thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		while(MyRunnableThread.myCount <= 10)
		{
			try
			{
				System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
				Thread.sleep(100);
			} 
			catch (InterruptedException iex){
				System.out.println("Exception in main thread: "+iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");
	}
}

Switch case
=============
Write a switch case statement
------------------------------------
public class SwitchProgram 
{
	public static void main(String args[])
	{
		char grade = 'A';	
		switch(grade)
		{
			case 'A' :
				System.out.println("Excellent!"); 
				break;
			case 'B' :
			case 'C' :
				System.out.println("Well done");
			break;
			case 'D' :
				System.out.println("You passed");
			case 'F' :
				System.out.println("Better try again");
				break;
			default :
				System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);
	}
}

write a program to get the list of running process and kill notepad.exe
------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ProcessTest 
{
	public static void main(String args[]) throws Exception
	{
		Process p = Runtime.getRuntime().exec("tasklist");
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while((line = reader.readLine()) != null) 
		{
			if (line.indexOf("notepad.exe") > -1)
			{
				Runtime.getRuntime().exec("taskkill /F /IM notepad.exe");
				System.out.println("success");
			}
		}
	}
}

How compiler knows checked and unchecked exception
----------------------------------------------------
Compiler knows by the way of exception hierarchy.
checked exception extends java.lang.Exception
unchecked exception extends java.lang.RuntimeException

The static keyword can be used in 3 scenarios:
-------------------------------------------------
static variable:
	When a variable is declared with the keyword ?static?, its called a ?class variable?.
	All instances share the same copy of the variable.
	A class variable can be accessed directly with the class, without the need to create a instance.
	It is a variable which belongs to the class and not to object(instance)
	Static variables are initialized only once, at the start of the execution.
	These variables will be initialized first, before the initialization of any instance variables
	A single copy to be shared by all instances of the class.
	A static variable can be accessed directly by the class name and doesn?t need any object
static method:
	It is a method which belongs to the class and not to the object(instance)
	A static method can access only static data. It can not access non-static data (instance variables)
	A static method can call only other static methods and can not call a non-static method from it.
	A static method can be accessed directly by the class name and doesn?t need any object
	A static method cannot refer to ?this? or ?super? keywords in anyway
static block:
	The static block, is a block of statement inside a Java class that will be executed when a class is first loaded in to the JVM.




2. Write a program to take a backup of a particular folder   Now, backup folder1 & folder2 exactly at 10:00AM     
3. Show ads during user login  (Either use database or use flat file)
  Ad 1 to 5

User1 logs in -> All 5 ads should be shown -> Closing the Ad -> relogin -> No ads should shown -> Add a new ad -> Login Again -> new ad alone should shown
   User2 -> same -> NOT closing the ad -> relogin -> Again 5 ads should shown-> Add a new ad -> Login Again -> All the ads should shown


------------------------------------------------------------------------------------------------------------------

import java.util.StringTokenizer;
public class Testt 
{
	/*public static void main(String[] args)
	{
		double a=9;
		double b=2;
		double c=a/b;
		System.out.println(c);
	}*/

	public static void main(String[] args) 
	{
		int tt=0;
		String line1 = "mas\\charles * 3566  * 15";
		String nu1=null;
		if(nu1.equals("ywyu"))
			tt=10;
		StringTokenizer st = new StringTokenizer(line1,"*");
		String req0=st.nextToken();
		st.nextToken();
		String req1=st.nextToken();
		//String req2=st.nextToken();// NoSuchElementException at run time
		int a1=10;
		float f=35f;
		double d=346.587;
		long l=928;
		System.out.println(req0+"  "+req1+" "+a1+" "+f+" "+d+" "+l+" "+nu1);
		
	}
}
---------------------------------------------------------------------------------------------------------------


A relationship between 'Wife & Husband' must be like 'Fish & Water' but not like 'fish & fisherman'

public class Test 
{
	public static void main(String args[])
	{
		String new_string = "";

		String original_str = "what is this is? isthis yoursis rightis?";
		String search_str = "is";
		String replace_str = "was";
		
		char[] original_chr = original_str.toCharArray();
		char[] search_ch = search_str.toCharArray();
		boolean flag = false;
		int original_length = original_chr.length;
		
		for(int i=0; i<original_length; i++)
		{
			if(original_chr[i] == search_ch[0])
			{
				int count = 0;
				int k = i;
				for(int j=1; j<search_ch.length; j++)
				{
					k++;
					if(original_chr[k] == search_ch[j])
					{
						count++;
						flag = true;
						continue;
					}
					break;
				}
				if(flag)
				{
					new_string = new_string + replace_str;
					i = i + count+1;
					flag = false;
				}
			}
			if(i < original_length)
				new_string = new_string + original_chr[i];
		}
		System.out.println("final output-->"+new_string);
	}
}


=================================================



//1 to 100 peoples standing in circle 1 kills 2, 3 kills 4......
public class KillingPersions
{
	//It was working fine
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number: ");
		int totalNo = sc.nextInt();
		
		ArrayList al = new ArrayList();
		for (int i = 1 ; i <= totalNo ; i++)
		{
			al.add(i);
		}
		for(int i = 1 ; i < al.size() ; ++i)
		{
			System.out.println(i);
			if(al.size() == 1)
				break;
			if(i == al.size()-1)
			{
				al.remove(i);
				//System.out.println(al);
				i = 0;
			}
			else
			{
				al.remove(i);
				//System.out.println(al);
				if((i+1) == al.size())
				{
					al.remove(0);
					//System.out.println(al);
					i=0;
					continue;
				}
			}
		}
		System.out.println("Res: "+al.get(0));
	}
}




// My Preparation 
1) What is difference between System.exit(0), System.exit(1) and System.exit(-1)?
Ans: 1) System.exit terminates JVM
	--> Parameter Passing zero as parameter means normal termination &
	--> Passing non-zero as parameter means abnormal termination.
     2) System.exit(n) internally calls Runtime.getRuntime().exit(n)
	--> System.exit(0)
		If exit(0) method returns 0 that means method execution was successful. Its Normal termination.
	--> System.exit(1) or System.exit(-1)
		If exit() method have negative or possitive ie non-zero is abnormal termination. If we got any exption in application running time then we need to
		stop entaire application this called abe normal case.

2) How to use Log4j for log application loggs?
Ans: 1)With out using property file using Log4j.
	-> logs messages with 5 different priorities. Those are: debug, info, warn, error and fatal. 
	-> For crating logger object like: final static Logger logger = Logger.getLogger(classname.class);
	-> Ex: if(logger.isDebugEnabled()){
		    logger.debug("This is debug");
		}

		//logs an error message with parameter
		logger.error("This is error : " + parameter);

		//logs an exception thrown from somewhere
		logger.error("This is error", exception);

	# Root logger option
	log4j.rootLogger=INFO, file, stdout

	# Direct log messages to a log file
	log4j.appender.file=org.apache.log4j.RollingFileAppender
	log4j.appender.file.File=C:\\logging.log
	log4j.appender.file.MaxFileSize=10MB
	log4j.appender.file.MaxBackupIndex=10
	log4j.appender.file.layout=org.apache.log4j.PatternLayout
	log4j.appender.file.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n

	# Direct log messages to stdout
	log4j.appender.stdout=org.apache.log4j.ConsoleAppender
	log4j.appender.stdout.Target=System.out
	log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
	log4j.appender.stdout.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n

	Let break it down :
	%d{yyyy-MM-dd HH:mm:ss} = Date and time format, refer to SimpleDateFormat JavaDoc.
	%-5p = The logging priority, like DEBUG or ERROR. The -5 is optional, for the pretty print format.
	%c{1} = The logging name we set via getLogger(), refer to log4j PatternLayout guide.
	%L = The line number from where the logging request.
	%m%n = The message to log and line break.

Q) How to create log file for user difined name?

public synchronized void logToErrorFile(String type,
	String entity, String msg)
{
	if (msg == null)
		return;
	PrintWriter logWriter;
	String log;
	String logDateAndTime = dateInfo.egetDate();

	try
	{
		//open log file for writing
		logWriter = new PrintWriter(new FileWriter
			  (E:\\LocalPath\\errfile.log,true));
	}
	catch(Exception e)
	{
		System.err.println("Cannot open log file ");
		return;
	}
	log=new String(logDateAndTime+" "+type + " " +entity+": "+msg);
	logWriter.println(log);
	logWriter.close();
	logWriter = null;
}
In ur code we have to call with LoggerClass.logToErrorFile("Error,Worning,Info,fatel","Test Name","Error Msg);

Q) How to create custam exception our own?

	If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to
	customize the exception according to user need.

By the help of custom exception, you can have your own exception and message.
Let's see a simple example of java custom exception.

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

Note: Throwable is a class. It root class for all Exception classes including error.


-) What is diffrent between the Checked and UnChecked Exceptions?
	1) Checked: are the exceptions that are checked at compile time. If some code within a method throws a checked exception,
   then the method must either handle the exception or it must specify the exception using throws keyword.

	For example, consider the following Java program that opens file at locatiobn ?C:\test\a.txt? and prints first three lines of it.
    The program doesn?t compile, because the function main() uses FileReader() and FileReader() throws a checked exception FileNotFoundException.
    It also uses readLine() and close() methods, and these methods also throw checked exception IOException

	import java.io.*;
	class Main {
	    public static void main(String[] args) {
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		 
		for (int counter = 0; counter < 3; counter++) 
		    System.out.println(fileInput.readLine());
		 
		fileInput.close();
	    }
	}

	To fix the above program, we either need to specify list of exceptions using throws, or we need to use try-catch block. We have used throws in the
     below program. Since FileNotFoundException is a subclass of IOException, we can just specify IOException in the throws list and make the above program compiler-error-free.

	import java.io.*;
	class Main {
	    public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\test\\a.txt");
		BufferedReader fileInput = new BufferedReader(file);
		 
		// Print first 3 lines of file "C:\test\a.txt"
		for (int counter = 0; counter < 3; counter++) 
		    System.out.println(fileInput.readLine());
		 
		fileInput.close();
	    }
	}
	Run on IDE
	Output: First three lines of file ?C:\test\a.txt?

	Note: If with out having any checked exception code if we used checked exception.Then also compailer will not allow to compaile. It will give unreachable excpetion problem like below
	Below program it didn't compaile. It will show "Unreachable catch block for IOException. This exception is never thrown from the try statement body" like that compaile time
	import java.io.IOException;
	public class Arcane1 {
		public static void main(String[] args) {
		try {
			System.out.println("Hello world");
		} catch (IOException e) {
			System.out.println("I?ve never seen println fail!");
		}
		}
	}

	2) Unchecked are the exceptions that are not checked at compiled time. In C++, all exceptions are unchecked, so it is not forced by the compiler to
     either handle or specify the exception. It is up to the programmers to be civilized, and specify or catch the exceptions.
	In Java exceptions under Error and RuntimeException classes are unchecked exceptions, everything else under throwable is checked.
	Consider the following Java program. It compiles fine, but it throws ArithmeticException when run. The compiler allows it to compile,
      because ArithmeticException is an unchecked exception.

      Note: For Unchecked Exception u can use anywhere. If that exception related case if not there also it will compaile. But checked exception not allow to compaile
	class Main {
	   public static void main(String args[]) {
	      int x = 0;
	      int y = 10;
	      int z = y/x;
	  }
	}

-) data hiding?
   Hide data means outside persons can't able to access from our decalred class variables and functions by using private specifier we are doing that.

-) data abstraction?
   Highlight the set of serveces with hiding the internal implimentation details is called abstraction. 

-) encapsulation?
    Encapsulation is a process of wrapping of data and methods in a single unit is called encapsulation. Encapsulation is achieved in java language by class concept.
       Combining of state and behavior in a single container is known as encapsulation. In java language encapsulation can be achieve using class keyword, 
    state represents declaration of variables on attributes and behavior represents operations in terms of method.
    Advantage of Encapsulation
      The main advantage of using of encapsulation is to secure the data from other methods, when we make a data private then these data only use within the class,
      but these data not accessible outside the class.

-) Thread?
    Multithreading refers to two or more tasks executing concurrently within a single program. A thread is an independent path of execution within a program.
    Many threads can run concurrently within a program. Every thread in Java is created and controlled by the java.lang.Thread class.

-) We have ten threads how to control that ten threads, ie after finising that ten threads then only remaing code has to execute? So, how u will do for that?


-) synchronization?
-) unit testing?


-) How to create Immuable class like String class?
      Immutable class is good for caching purpose because you don?t need to worry about the value changes. Other benefit of immutable class is
   that it is inherently thread-safe, so you don?t need to worry about thread safety in case of multi-threaded environment.

      Here I am providing a way to create immutable class in java via an example for better understanding.
      To create immutable class in java, you have to do following steps.
      Declare the class as final so it can?t be extended.
      Make all fields private so that direct access is not allowed.
      Don?t provide setter methods for variables
      Make all mutable fields final so that it?s value can be assigned only once.
      Initialize all the fields via a constructor performing deep copy.
      Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
      To understand points 4 and 5, let?s run the sample Final class that works well and values doesn?t get altered after instantiation.






// Joins SQL:
------------
	A JOIN clause is used to combine rows from two or more tables, based on a related column between them.
Let's look at a selection from the "Orders" table:

Orders table:
OrderID	CustomerID	OrderDate
10308	2		1996-09-18
10309	37		1996-09-19
10310	77		1996-09-20

Customers table:
CustomerID	CustomerName	ContactName	Country
1		Alfreds		Maria Anders	Germany
2		Ana Trujillo	Ana Trujillo	Mexico
3		Antonio Moreno	Antonio Moreno	Mexico

Notice that the "CustomerID" column in the "Orders" table refers to the "CustomerID" in the "Customers" table.
The relationship between the two tables above is the "CustomerID" column. Then, we can create the following SQL statement (that contains an INNER JOIN), 
that selects records that have matching values in both tables:

Query: SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate FROM Orders INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;

Output:
OrderID	CustomerName	OrderDate
10308	Ana Trujillo 	9/18/1996
10365	Antonio Moreno 	11/27/1996
10383	Around the Horn	12/16/1996
10355	Around the Horn	11/15/1996

https://www.w3resource.com/sql/joins/perform-an-outer-join.php
Different Types of SQL JOINs:
----------------------------
Here are the different types of the JOINs in SQL:
1) INNER JOIN: Returns records that have matching values in both tables
Outer Joins Started
2) LEFT (OUTER) JOIN: Return all records from the left table, and the matched records from the right table
3) RIGHT (OUTER) JOIN: Return all records from the right table, and the matched records from the left table
4) FULL (OUTER) JOIN: Return all records when there is a match in either left or right table
Outer Joins ended
5) EQUI JOIN: SQL EQUI JOIN performs a JOIN against equality or matching column(s) values of the associated tables
6) SELF JOIN: A self join is a join in which a table is joined with itself
7) CROSS JOIN: The SQL CROSS JOIN produces a result set which is the number of rows in the first table multiplied by the number of rows in the second table
	       if no WHERE clause is used along with CROSS JOIN

Sample table: foods
+---------+--------------+-----------+------------+
| ITEM_ID | ITEM_NAME    | ITEM_UNIT | COMPANY_ID |
+---------+--------------+-----------+------------+
| 1       | Chex Mix     | Pcs       | 16         |
| 6       | Cheez-It     | Pcs       | 15         |
| 2       | BN Biscuit   | Pcs       | 15         |
| 3       | Mighty Munch | Pcs       | 17         |
| 4       | Pot Rice     | Pcs       | 15         |
| 5       | Jaffa Cakes  | Pcs       | 18         |
| 7       | Salt n Shake | Pcs       |            |
+---------+--------------+-----------+------------+

Sample table: company
+------------+---------------+--------------+
| COMPANY_ID | COMPANY_NAME  | COMPANY_CITY |
+------------+---------------+--------------+
| 18         | Order All     | Boston       |
| 15         | Jack Hill Ltd | London       |
| 16         | Akas Foods    | Delhi        |
| 17         | Foodies.      | London       |
| 19         | sip-n-Bite.   | New York     |
+------------+---------------+--------------+

1) Inner Join:
--------------
	The INNER JOIN keyword selects records that have matching values in both tables.
  Syntax:
	SELECT column_name(s) FROM table1 INNER JOIN table2 ON table1.column_name = table2.column_name;

 To join item name, item unit columns from foods table and company name, company city columns from company table, with the following condition -
1. company_id of foods and company table must be same,

  Query:
	SELECT foods.item_name,foods.item_unit,company.company_name,company.company_city FROM foods INNER JOIN company ON foods.company_id =company.company_id;

ITEM_NAME                 ITEM_ COMPANY_NAME              COMPANY_CITY
------------------------- ----- ------------------------- --------------
Chex Mix                  Pcs   Akas Foods                Delhi
Cheez-It                  Pcs   Jack Hill Ltd             London
BN Biscuit                Pcs   Jack Hill Ltd             London
Mighty Munch              Pcs   Foodies.                  London
Pot Rice                  Pcs   Jack Hill Ltd             London
Jaffa Cakes               Pcs   Order All                 Boston


2) LEFT OUTER Join:
-------------------
	The SQL LEFT JOIN (specified with the keywords LEFT JOIN and ON) joins two tables and fetches all matching rows of two tables for which the SQL-expression is true,
plus rows from the frist table that do not match any row in the second table.

  Syntax:
	SELECT * FROM table1 LEFT [ OUTER ] JOIN table2 ON table1.column_name=table2.column_name;

  Query:
	SELECT company.company_id,company.company_name,company.company_city,foods.company_id,foods.item_name FROM company LEFT JOIN foods ON company.company_id = foods.company_id;

Output:
COMPANY_ID COMPANY_NAME              COMPANY_CITY              COMPANY_ID ITEM_NAME
---------- ------------------------- ------------------------- ---------- --------------
16         Akas Foods                Delhi                     16         Chex Mix
15         Jack Hill Ltd             London                    15         Cheez-It
15         Jack Hill Ltd             London                    15         BN Biscuit
17         Foodies.                  London                    17         Mighty Munch
15         Jack Hill Ltd             London                    15         Pot Rice
18         Order All                 Boston                    18         Jaffa Cakes
19         sip-n-Bite.               New York                                         


3) RIGHT OUTER Join:
--------------------
	The SQL RIGHT JOIN, joins two tables and fetches rows based on a condition, which is matching in both the tables ( before and after the JOIN clause
mentioned in the syntax below) , and the unmatched rows will also be available from the table written after the JOIN clause ( mentioned in the syntax below ).

  Syntax:
	SELECT * FROM table1 RIGHT [ OUTER ] JOIN table2 ON table1.column_name=table2.column_name;
  Query:
	SELECT company.company_id,company.company_name,company.company_city,foods.company_id,foods.item_name FROM   company RIGHT JOIN foods ON company.company_id = foods.company_id;

Output:
COMPANY_ID COMPANY_NAME              COMPANY_CITY              COMPANY_ID ITEM_NAME
---------- ------------------------- ------------------------- ---------- --------------
18         Order All                 Boston                    18         Jaffa Cakes
15         Jack Hill Ltd             London                    15         Pot Rice
15         Jack Hill Ltd             London                    15         BN Biscuit
15         Jack Hill Ltd             London                    15         Cheez-It
16         Akas Foods                Delhi                     16         Chex Mix
17         Foodies.                  London                    17         Mighty Munch
                                                                          Salt n Shake

4) FULL OUTER Join:
-------------------
	In SQL the FULL OUTER JOIN combines the results of both left and right outer joins and returns all (matched or unmatched) rows from the tables 
on both sides of the join clause.

  Syntax:
	SELECT * FROM table1 FULL OUTER JOIN table2 ON table1.column_name=table2.column_name;

  Query:
	SELECT a.company_id AS "a.ComID",a.company_name AS "C_Name",b.company_id AS "b.ComID",b.item_name AS "I_Name" FROM company a FULL OUTER JOIN foods b 
        ON a.company_id = b.company_id;

Output:
a.ComID    C_Name                    b.ComID    I_Name
---------- ------------------------- ---------- -------------
16         Akas Foods                16         Chex Mix
15         Jack Hill Ltd             15         Cheez-It
15         Jack Hill Ltd             15         BN Biscuit
17         Foodies.                  17         Mighty Munch
15         Jack Hill Ltd             15         Pot Rice
18         Order All                 18         Jaffa Cakes
                                                Salt n Shake
19	     sip-n-Bite                                     


5) EQUI Join:
-------------
	SQL EQUI JOIN performs a JOIN against equality or matching column(s) values of the associated tables. An equal sign (=) is used as comparison 
operator in the where clause to refer equality.
	You may also perform EQUI JOIN by using JOIN keyword followed by ON keyword and then specifying names of the columns along with their associated 
tables to check equality.

  Syntax:
	SELECT column_list FROM table1, table2....WHERE table1.column_name = table2.column_name; 
  or
	SELECT * FROM table1 JOIN table2 [ON (join_condition)]

  Query: 
	SELECT agents.ID,agents.CULA,customer.ID,customer.CULB FROM agents,customer WHERE agents.ID=customer.ID;

EX: agents table
+-------+-----------+
| ID    |   CULA    |
+-------+-----------+
| 1     |     a1    |
| 2     |     a2    |
| 3     |     -     |
| 4     |     a4    |
| 8     |           |
+-------+-----------+

customer table
+-------+-----------+
| ID    |   CULB    |
+-------+-----------+
| 1     |     -     |
| 2     |     b2    |
| 3     |     b3    |
| 5     |     -     |
| 4     |     b4    |
| 6     |     b6    |
| 8     |     -     |
+-------+-----------+

Output:
+-------+-----------+-------+-----------+
| ID    |   CULA    | ID    |   CULB    |
+-------+-----------+-------+-----------+
|  1    |     a1    |  1    |     -     |
|  2    |     a2    |  2    |     b2    |
|  3    |     -     |  3    |     b3    |
|  4    |     a4    |  4    |     b4    |
|  8    |     -     |  8    |     -     |
+-------+-----------+-------+-----------+


6) SELF Join:
-------------
	A self join is a join in which a table is joined with itself (which is also called Unary relationships), especially when the table has a FOREIGN KEY which
references its own PRIMARY KEY. To join a table itself means that each row of the table is combined with itself and with every other row of the table.
	The self join can be viewed as a join of two copies of the same table. The table is not actually copied, but SQL performs the command as though it were.
The syntax of the command for joining a table to itself is almost same as that for joining two different tables. To distinguish the column names from one another,
aliases for the actual the table name are used, since both the tables have the same name. Table name aliases are defined in the FROM clause of the SELECT statement.

Syntax :
	SELECT a.column_name, b.column_name FROM table1 a, table1 b WHERE a.common_filed = b.common_field;

//For creating table with foreign key.
CREATE TABLE employee(emp_id varchar(5) NOT NULL,emp_name varchar(20) NULL,dt_of_join date NULL,emp_supv varchar(5) NULL,CONSTRAINT emp_id PRIMARY KEY(emp_id) ,
CONSTRAINT emp_supv FOREIGN KEY(emp_supv) REFERENCESemployee(emp_id));

//We putted data like below

+---------+---------------+---------------+--------------+
| EMP_ID  |   EMP_NAME    | DATE_OF_JOIN  |  EMP_ID_SUP  |
+---------+---------------+---------------+--------------+
|   101   |  RamKrish     |  10-Jun-2000  |      -       |
|   102   |  Beemesh      |  15-Sep-2014  |     101      |
|   103   |  Krish        |  22-Aug-2015  |     101      |
|   104   |  Jack         |  17-Feb-2016  |     101      |
|   105   |  Boocch       |  19-May-2017  |     102      |
|   106   |  Jony         |  19-May-2017  |     101      |
+---------+---------------+---------------+--------------+

Query:
	SELECT a.emp_id AS "Emp_ID",a.emp_name AS "Employee Name",b.emp_id AS "Supervisor ID",b.emp_name AS "Supervisor Name" FROM employee a, employee b
WHERE a.emp_id_sup = b.emp_id;

Output: 
+---------+---------------+---------------+--------------+
| EMP_ID  |   EMP_NAME    |   Super ID    |  Super Name  |
+---------+---------------+---------------+--------------+
|   102   |  Beemesh      |      101      |  RamKrish    |
|   103   |  Krish        |      101      |  RamKrish    |
|   104   |  Jack         |      101      |  RamKrish    |
|   105   |  Boocch       |      102      |  Beemesh     |
|   106   |  Jony         |      101      |  RamKrish    |
+---------+---------------+---------------+--------------+


7) CROSS Join:
--------------
	The SQL CROSS JOIN produces a result set which is the number of rows in the first table multiplied by the number of rows in the second table
if no WHERE clause is used along with CROSS JOIN.This kind of result is called as Cartesian Product.

Syntax:
	SELECT * FROM table1 CROSS JOIN table2;

EX: agents table
+-------+-----------+
| ID    |   CULA    |
+-------+-----------+
| 1     |     a1    |
| 2     |     a2    |
+-------+-----------+

customer table
+-------+-----------+
| ID    |   CULB    |
+-------+-----------+
| 1     |     -     |
| 2     |     b2    |
| 3     |     b3    |
+-------+-----------+

Query:
	SELECT foods.id,foods.cula,company.id,company.culb FROM foods CROSS JOIN company;
      Or
	SELECT foods.id,foods.cula,company.id,company.culb FROM foods,company;

Output:
+-------+-----------+-------+-----------+
| ID    |   CULA    | ID    |   CULB    |
+-------+-----------+-------+-----------+
|  1    |     a1    |  1    |     -     |
|  1    |     a1    |  2    |     b2    |
|  1    |     a1    |  3    |     b3    |
|  2    |     a2    |  1    |     -     |
|  2    |     a2    |  2    |     b2    |
|  2    |     a2    |  3    |     b3    |
+-------+-----------+-------+-----------+



// Some usefull queries
1) Query for getting Count males and females as well as total?
   Syntax: select count(*) as total, count(gender where gender = 'male') as male, count(gender where gender = 'female') as female from mytable;

   Output: total  male  female
	    100    75     25

2) Query for getting thrid high salary form emp table?
   Syntax: 
	Select max(sal) from emp where sal < (Select max(sal) from emp where sal < (Select max(sal) from emp ));     [Working fine]
	SELECT MIN(sal) from (SELECT sal from Emp ORDER BY sal DESC LIMIT 3 );                                       [Not working]






