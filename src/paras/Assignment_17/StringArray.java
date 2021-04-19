/*
Assignment 17 :- 

Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits


Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */

package paras.Assignment_17;

import java.util.Scanner;

public class StringArray {
	
	String maxLength(String [] name){
		String maxLength = name[0];
		for(int index = 1; index < name.length; index++) {
			if(maxLength.length() < name[index].length()) {
				maxLength = name[index];
			}
		}return maxLength;
	}
	
	String minLength(String [] name){
		String minLength = name[0];
		for(int index = 1; index < name.length; index++) {
			if(minLength.length() > name[index].length()) {
				minLength = name[index];
			}
		}return minLength;
	}
	
	int maxLengthIndex(String[] name) {
		String maxName = name[0];
		int maxIndex = 0;
		for(int index = 0; index < name.length; index++) {
			if(maxName.length() < name[index].length()) {
				maxIndex = index;
			}
		}return maxIndex;
	}
	
	public static void main(String[] args) {
		StringArray stringArray = new StringArray();
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Please Enter Vaue of Array Size: ");
		int size = scanner.nextInt();
		String[] arr = new String[size];
		for(int index = 0; index < arr.length; index++) {
			System.out.println("Please Enter String in array: ");
			arr[index] = scanner.next();
		}
		String maxLengthWord = stringArray.maxLength(arr);
		System.out.println("\nMaxLength word from given Array is - " + maxLengthWord);
		String minLengthWord = stringArray.minLength(arr);
		System.out.println("\nMinLength word from given Array is - " + minLengthWord);
		int maximumLengthWord = stringArray.maxLengthIndex(arr);
		System.out.println("\nIndex having maximum length from given string array - " + maximumLengthWord);
	}
}
