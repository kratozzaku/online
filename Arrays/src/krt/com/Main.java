package krt.com;


import java.util.Scanner;


public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] myArray = {9,7,15};
		
		//printArray(myArray);
		printArray(sortIntegers(myArray));
		
		

	}
	
	public static int[] getIntegers(int numbers){
		int[] array = new int[numbers];
		
		System.out.println("Enter " + numbers + " integers.\r");
		for (int i = 0; i < array.length; i++) {
			array[i] = myScanner.nextInt();
		}
		
		return array;
		
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element[" + i + "]: " + array[i]);
		}
	}
	
	
	
	public static int[] sortIntegers(int[] array) {
		int[] sortedArray = new int[array.length];
		int temp = 0;
				
		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	
		return array;
	}
	
	
//	
//	public static int[] sortIntegers(int[] array) {
//		int[] sortedArray = new int[array.length];
//		int max = array[0];
//		
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//								
//				if (array[i] > max && array[i] > array[j] ){
//					max = array[i];
//					sortedArray[i] = array[i];
//				}else {
//					max = array[j];
//					sortedArray[i] = array[j];
//				}
//
//				//System.out.println("max: " + max);
//				
//			}
//		}
//	
//	
//		return sortedArray;
//	}
//	
	

}