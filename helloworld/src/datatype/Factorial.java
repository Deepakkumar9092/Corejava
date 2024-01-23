
// Write a java program to find factorial of given number
package datatype;
import java.io.*;
public class Factorial {
	public static void main(String... args) throws Exception {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the value:");
		String fact = br.readLine();
		int factorial = Integer.parseInt(fact);
		
		int res=1;
		for(int i=1;i<=factorial;i++) {
			res = i * res;
			
		}
		System.out.println(res);
		
	}
}
