/*
Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */

package paras.Assignment_28;

import java.util.Scanner;

public class SortString {
	
	String getString(String str) {
		
		String digitString = "";
		String upperCaseString = "";
		String lowerCaseString = "";
		
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				digitString = digitString + str.charAt(index);
			else if(Character.isUpperCase(str.charAt(index)))
				upperCaseString = upperCaseString + str.charAt(index);
			else if(Character.isLowerCase(str.charAt(index)))
				lowerCaseString = lowerCaseString + str.charAt(index);
	}
		String output = digitString + upperCaseString + lowerCaseString;
		return output;
	}
	
	String[] getString(String[] arr) {
		String[] output = new String[arr.length];
		for(int index = 0; index < arr.length; index++) {
			output[index] = getString(arr[index]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		SortString sortString = new SortString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the String:");
		String str = scanner.next();
		String output = sortString.getString(str);
		System.out.println("From Entered String having all numeric numbers first followed by Capital letter followed by Small letter is: " + output);
		System.out.println("\nPlease Enter Value of Array Size: ");
		int size = scanner.nextInt();
		String[] arr = new String[size];
		for(int index = 0; index < arr.length; index++) {
			System.out.println("Please Enter String in array: ");
			arr[index] = scanner.next();
		}
	//	String[] inputArr = {"Te1Ch2noCr4e_%$d8iTs9", "Anki4T2", "Me1e2Nu4"};
		String[] outputArr = sortString.getString(arr);
		System.out.println("\nFrom Entered String array having all numeric numbers first followed by Capital letter followed by Small letter is: ");
		for(int index = 0; index < outputArr.length; index++) {
			System.out.println(outputArr[index]);
		}
	}
}
