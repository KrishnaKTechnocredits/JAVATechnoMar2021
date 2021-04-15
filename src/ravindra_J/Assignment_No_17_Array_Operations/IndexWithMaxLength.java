/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class IndexWithMaxLength {
	static String[] str;
	
	int findMaxLengthNameIndex(){
		int maxNameIndex=0;
		int maxNameLength = str[0].length();
		for(int i=1;i<str.length ;i++) {
		if(maxNameLength<=str[i].length()) {
			maxNameLength = str[i].length();
			maxNameIndex = i;
		}
	}
	return maxNameIndex;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		str = new String[size];
		//scanner.nextLine();// flushing the end of line string
		
		System.out.println("Enter the all the "+size+" elements of an array with space");
		for(int index = 0; index < size ; index++) {
		str[index] = scanner.next();
		}
				
		int maxNameIndex = new IndexWithMaxLength().findMaxLengthNameIndex();
		System.out.println("\nIndex of array element which having maximum length in an given array :" +maxNameIndex);
		scanner.close();
	}
}
