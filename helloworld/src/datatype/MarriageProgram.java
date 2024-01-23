//Write a java program to read person age and person salary and print his eligibility for
//marriage
//Condition: If person age less than 30 and salary greater than 1 Lakh then eligible for
//marriage
package datatype;
import java.io.*;
public class MarriageProgram {
	public static void main(String... args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Person age:-");
		String str1 = br.readLine();
		int age = Integer.parseInt(str1);
		
		System.out.println("Enter Person Salary:-");
		String str2 = br.readLine();
		double salary = Double.parseDouble(str2);
		
		if(age < 30 && salary > 100000) {
			System.out.println("You are Eligible For Marriage");
		}
		else {
			System.out.println("You are not Eligible For Marriage");
		}
		
	}
}
