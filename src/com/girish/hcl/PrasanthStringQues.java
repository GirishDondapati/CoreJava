package com.girish.hcl;

public class PrasanthStringQues {

	public static void main(String[] args) {
		String str = "Hi how ra you darling you Had Dinner";
		char[] ch = str.toCharArray();
		int p = 0;
		for (int i = 0; i < ch.length; i++) {
			char c1 = ch[i];
			char cc = ' ';
			if (c1 != cc) {
				if (p % 2 == 0) {
					char c2 = Character.toUpperCase(c1);
					System.out.print(c2);
					p++;
				} else {
					char c3 = Character.toLowerCase(c1);
					System.out.print(c3);
					p++;
				}
			}
			else
			{
				System.out.print(" ");
			}
		}
	}

}
