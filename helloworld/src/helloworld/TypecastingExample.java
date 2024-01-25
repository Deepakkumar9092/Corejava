package helloworld;
//import.helloworld.TyeCasting;
public class TypecastingExample {
	
public static void main(String... args) {
	byte bytevariable=10;
	short shortvariable = 30;
	
	TypeCasting typeCast = new TypeCasting(bytevariable, shortvariable,20,2423l,234.34f,3423.234232,'A',true);
	
	typeCast.widening();
	typeCast.narrowing();
	typeCast.expressionPromotion();
	
}
}
