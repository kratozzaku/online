package krt.com;


import java.util.Scanner;


public class Main {
	
	private static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		

		int[] myArray = {9,7,15};
		
		//printArray(myArray);
		printArray(sortIntegers(myArray));

		
		int[] myIntArray = new int[10];
		
		myIntArray[0] = 10;
		myIntArray[1] = 10;
		myIntArray[5] = 50;
			

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
		int temp = 0;
				
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
	
	

	

}
