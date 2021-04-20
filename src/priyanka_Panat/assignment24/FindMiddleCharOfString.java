/*
 Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
 */

package priyanka_Panat.assignment24;

import java.util.Scanner;

public class FindMiddleCharOfString {

	char[] getMiddleChar(String[] arr) {
		char[] midChar = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() % 2 == 0) {
				midChar[index] = arr[index].charAt(arr[index].length() / 2 - 1);
			} else {
				midChar[index] = arr[index].charAt(arr[index].length() / 2);

			}
		}
		return midChar;
	}

	public static void main(String[] args) {
		FindMiddleCharOfString findMiddleCharOfString = new FindMiddleCharOfString();
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		size = sc.nextInt();
		String[] arr = new String[size];
		System.out.println("Enter the names in an array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.next();
		}
		char[] ch1 = findMiddleCharOfString.getMiddleChar(arr);
		System.out.println("Middle characters in above strings are : ");
		for (int index = 0; index < ch1.length; index++) {
			System.out.print(ch1[index] + " ");
		}

		sc.close();
	}
}
