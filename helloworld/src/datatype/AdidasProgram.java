/* Write a java program to read shoes brand name from keyboard, based on brand
//name print brand slogan like below
//Nike -> Just do it
//Adidas -> Impossible is nothing
//Puma -> Forever Faster
//Reebok -> I Am What I Am */


package datatype;

import java.io.*;

public class AdidasProgram {
	public static void main(String... args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter Brand Name:-");
		String brand = br.readLine();
		
		switch(brand) {
		case "Nike": System.out.println("just do it");
			break;
		case "Adidas": System.out.println("Impossible is nothing");
				break;
		case "Puma": System.out.println("Forever Faster");
				break;
		case "Reebok": System.out.println("I Am What I AM");
				break;
			
		case "Sega": System.out.println("This is Amazing Shoes for Running");
				break;
		default: System.out.println("Page Not Found");
		}
	}
}
