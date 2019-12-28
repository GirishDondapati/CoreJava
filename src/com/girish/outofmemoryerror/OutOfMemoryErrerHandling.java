package com.girish.outofmemoryerror;

import java.util.HashMap;

public class OutOfMemoryErrerHandling
{
	private static HashMap<String,OutOfMemoryErrerHandling> leakContainer = new HashMap<String, OutOfMemoryErrerHandling>();
	private static String keyComData = "DataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataDataData";
	private static boolean showExecution = true;
	
	public static void main(String[] args)
	{
		System.out.println("Main Method started");
		try
		{
			for(int i = 0; i <= 10000000; i++)
			{
				String data = keyComData + i;
				leakContainer.put(data, new OutOfMemoryErrerHandling());
				if(showExecution)
				{
					try {
						Thread.sleep(1);
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				
			}
			
		}
		catch(Throwable ex)
		{
			System.out.println("Some exception came: "+ex);
			//throw ex;
		}
		System.out.println("main method is ended");

	}
}
