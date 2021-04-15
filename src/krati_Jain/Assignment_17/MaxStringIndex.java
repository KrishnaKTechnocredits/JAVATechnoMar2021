/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

package krati_Jain.Assignment_17;

import java.util.Scanner;

public class MaxStringIndex {
	int tempLen;
	int count;
		
	public static void main(String[] args) {
			MaxStringIndex maxStr = new MaxStringIndex();
			maxStr.setData();
			
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
		int indexOfString = findMaxLenStr(myArray);
		if (count==myArray.length-1)
			System.out.println("All elements in our array are of same length : " + tempLen);
		else
			System.out.println("String with max length '" + tempLen + "' in our array is at index '" + indexOfString + "'" );
			
		}

		int findMaxLenStr(String[] myStrArray) {
			int tempIndex = 0;
			tempLen = myStrArray[0].length();
			for (int index = 1; index<myStrArray.length; index++ ) {
				if (tempLen < myStrArray[index].length()) {
					tempLen = myStrArray[index].length();
					tempIndex = index;
				}
				else if (tempLen == myStrArray[index].length())
					count++;

			}
						
			return tempIndex;
				
			}
		}
