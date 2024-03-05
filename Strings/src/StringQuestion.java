import java.util.*;

public class StringQuestion {
	
	
		
		/*
		 * Write a java program to count the total number of occurrences of given character in string
		 * Input String s = "java"
				char = 'a'
				Output: 2
			*/
		// Lecture 27 and 28 i was not read
		

		public static void main(String[] args) {
			
			LinkedList<Integer> lang = new LinkedList<Integer>();
			lang.add(8);
			lang.add(2);
			lang.add(1);
			lang.add(6);
			
			Iterator it = lang.iterator();
			Collections.reverse(lang);
			Collections.sort(lang);
			while(it.hasNext())
				System.out.print(it.next()+" ");
			
		}
			/*String str="java";
			char ch='a';
			char arr[]=str.toCharArray();
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]=='a')
					count++;
			}
			System.out.println(count);
		}*/
	
}
