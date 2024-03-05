package com.filehandling.serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializationAndDeserialization {
		
	/*   Serialization -> The process of Converting java object into file is called as Serialization.
	 
	 *   De-Serialization -> The Reverse of Serialization is called as De-serialization.
	    				  -> Converting file data into java object is called as De-Serialization.
	    				  
	  Note: To perform Serialization and De-Serialization the java class should be implement java.io.Serialization marker interface(The interface without any method).
	  
	  
	 * */
	SerializationAndDeserialization p = new SerializationAndDeserialization();
		int id;
		String name;
		
		/* public static void main(String[] args) throws Exception {
			System.out.println("==serialization started========");
			FileInputStream fis = new FileInputStream("person.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(oos);
			oos.flush();
			oos.close();
			
			System.out.println("==serialization completed========");
			
			System.out.println("======Deserialization started==========");
			
			FileInputStream fi = new FileInputStream("pereson.ser");
			ObjectInputStream ois = new ObjectInputStream(fi);
			Object object = ois.readObject();
			SerializationAndDeserialization p1 = (SerializationAndDeserialization) object;
			System.out.println("id "+p1.id);
			System.out.println("Name "+p1.name);
			ois.close();
			System.out.println("=====Deserialization ended==========");
		}*/
}
