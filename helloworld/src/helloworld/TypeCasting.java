package helloworld;

public class TypeCasting {
	
		//Property
		byte bytevariable;
		short shortvariable;
		int intvariable;
		long longvariable;
		
		float floatvariable;
		double doublevariable;
		
		char charvariable;
		boolean booleanvariable;
		
		
		//parameterized constructor
		public TypeCasting(byte bytevariable, short shortvariable, int intvariable, long longvariable, float floatvariable, double doublevariable, char charvariable, boolean booleanvariable) {
			
			this.bytevariable = bytevariable;
			this.shortvariable = shortvariable;
			this.intvariable = intvariable;
			 this.longvariable = longvariable;
			 this.charvariable=charvariable;
			 this.floatvariable = floatvariable;
			 this.doublevariable = doublevariable;
			 this.booleanvariable = booleanvariable;
			
		}
		
		public void widening() {
			shortvariable = bytevariable;
			System.out.println(shortvariable);
			
			intvariable = shortvariable;
			System.out.println(intvariable);
			
			longvariable = intvariable;
			System.out.println(longvariable);
			
			floatvariable = intvariable;
			System.out.println(floatvariable);
			
			floatvariable = longvariable;
			System.out.println(floatvariable);
			
			//To convert charvariable to other variable
			//You are using variable to typecasting to char variable
			charvariable = (char)bytevariable; // char 16 bits byte 8 bit
			charvariable = (char)shortvariable; // Because of positive number and negative number conversion not possible
			charvariable = (char)intvariable;
	        charvariable = (char)longvariable;
			charvariable = (char)floatvariable;
			
			//Implicit conversion from char to int
			// Convert int to charvariable
			
			intvariable = charvariable;
			System.out.println(intvariable);
			
			longvariable = charvariable;
			System.out.println(longvariable);
			
			floatvariable = charvariable;
			System.out.println(floatvariable);
			
			doublevariable = charvariable;
			System.out.println(doublevariable);
			
			
			
		}
		public void narrowing() {
			bytevariable = (byte)shortvariable;
			System.out.println(bytevariable);
			//byte  -> short-> int ->long -> float-> double left to right conversion this is all implicit
			//Right to left conversion this is all explicit
			longvariable = (long) floatvariable;
			System.out.println(longvariable);
			
			floatvariable = (float) intvariable;
			System.out.println(floatvariable);
			
			charvariable = (char)bytevariable;
			System.out.println(charvariable);
			
		}
		public void expressionPromotion() {
			intvariable = (int) (intvariable + floatvariable);
			System.out.println(intvariable);
			longvariable = shortvariable + intvariable;
			System.out.println(longvariable);
			
			
		}
}





		
