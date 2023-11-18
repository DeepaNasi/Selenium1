package tjavaprogram;

import java.util.Scanner;

/*
 * public class PrintEvenOddFromArray {
 * 
 * public static void main(String[] args) { int a[]= {1, 2, 3, 4, 5, 6, 7, 8};
 * //Extracting Even and odd numbers
 * 
 * System.out.println("Even numbers are..."); for(int i=0; i<a.length; i++) {
 * if(a[i]%2==0) System.out.println(a[i]);
 * 
 * }
 * 
 * //Enhanced for loop
 * 
 * for(int value : a) { if(value%2==0) System.out.println(value); }
 * 
 * 
 * System.out.println("Odd numbers are..."); for(int i=0; i<a.length; i++) {
 * if(a[i]%2!=0) System.out.println(a[i]);
 * 
 * } }
 * 
 * }
 */

//By using Ternary operator


public class PrintEvenOddFromArray{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		String result=num%2==0? "Even Number" : "Odd Number";
		System.out.println(num+ " is " +result);
		
		
	}

}
