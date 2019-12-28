package com.girish.hcl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SyamSundharFileDataCopyToAnthorFile {

	/**
	 * @param args 14-10-2014
	 * Copy one file data to onther file
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(new  File("f:/abc.txt")));
		//BufferedWriter bw=new BufferedWriter(new FileWriter(new File("f:/bcd.txt")));
		File ff=new File("f:/bcd.txt");
		FileWriter fw=new FileWriter(ff);
		BufferedWriter bwr=new BufferedWriter(fw);
		
		String s=null;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
			bwr.write(s);
			bwr.newLine();
			
		}
		
		bwr.flush();
		fw.close();

	}

}
