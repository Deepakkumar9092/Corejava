package SortingArray.java;
import java.util.*;


public class ArraySoring {
	//Sorting array using Arrays.sort functions
		public static void main(String... args) {
			int arr[]= {43,23,12,54,32};
			
//			Arrays.sort(arr);
//			for(int c : arr)
//				System.out.print( c +" ");
//			System.out.println();
//			System.out.println("min element "+arr[0]);
//			System.out.println("max element "+arr[arr.length-1]);
			
			
			//find max and min element without using sort 
			int max = arr[0];
			int min=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max)
					max=arr[i];
				else if(arr[i]<min)
					min=arr[i];
			}
			System.out.println("Min Element: "+min);
			System.out.println("Max Element:" +max);
			
			
			//using Arrays.sort predefined functions
			
//			System.out.println("Array Without Sorting");
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//			
//		}
//			System.out.println();
//		Arrays.sort(arr);
//		System.out.println("Array After Sorted");
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
}
