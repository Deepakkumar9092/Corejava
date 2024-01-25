package typecasting;

public class Operator {
	public static void main(String... args) {
		unaryoperator();
	}
	static void unaryoperator() {
		int number1=10;
		int number2=20;
		int number3=30;
		int result=++number1 + number3 + number2--;
		
		System.out.println(result);
		System.out.println(number1);
		System.out.println(number2);
		
		bitwiseOperator();
		
	}
	
	
	static void bitwiseOperator() {
		int numb=-10;
		int res=-10>>>1;
		System.out.println(Integer.toBinaryString(numb));
		System.out.println(res);
		int num=-10;
		System.out.println(Integer.toBinaryString(num));
		System.out.println(res);
	}
}
