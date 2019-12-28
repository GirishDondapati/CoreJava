package com.girish.vijay;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


public class Datecal {

	public static void main(String[] args) {
		Locale locale=locale.getDefault();
		System.out.println(locale);
	    locale= new Locale("fr","CA");
	    locale.getDefault("locale");
		//df.setLocale(Locale.CA);locale.getDefault();
		System.out.println(locale);
		DateFormat df=DateFormat.getTimeInstance();
		Date myDate=new Date();
		String myString=df.format(myDate);
		System.out.println(myString);
		
	}

}
