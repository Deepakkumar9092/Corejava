// Write a java program to print numbers from 100 to 1

package datatype;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

import java.io.*;

public class PrintNumber {
	public static void main(String... args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Number TO Print ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		for(int i=1;i<=num;i++) {
			System.out.print(i+" ");
		}
	}
	}
