package com.girish.interviewtest;

import java.util.concurrent.atomic.AtomicBoolean;


public class ThreadTestIbm {
	
	static class ThreadSync {
		
		public static AtomicBoolean helloprintdone = new AtomicBoolean(false);
		
		public synchronized static void printHello() {
	//		System.out.println("PH");
			if (helloprintdone.get() == true) {
				try {
					ThreadSync.class.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (helloprintdone.get() == false) {
				System.out.print("Hello ");
				helloprintdone.set(true);
				
				ThreadSync.class.notifyAll();
			}
		}
		
		public synchronized static void printWorld() {
		//	System.out.println("PW");
			
			if (helloprintdone.get() == false) {
				try {
					ThreadSync.class.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (helloprintdone.get() == true) {
				System.out.print("World! ");
				helloprintdone.set(false);
				ThreadSync.class.notifyAll();
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		
		new Thread() {
			  public void run() {
			    	int i = 0;
			      while (i<5) {
			    	  ThreadTestIbm.ThreadSync.printHello();		
			    	  i++;	      
			      }
			  }
			}.start();
			
			new Thread() {
				  public void run() {
				    	int i = 0;
				      while (i < 5) {
				        ThreadTestIbm.ThreadSync.printWorld();
				        i++;
				      }
				  }
				}.start();
		
	}

}