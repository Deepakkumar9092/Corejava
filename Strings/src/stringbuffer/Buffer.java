package stringbuffer;

public class Buffer {
	
	//=== StringBuffer=============
	//---StringBuffer is a predefined class in java.lang package
	//---It is used to store group of character
	//---StringBuffer is a mutable (We can modify the content)
	//---StringBuffer is a thread-safe(only one thread can access a time)
	
	public static void main(String... args) {
//		StringBuffer sb= new StringBuffer("Deepak");
//		sb.append("Kumar");
//		sb.append("Pandit");// you can modify and access 
//		System.out.println(sb);
//		sb.delete(2, 4);
//		System.out.println(sb);
		
//		String star="Debug";
//		str.concat("Ii");		  // you can't be modify 
//		System.out.println(star);
		
		
		
		//======StringBuilder==============
		//---StringBuilder is predefined class in java.lang package
		//---This class introduce v1.5
		//---StringBuilder objects are mutable(content can be modify)
		//---StringBuilder objects are threads(multiple threads can be access at a time
		//eg- StringBuilder sb=new StringBuilder("Deepak")
			//	sb.append("Deepaksdfsdfj");
		StringBuilder sb = new StringBuilder("Deepak");
		System.out.println(sb.length());
		sb.append(" pandit");
		System.out.println(sb);
		System.out.println(sb.length());
		
		
		//======+Difference String,StringBuffer,StringBuilder
		//String--> Immutable --->jdk 1.0
		//StringBuffer--> Mutable + Thread-safe--->jdk 1.0
		//StringBuilder--->Mutable + Not-Threads-safe--->introduce to jdk 1.5v
		
	}
}
