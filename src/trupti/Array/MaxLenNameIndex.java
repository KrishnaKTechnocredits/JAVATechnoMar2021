package trupti.Array;

import java.util.Scanner;

/*Assignment - 17 : Program 9:   return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class MaxLenNameIndex {
	String [] getArray(Scanner scanner) {
		System.out.println("How many names you want to enter? ");
		int size=scanner.nextInt();
		String [] stringArr=new String[size];
		
		for(int index=0;index<stringArr.length;index++) {
			System.out.println("Enter Name "+ (index+1) + " : ");
			stringArr[index]=scanner.next();
		}
		return stringArr;
	}

	int findMaxLengthNameIndex(String [] strArray) {
		int tempIndex=0;
		int strLength=0;
		for(int index=1;index<strArray.length;index++) {
			if(strArray[index].length() >strLength) {
				strLength=strArray[index].length();
				tempIndex=index;
			}
		}

		return tempIndex;
	}

	public static void main(String[] args) {
		MaxLenNameIndex maxlennameindex=new MaxLenNameIndex();
		Scanner scanner=new Scanner(System.in);
		String [] strArray=maxlennameindex.getArray(scanner);
		int ans=maxlennameindex.findMaxLengthNameIndex(strArray);
		System.out.println ("Index of string with maximum length is "+ ans);
		scanner.close();
	}

}
