/*
 Assignment - 17 : 10th April'2021
Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FindMaxLengthName {
	String findMaxLength(String[] input) {
		String max=input[0];
		for(int index=0;index<input.length;index++) {
			if(input[index].length()>max.length()) {
				max=input[index];
			}
		}
		return max;
	}

public static void main(String[] args) {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	size=sc.nextInt();
	String[] arr=new String[size];
	System.out.println("Enter the names in an array");
	for(int i=0;i<size;i++) {
		arr[i]=sc.next();
	}
	String maxlen=new FindMaxLengthName().findMaxLength(arr);
	System.out.println("Name having maximum length is " +maxlen);
	sc.close();
}
}
