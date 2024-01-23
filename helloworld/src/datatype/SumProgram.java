 // Write a java program to find sum of 1 - 100 numbers

package datatype;

import java.io.*;

public class SumProgram {
	public static void main(String... args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the nuber");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int sum=0;
		
	
	for(int i=1;i<=num;++i) {
			sum += i;
		}
	System.out.println("Sum = "+ sum);
	}


	}
	
//public class SumOfNumbers {
//    public static void main(String[] args) {
//        // Initialize sum to 0
//        int sum = 0;
//
//        // Loop through numbers from 1 to 100 and add them to the sum
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//
//        // Print the result
//        System.out.println("Sum of numbers from 1 to 100 is: " + sum);
//    }
//}
