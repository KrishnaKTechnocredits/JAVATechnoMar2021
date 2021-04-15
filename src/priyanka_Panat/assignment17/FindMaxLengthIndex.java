/*
 Assignment - 17 : 10th April'2021
Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */


package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FindMaxLengthIndex {
	int findIndexofMaxLen(String[] str) {
		String max=str[0];
		int maxIndex = 0;
		for(int index=1;index<str.length;index++) {
			if(str[index].length()>max.length()) {
				maxIndex=index;
				max=str[index];
			}
		}
		return maxIndex;
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
		int maxindex=new FindMaxLengthIndex().findIndexofMaxLen(arr);
		System.out.println("Index of name having maximum length is : " +maxindex);
		sc.close();
	}
	
}
