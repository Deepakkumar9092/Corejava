package Arrayreverse.java;
import java.util.*;
public class ReverseArray {
	public static void main(String... args) {
		int arr[]= {23,3,34,54,76};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
//		Arrays.sort(arr);
//		for(int i=0;i<=arr.length;i++)
//		System.out.print(arr[i]+" ");
//		System.out.println();
		
		
		//1st approach to Reverse The Array using loops and array
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
	//	2nd Approach to reverse an array
//		int[] temp = new int[arr.length];
//		int cnt=0;
//		for(int i=arr.length-1;i>=0;i--) {
//			temp[cnt]=arr[i];
//			cnt++;
//		}
//		for(int i : temp)
//			System.out.print(i+" ");
		
		//3rd approach
		int temp=0;
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
			
		}
		for(int c: arr)
			System.out.print(c + " ");
	}
}
