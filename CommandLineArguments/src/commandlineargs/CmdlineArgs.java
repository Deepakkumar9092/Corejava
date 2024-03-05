package commandlineargs;

//----Command line values are used to supply dynamic values as input for our program
//----CMD args will received by main method
//----Cmd args will be default type of String
//----We can pass multiple cmd args, they will be stored into one array


public class CmdlineArgs {
	public static void main(String[] args) {
		System.out.println("Args length is: "+args.length);
//		String str=args[0];
//		String str1=args[1];
//		System.out.println(str+str1); 
		
		//Write a java program to sum of two number using command line arguments
		String str1=args[0];
		String str2=args[1];
		
		int x= Integer.parseInt(str1);
		int y = Integer.parseInt(str2);
		System.out.print(x+y);
	}
}
