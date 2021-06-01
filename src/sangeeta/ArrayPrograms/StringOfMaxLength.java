/* return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class StringOfMaxLength {
	
	String maxLengthString(String [] names) {
		String BiggestString = names[0];
			for(int index = 1; index<names.length;index++) {
			if(BiggestString.length()<names[index].length()) 
				BiggestString = names[index];
			}
			System.out.println("Biggest String in the given array is "+BiggestString);
			return BiggestString;
}
	public static void main(String[] a) {
		StringOfMaxLength stringOfMaxLength = new StringOfMaxLength();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		String [] names = new String[size];
		for (int index = 0; index < names.length; index++) {
			System.out.println("Enter names: ");
			names[index] = scanner.next();
		}
		stringOfMaxLength.maxLengthString(names);
	}
}

