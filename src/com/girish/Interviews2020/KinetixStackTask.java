package com.girish.Interviews2020;

import java.util.Random;

class Stack { 
    static final int MAX = 50000; 
    int top; 
    int a[] = new int[MAX];
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stack() 
    { 
        top = -1; 
    } 
  
    protected boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    protected int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            System.out.println(x + " poped from stack"); 
            return x; 
        } 
    } 
  
    protected int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    
    protected int getLowValueFromStack()
    {
    	if(top < 0)
    	{
    		System.out.println("Stack Underflow"); 
            return 0; 
    	}
    	
    	int lowVal = a[top];
    	for(int i = top-1; i >= 0; i--)
    	{
    		if(lowVal > a[i])
    			lowVal = a[i];
    	}
    	return lowVal;
    }
} 
  
// Driver code 
class KinetixStackTask { 
    public static void main(String args[]) 
    { 
       Stack s = new Stack(); 
       Thread pushThread = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
              while(true)
              {
                s.push(new Random().nextInt(100));
                
                try { Thread.sleep(600);
        		} catch (InterruptedException e) {
        			e.printStackTrace();
        		}
                
              }
            } 
        }); 

        Thread popThread = new Thread(new Runnable() { 
            @Override
            public void run() 
            { 
               while(true)
              {
                s.pop();
                
                try { Thread.sleep(1000);
         		} catch (InterruptedException e) {
         			e.printStackTrace();
         		}
              }
            } 
        }); 
        System.out.println("---------------------------------------");
        pushThread.start();
        System.out.println("---------------------------------------");
        popThread.start();
        
        System.out.println("---------------------------------------");
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        pushThread.interrupt();
        popThread.interrupt();
    } 
} 