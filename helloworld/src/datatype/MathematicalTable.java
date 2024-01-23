// Write a java program to print mathematical table of given number

package datatype;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class MathematicalTable {
	public static void main(String... args)throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Table name");
		String str = br.readLine();
		int table = Integer.parseInt(str);

		for(int i=1;i<=10;i++) {
			System.out.println(table + " * " + i + " = " + table * i );
		}
	}
}
