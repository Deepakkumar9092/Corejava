import java.util.*;

public class multidimensional {
	public static void main(String... args) {
		
	int arr[][]= {{324,321},{564,132}}; // you can write multidimensional array 
//	for(int ar[]:arr)
		
//			System.out.println(Arrays.toString(ar));
	// 2nd type to write array
//		int arr[][]=new int[2][2];
//	arr[0][0]=324;
//	arr[0][1]=321;
//	arr[1][0]=564;
//	arr[1][1]=132;
	
	for(int []ar: arr) {
		System.out.println(Arrays.toString(ar));
	}
	
	// 2nd Approach
//	for(int i=0;i<arr.length;i++) {
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[i][j]+" ");
//		}
//	}
}
}