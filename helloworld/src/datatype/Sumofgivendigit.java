//Write a java program to find sum of digits of given number
package datatype;

import java.io.*;

public class Sumofgivendigit {
	public static void main(String... args)throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter First Number:");
		String str1 = br.readLine();
		int num1=Integer.parseInt(str1);
		
		System.out.println("Enter Second Nuber:");
		String str2 = br.readLine();
		int num2 = Integer.parseInt(str2);
		
		int sum = num1 + num2;
		System.out.println("sum is equal to = " + sum);
	}
}
