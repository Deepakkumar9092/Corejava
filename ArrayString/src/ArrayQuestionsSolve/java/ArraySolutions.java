package ArrayQuestionsSolve.java;

import java.util.Arrays;

public class ArraySolutions {
		private static final char[] Max_value = null;


	//Q1-- Write a java program to Reverse an array
		
		
	public static void main(String... args) {
//		int arr[]= {34,45,645,564};
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
		//This is 1st Approach to solve the reverse string
//		System.out.println();
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
//		//2nd Approach to solve the reverse string
//		int temp=0;
//		for(int i=0;i<arr.length/2;i++) {
//			temp= arr[i];
//			arr[i]=arr[arr.length-1-i];
//			arr[arr.length-1-i]=temp;
//		}
//		for(int c:arr)
//			System.out.print(c + " ");
		
		// Q2.Write a java program to find min and max element of array
		
		
//		int arr[]= {34,45,645,564};
//		for(int i=0;i<arr.length;i++) {
//			
//			System.out.print(arr[i]+" ");
//		}
//			System.out.println();
//			int max=arr[0];
//			int min=arr[0];
//			for(int i=0;i<arr.length;i++) {
//				if(arr[i]>max) {
//					max=arr[i];
//				}
//				else if(arr[i]<min) {
//					min=arr[i];
//				}
//				
//			}
//			System.out.println("max="+max);
//			System.out.println("min="+min);
			
			
		// Q3.Write a java program to to sort array element in ascending order
//		
//			int arr[]= {34,23,45,2,21};
//			int temp=0;
//			for(int i=0;i<arr.length;i++) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[i] > arr[j]) {
//						temp=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//					}
//					
//				}
//				
//			}
//			System.out.println(Arrays.toString(arr));
//			
			
			// 2nd approach using predefined function (Arrays.sort)
//			 System.out.println("To string make it"+Arrays.toString(arr));// convert the value into strings
//			System.out.print("Array: ");
//			for(int i: arr)
//				System.out.print(i+" ");
//			System.out.println();
//			
//			Arrays.sort(arr);
//			System.out.print("Sorted Array:" );
//			for(int i=arr.length-1;i>=0;i--)
//				System.out.print(arr[i]+" ");
//		System.out.println();
			//without using Arrays.sort Function
			
		
			
		// Q4.Write a java program to sort array elements in descending order
		
//		int arr[]= {34,23,45,2,21};
		
//		int temp=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//				temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//					
//				}
//			}
//			
//		}
//		for(int c:arr)
//			System.out.print(c+" ");
		
		
		// Q5.Write a java program to segregate 1's and 0
			// Input: {1, 1, 0, 1, 0, 1}
			//Output: {0, 0, 1, 1, 1, 1}
		
//			int arr[]= {1,1,0,1,0,1};
//			int temp=0;
//			for(int i=0;i<arr.length;i++) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[i]>arr[j]) {
//						temp=arr[i];
//						arr[i]=arr[j];
//						arr[j]=temp;
//						
//					}
//				}
//				
//			}
//			System.out.println(Arrays.toString(arr));
		
			
		// Q6.Write a java program to sort array like below (0s first,then all is 1s, then all 2s)
			//Input: {0, 1, 2, 0, 1, 2}
			//Output:{0, 0, 1, 1, 2, 2}
//		int arr[]= {0, 1, 2, 0, 1, 2};
//		int temp=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					temp= arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
		
		// Q7.Write a java program to find array element pairs whose sum is equal to given number
			//Input Array: {3, 5, 1, 6, 2, 7, 9}
			//Input Number : 8
			
			// Output
			//3, 5 = 8
			//6, 2 = 8
			//7, 1 = 8
		
//			int arr[]= {3, 5, 1, 6, 2,7, 9};
//			int sum=8;
//			for(int i=0;i<arr.length;i++) {
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[i]+arr[j]==sum) {
//						System.out.println(arr[i]+" "+ arr[j]+" "+ "= "+ sum);
//					}
//				}
//			}
		
		// Q8. Write a java program to find non-repeated elements in array
		// Input: {2, 3, 2, 1, 3, 4, 5}
		// Output: 1, 4, 5
		
		int arr[]= {2, 3, 2, 1, 3, 4, 5};
		
		
		for(int i=0;i<arr.length;i++) { 
			int cnt=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]&& i!=j) {
					cnt++;
				}
				
			}
			if(cnt==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}


