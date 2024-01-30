package arthematicproject;

import utility.java.Utility;

public class Arthematic {

public static void main(String... args) {
	Utility operation = new Utility(10,89);
	
	int choice;
	//System.out.println(choice);
	
	do {
		choice = operation.printmenu();
		switch(choice) {
		case 0:System.out.println("Exit");
		break;
		case 1: operation.addition();break;
		case 2:operation.substraction();break;
		case 3:operation.multiplication();break;
		case 4:operation.divide();break;
		case 5:operation.modulo();break;
		default:System.out.println("Invalid Number");break;
		}
	}while(choice!=0);
	
	}
}



