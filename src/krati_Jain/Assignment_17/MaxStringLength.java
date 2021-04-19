/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

package krati_Jain.Assignment_17;

import java.util.Scanner;

public class MaxStringLength {
	int count;
	String maxString;
	
	public static void main(String[] args) {
		MaxStringLength maxStrLen = new MaxStringLength();
		maxStrLen.setData();
	}
	
	void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the array you want to create? (should be whole/positive number)");
		int arrLen = scan.nextInt();
		String[] myArray = new String[arrLen];
		System.out.println("Input Array element for your Array");
		for (int index = 0; index < arrLen; index ++) {
			myArray[index] = scan.next();
		}
		int stringLength = findMaxLenStr(myArray);
		if (stringLength == myArray.length-1)
			System.out.println("All elements in our array are of same length : " + stringLength);
		else
			System.out.println(maxString + " is the string in our array with maximum length of '" +  stringLength + "'");
		
	}

	int findMaxLenStr(String[] myStrArray) {
		maxString = myStrArray[0];
		int tempLen = myStrArray[0].length();
		for (int index = 1; index<myStrArray.length; index++ ) {
			if (tempLen < myStrArray[index].length()) {
				tempLen = myStrArray[index].length();
				maxString = myStrArray[index];
			}
			else if (tempLen == myStrArray[index].length())
				count++;

		}
		return tempLen;
		
	}
	}