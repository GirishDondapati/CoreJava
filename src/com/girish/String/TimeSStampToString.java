package com.girish.String;

import java.sql.Timestamp;

public class TimeSStampToString 
{
	public static void main(String[] args) {
		long currTime = System.currentTimeMillis();
		System.out.println(currTime);
		Timestamp ts =new Timestamp(currTime);
		System.out.println(ts);
		long currConvertedlong = ts.getTime();
		System.out.println("convertTime: "+currConvertedlong);
		
		long oldDate = currTime - 133200000;
		Timestamp ts1 =new Timestamp(oldDate);		
		System.out.println(ts1);
		long oldConvertedlong = ts1.getTime();
		long diff = currConvertedlong - oldConvertedlong;
		
		System.out.println("LondDiff: "+diff);
		
		double diffDou = (diff/(1000*60*60))/24;
		System.out.println(diffDou);
		
		
		
	}

}
