package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class IndexOfBiggestString {
	
	int maxLengthStringIndex(String [] names) {
		int BiggestStringIndex = 0;
		String BiggestString = names[0];
			for(int index = 1; index<names.length;index++) {
			if(BiggestString.length()<names[index].length()) 
				BiggestStringIndex = index;
			
			}
			System.out.println("Index of biggest String in the given array is "+BiggestStringIndex);
			return BiggestStringIndex;
}
	public static void main(String[] a) {
		IndexOfBiggestString indexOfBiggestString = new IndexOfBiggestString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		String [] names = new String[size];
		for (int index = 0; index < names.length; index++) {
			System.out.println("Enter names: ");
			names[index] = scanner.next();
		}
		indexOfBiggestString.maxLengthStringIndex(names);
	}

}
