package SortingArray.java;
import java.util.*;


public class ArraySoring {
	//Sorting array using Arrays.sort functions
		public static void main(String... args) {
			int arr[]= {43,23,12,54,32};
			System.out.println("Array Without Sorting");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			
		}
			System.out.println();
		Arrays.sort(arr);
		System.out.println("Array After Sorted");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		}
}
