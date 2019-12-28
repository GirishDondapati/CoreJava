package com.girish.mulithread;

public class MainThreadIsLiveOrNotChecking {
	public static void main(String[] args) {
		System.out.println("main thread is started-----");
		Thread t = Thread.currentThread();
		t.setName("MainThread");
		NormalThread nThreadObj = new NormalThread(t);
		nThreadObj.start();

		try {
			Thread.currentThread().sleep(1000);
		} catch (Exception grr) {
		}
		System.out.println("main thread is eneded-----");
		// System.exit(0); // If we enable this line child thread also will stop. We can prove that one
						   // File using Files . In chaild thread write some code to write content in text file
						   // If normal termination time main thread finish then also it will write content to text file.
						   // In Abnormal termination time normal thread also will died. 
	}
}

class NormalThread extends Thread {
	Thread mainThreadObj = null;
	NormalThread(Thread name)
	{
		super(name);
		mainThreadObj = name;
	}

	public void run()
	{
		System.out.println("Normal Thread is started. Main Thread is live: "+mainThreadObj.isAlive());
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Nomal Thread is running. Main Thread is live: "+mainThreadObj.isAlive());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Normal Thread is ended. Main Thread is live: "+mainThreadObj.isAlive());
	}
}


/*public class MainThreadIsLiveOrNotChecking {
	public static void main(String[] args) {
		System.out.println("main thread is started-----");
		MainThreadIsLiveOrNotChecking obj = new MainThreadIsLiveOrNotChecking();
		System.out.println(obj.createThreads());
		try {
			Thread.currentThread().sleep(1000);
		} catch (Exception grr) {
		}
		System.out.println("main thread is eneded-----");
		// System.exit(0);
	}

	public boolean createThreads() {
		System.out.println("Method started @@@@");
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " t called+++++++");
			ThreadClass tObj = new ThreadClass("Thread" + i);
			tObj.start();
		}
		System.out.println("method ended  @@@@");
		return true;
	}
}

class ThreadClass extends Thread {
	String threadName = "";
	ThreadClass(String name)
	{
		super(name);
		threadName = name;
	}

	public void run()
	{
		System.out.println(threadName + " is Started %%%%%%%%%%%");
		//if (threadName.equals("Thread4"))
		//	throw new ArrayIndexOutOfBoundsException();

		try {
			Thread.currentThread().sleep(4000);
		} catch (Exception grr) {
		}
		System.out.println(threadName + " is ended   %%%%%%%%%%");
	}
}*/



