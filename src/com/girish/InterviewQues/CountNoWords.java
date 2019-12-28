package com.girish.InterviewQues;
//count no of words in given string 
public class CountNoWords {
	public static void main(String[] args) {
		String str = "karimbosskoti";
		int length = str.length() - 1;
		int i=0;
		StringBuffer s=new StringBuffer();
		while (i <=length) {
			int count = 0, j = 0;
			while (j <=length) {
				if (str.charAt(i) == str.charAt(j)){
					count++;
				}
				j++;
			}
			String dd=Character.toString(str.charAt(i));
			if(!s.toString().contains(dd)){
			s=s.append(str.charAt(i));
System.out.println("Auccerance of  '" + str.charAt(i) + " ' is "+ count);
			}
			i++;
		}
System.out.println("Given String is : "+str+" :  length is "+str.length());
	}
}
