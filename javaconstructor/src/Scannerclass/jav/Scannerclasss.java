package Scannerclass.jav;

import java.util.Scanner;

public class Scannerclasss {
		public void acceptablenumer() {
			//Scanner scanner = new Scanner(System.in);//only use for opening interface
			try(Scanner scanner = new Scanner(System.in)){// only use are closing interface global 
				System.out.println("Enter number");
				System.out.println("Number= "+scanner.nextInt());
				System.out.println("Enter A floating");
				System.out.println("Float="+ scanner.nextFloat());
			}			
//			
			
			
			
			//wap to use all next function()
			
		}
		

		public void acceptcharacter() {
			try(Scanner scanner = new Scanner(System.in)){
				System.out.println("Enter A cahracter");
				System.out.println(scanner.next().charAt(0));
				System.out.println("Enter String");
				System.out.println(scanner.next());
				System.out.println("Enter address");
				scanner.nextLine();
				System.out.println(scanner.nextLine());
			}
		}
	
}
