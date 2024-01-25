package typecasting;

import java.io.*;

public class Statement {
	//methods starts
	public static void main(String... args)throws Exception {
		
		boolean isvalid = true;
		if(isvalid) {
			System.out.println(isvalid);
					}
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a Number");
		String mark =br.readLine();
		int marks = Integer.parseInt(mark);
//		int marks=70;
		
		if(marks >=90 && marks<=100) {
			System.out.println("A Grade");
			
		}
		else if(marks>=85 && marks <=89) {
			System.out.println("B Grade");
			
		}
		else if(marks >= 70 && marks <=84) {
			System.out.println("C Grade");
		}
		else if(marks > 100) {
			System.out.println("Enter valid number");
		}
		else {
			System.out.println("Fail");
		}
	}

}
