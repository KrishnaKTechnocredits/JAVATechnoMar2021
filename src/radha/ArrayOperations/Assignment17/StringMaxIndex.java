/*
Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */

package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class StringMaxIndex {
	void StrMaxIndex(String[] arr) {
		int maxIndex = 0;
		for(int index=1; index < arr.length;index++) {
			if(arr[maxIndex].length() < arr[index].length())
				maxIndex=index;	
		}
		System.out.println("Index of the string having maximum length is: "+maxIndex);
	}
	
	public static void main(String[] args) {
		StringMaxIndex maxStrIndex = new StringMaxIndex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Values to be inserted in an Array :");
		int size =sc.nextInt();	
		sc.nextLine();
		String [] arr = new String[size];
		for (int index = 0 ; index <arr.length; index++) {
				System.out.println("Enter value to add in an array :");
				arr[index] = sc.nextLine();
		}
		System.out.println("============================================");
		maxStrIndex.StrMaxIndex(arr);
		sc.close();
	}
}

/*
Output:
Enter number of Values to be inserted in an Array :
5
Enter value to add in an array :
maulik
Enter value to add in an array :
Krishna
Enter value to add in an array :
Technocredits
Enter value to add in an array :
Kangan
Enter value to add in an array :
Harsh
============================================
Index of the string having maximum length is: 2
 */
