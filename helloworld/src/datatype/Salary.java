/*Write a java program to read person basic salary and calculate Provident Fund
amount from the basic salary  */
//Formula: Provident Fund is 12 % of Basic Salary

package datatype;
import java.io.*;

public class Salary {
	public static void main(String... args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Basic Salary:-");
		String str = br.readLine();
		double basicsalary = Double.parseDouble(str);
		
		double pf =  basicsalary * 12 / 100;
		System.out.println("Basic Salary pf is: "+pf );
	}
}
