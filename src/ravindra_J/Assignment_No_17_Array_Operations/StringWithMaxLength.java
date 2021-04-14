/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class StringWithMaxLength {
	
	//String [] str = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
	static String[] str;
	String findMaxLengthName() {
		String maxName=null;
	int maxNameLength = str[0].length();
	for(int i=1;i<str.length ;i++) {
		if(maxNameLength<str[i].length()) {
			maxNameLength = str[i].length();
			maxName = str[i];
		}
	}
	return maxName;
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
				
		String maxName1 = new StringWithMaxLength().findMaxLengthName();
		System.out.println("\nName with maximum length from an given array :" +maxName1);
		scanner.close();
	}
}
