package datatype;

public class DataType {
	public static void main(String... args) {
		ShortDataType();
		FloatDataType();
		CharData();
		ForLong();
		ForBoolean();
		byte byteMaxVriable = Byte.MAX_VALUE;
		byte byteMinVariable = Byte.MIN_VALUE;
		
		System.out.println("byteMaxVriable: "+ byteMaxVriable + " byteMinVariable:"+byteMinVariable );
		
	}


public static void ShortDataType() {
	short shortMaxVriable = Short.MAX_VALUE;
	short shortMinVariable = Short.MIN_VALUE;
	
	System.out.println("shortMAxValue:" + shortMaxVriable + " shortMinVariable:" + shortMinVariable);
	
}
public static void FloatDataType() {
	float floatMaxVriable = Float.MAX_VALUE;
	float floatMinVriable = Float.MIN_VALUE;
	
	System.out.println("floatMaxVriable" + floatMaxVriable + "floatMinVriable"+ floatMinVriable);
	
}
public static void CharData() {
	char charMaxVriable = Character.MAX_VALUE;
	char CharMinVariable = Character.MIN_VALUE;
	
	System.out.println("CharMaxVriable" + CharMaxVriable + "CharMinVariable" + CharMinVariable);
	
}
public static void ForBoolean() {
	boolean isValid = false;
	System.out.println(isValid);
}
public static void ForLong() {
	long deep=43974735L; // you can use long to L in value
	System.out.println("deep:" + deep);
}

}



