package com.multithreading.support;

//public class MultithreadingSupports extends Thread{
public class MultithreadingSupports implements Runnable{
	/*
	 Thread t =Thread.currentThread();
		System.out.println("name "+ t.getName());
		System.out.println("Group "+ t.getThreadGroup());
		System.out.println("Priority "+ t.getPriority());
	 * */
	
	/*
	 	New: A thread begins its life cycle in the new state. It remains in this state until the start()method is called on it.
		Runnable: After invocation of start () method on new thread, the thread becomes runnable.
		Running: A thread is in running state if the thread scheduler has selected it.
		Waiting: A thread is in waiting state if it waits for another thread to perform a task. In this stage the thread is still alive.
		Terminated: A thread enter the terminated state when it completes its task.
	 */
	
	/*
	 * Q ) What is the difference between extending Thread class and implementing Runnable interface
	 
			-> If we create any thread by extending Thread class then we have no chance for extending from any other class.
			-> But if we create any thread by implementing Runnable interface then we have a chance for extending from any one class.
			-> It is always recommended to create the user defined threads by implementing Runnable interface only.
			-> Both ways overriding run method().
*/
	public void run() {
		System.out.println("run() method called");
	}
	
	public static void main(String[] args) {
		MultithreadingSupports ms = new MultithreadingSupports();
		Thread t = new Thread(ms);
		t.start();//Starting the thread
		
	
	
	}
}
