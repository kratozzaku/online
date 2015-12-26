package krt.com;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

import java.util.Scanner;

=======
import java.util.Scanner;
>>>>>>> branch 'master' of https://github.com/kratozzaku/online
=======
import java.util.Scanner;
>>>>>>> refs/remotes/origin/master
=======
import java.util.Scanner;
>>>>>>> branch 'master' of https://github.com/kratozzaku/online

public class Main {
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	private static Scanner myScanner = new Scanner(System.in);
=======
	private static Scanner scanner = new Scanner(System.in);
	int sc = scanner.nextInt();
>>>>>>> branch 'master' of https://github.com/kratozzaku/online
=======
	private static Scanner scanner = new Scanner(System.in);
	int sc = scanner.nextInt();
>>>>>>> refs/remotes/origin/master
=======
	private static Scanner scanner = new Scanner(System.in);
	int sc = scanner.nextInt();
>>>>>>> branch 'master' of https://github.com/kratozzaku/online

	public static void main(String[] args) {
		
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

		int[] myArray = getIntegers(7);
		
	
		printArray(sortIntegers(myArray));


			
=======
		
		int[] myArray = {2,9,15,7,1,50,-5};
		
		printArray(myArray);
		
		
		
		
		
>>>>>>> branch 'master' of https://github.com/kratozzaku/online
=======
		
		int[] myArray = {2,9,15,7,1,50,-5};
		
		printArray(myArray);
		
		
		
		
		
>>>>>>> refs/remotes/origin/master
=======
		
		int[] myArray = {2,9,15,7,1,50,-5};
		
		printArray(myArray);
		
		
		
		
		
>>>>>>> branch 'master' of https://github.com/kratozzaku/online

	}
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
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
	
	

	
=======
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
		}
	}
>>>>>>> branch 'master' of https://github.com/kratozzaku/online
=======
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
		}
	}
>>>>>>> refs/remotes/origin/master
=======
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
		}
	}
>>>>>>> branch 'master' of https://github.com/kratozzaku/online

}
