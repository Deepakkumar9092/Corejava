package com.multithreading;

public class MultiThreading extends Thread{
		/* =============MultiThreading============
		Task - Work
		
		* Single Tasking - To perform only one task at a time.
		eg -
			Explain the topic
			Dictate the notes
			Ask questions
			
			-> If we perform single tasking we will make a lot of time to complete your task.
			
		* Multi Tasking - Perform multiple task at a time is called as Multi Tasking.
		
		eg -
			1. Walking and listening the music
			2. Speaking and Writing
			3. Reading and eating
			
			-> If we perform multiple task at time then we will complete multiple work at a time.
			
		 ======Multi Tasking we can achieve in 2 ways============
		 		
		 		1. Process Based Multi Tasking -> 
		 		
		 			 Processor based multi-tasking means executing multiple tasks at the same time
						simultaneously where each task is independent of other tasks having separate memory and
						resources
					-> Processor based multi-tasking is an operating system approach
		 			
		 			 Eg:
							java program,
							listen to music,
							download songs,
							copy softwares,
							chating,
							....
		 			
				2. Thread Based Multi Tasking -To Execute our program Paralelly then we need to go for Thread Based MultiTasking.
					
				-> Thread based multi tasking means executing different parts of the same program at the
						same time simultaneously where each task is independent sometimes or dependent
						sometimes of other tasks which are having common memory and resources.
						
				
				-> To implement Thread based MultiTasking we will use Multi threading.
				-> Java Supports Multi Threading
				-> Using Thread Based MultiTasking our program can complete the work quickly.
				
					 Eg: games, web based apps,....
					 
					 
			=========Use Cases For Multi Threading ================
			1. Send sms to all customer at a time
			2. Send Email to all customer at a time
			3. Generate & Send Bank Statement to all customers in email
			
			Note - The main task of multi Tasking is used to execute our program logic paralelly so that we can complete more work in less time.
			Note - For Every program execution ,jvm is created one thread by default.That thread is called as Main Thread.
			
				code - 
				public static void main(String[] args) {
				    Thread th = new Thread();
					Thread t =  Thread.currentThread();
					System.out.println(t); // Internally to call toString() method /Thread[main,5,main]main is name of the thread ,5 is priority of thread, main is thread group
					System.out.println(t.getName());
						System.out.println(th.getName());//main
						}
			Thread is predefined class in JVM
	*/
	
		/*=======User Defined Threads============
		 
		 	* MultiThreading - The process of executing multiple path of the program paralelly is called as MultiThreading.
		 	
		 	In java we can create Threads in two ways - 
		 	
		 		1. By Extending Thread Class - It extend the class parallely 
		 		code - 
		 		
		 		public class MultiThreading extends Thread{
		 		 public void run() {// User defined thread
	   			System.out.println("By Extending the class thread started");
					System.out.println("I am from run program");
					System.out.println("User defined thread ended");
							}
					public static void main(String[] args) {// Jvm is creating a main thread
					System.out.println("Main thread started");
				MultiThreading m = new MultiThreading();
		
				Thread t = new Thread(m);//Making our class obj association with Thread
					t.start();// start() is use start the Thread
		
					System.out.println("Main Thread Ended");
					
					}
					
		 		2. By Implementing Runnable Interface - It extend the class sequentially
		 		
		 			void m1() {
					System.out.println("By Implementing Runnable Interface");
								}
					public static void main(String[] args) {
					Thread currentThread = Thread.currentThread();
					String s = currentThread.getName();
					System.out.println(s +"thread started");
		
					MultiThreading m = new MultiThreading();
					m.m1();
					System.out.println(s + "thread ended");
		 * */
	
	public void run() {
		System.out.println("run method start");
		m1();
		System.out.println("run method ended");
	}
	
	void m1() {
		System.out.println("By Implementing Runnable Interface");
	}
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		String s = currentThread.getName();
		System.out.println(s +" thread started");
		
		MultiThreading m = new MultiThreading();
		Thread t = new Thread(m);
		t.start();
//		m.m1();
		System.out.println(s + " thread ended");
	}
	
}
