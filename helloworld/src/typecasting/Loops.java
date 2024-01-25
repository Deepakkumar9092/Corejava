package typecasting;

public class Loops {
	public static void main(String... args) {
		whileloop();
		ForEacah();
		for(int i=0;i<10;i++) {
			System.out.print(i+ "");
		}
		System.out.println();
//		fact();
		
	}
	static void whileloop() {
		int i=0;
		while(i<10) {
			System.out.println(i++);
		}
	}
	
	static void ForEacah() {
		char[] chArray = {'1','2','3','4'};
		for(char ch:chArray) {
			System.out.println(ch);
		}
		boolean[] booleanArray = {true,false,false,true};
		for(boolean booleanvariable: booleanArray)
			System.out.println(booleanvariable);
		
	}
//	static void fact() {
//		int Fact = 4 ;
//		int res=1;
//		for(int i=1;i<=Fact;i++) {
//			res = res*i;
//		}
//		System.out.println(res);
//	}
}
