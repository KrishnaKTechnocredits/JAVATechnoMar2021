/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
 */
package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class StringMaxArray {
	
	void StrMax(String[] arr) {
		String maxName = arr[0];
		for(int index=1; index < arr.length;index++) {
			if(maxName.length() < arr[index].length())
				maxName=arr[index];	
		}
		System.out.println("String having maximum length is: "+maxName);
	}
	
	public static void main(String[] args) {
		StringMaxArray maxStr = new StringMaxArray();
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
		maxStr.StrMax(arr);
		sc.close();
	}
}
/*
Output:
Enter number of Values to be inserted in an Array :
5
Enter value to add in an array :
Maulik
Enter value to add in an array :
Krishna
Enter value to add in an array :
Technocredits
Enter value to add in an array :
Kangan
Enter value to add in an array :
Harsh
============================================
String having maximum length is: Technocredits
*/