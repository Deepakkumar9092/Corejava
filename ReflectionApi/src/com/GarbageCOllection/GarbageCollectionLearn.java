package com.GarbageCOllection;

public class GarbageCollectionLearn {
	
	/*	=========Garbage Collection===========
	-  Garbage collection is the process of removing un-used / un-referenced object from jvm heap area.
	-  Garbage collection is an in-built process in JVM
	-  In JVM garbage collector available to perform garbage collection.
	-  Garbage collector is a daemon thread(runs in background)    
	-  Garbage collector is assistance for the JVM
	
	* JVM is responsible for allocate the memory
	* Garbage collector is responsible for deallocate the memory.
	
	 
	 * How to Invoke GC in Java ?
	 		1. System.gc();
	 		2. Runtime.getRuntime.gc();
	 		
	 	Note : Even you can call above methods there is no guarantee that JVM will start immediately
	 	
	 	*============How GC Work Internally in JVM=================
	 	
	 	 Garbage collection works in below phases__
	 	 
	 	 1. Stop the world -> It will start it trigger STOP THE WORLD(all running threads will be stopped for few mili sec).
	 	  
	 	 2. Marking -> GC will go to JVM Heap area and it will identify un-referenced objects and it will mark them.
	 	 3. Sweeping -> Cleaning
	 	 4. Compaction -> fill the gap / adjusting the gap
	 * */
	
	public static void main(String[] args) {
		 GarbageCollectionLearn gcl = new GarbageCollectionLearn();
		
		gcl = null;// Call the finalize method to write the object name and equal to null.
		
		System.gc();
		Runtime.getRuntime().gc();
	}
	protected void finalize() throws Throwable {
		System.out.println("Finalize method start-----");
	}

	
}
