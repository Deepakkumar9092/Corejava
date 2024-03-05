package com.collecetion.ArraysClass;

import java.util.Arrays;

public class LearnArraysClass {
	
		public static void main(String[] args) {
			/*
			int arr[] = {12,13,14,15,45,56,67};
			int index = Arrays.binarySearch(arr, 67);// It return the index of the value is present if there is a sorted arrays
			System.out.println("Index of element 4 is "+index);
			*/
			
			int arr[] = {324,12,23,12,235,21,534};
			Arrays.sort(arr);
			// 1st way to print the value 
			
//			Arrays.fill(arr, 1); // fill the value of all the arrays
			System.out.println(Arrays.toString(arr));// For printing all sorted value
			//2nd Approach to print the value
			for(int i : arr) {
				System.out.print(i+" ");
			}
			//3rd way to print the value
			System.out.println();
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
		}
}
