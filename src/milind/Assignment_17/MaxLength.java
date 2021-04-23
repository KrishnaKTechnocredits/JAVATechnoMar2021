package milind.Assignment_17;

import java.util.Scanner;

public class MaxLength {
	String maxLengthName(String[] inputName) {
		String maxName=inputName[0];
		for(int index=1;index < inputName.length;index++) {
			if(maxName.length()<inputName[index].length())
				maxName=inputName[index];
		}
		return maxName;
	}
	String minLengthName(String[] inputName) {
		String minName=inputName[0];
		for(int index=0;index < inputName.length;index++) {
			if(minName.length()>inputName[index].length())
				minName=inputName[index];
		}
		return minName;
	}
	public static void main(String[] args) {
		MaxLength maxlength=new MaxLength();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How Many Name Enter: ");
		int size=scanner.nextInt();
		String[] inputName=new String[size];
		
		for(int index=0;index < inputName.length;index++) {
			System.out.println("Enter Name "+(index + 1));
			inputName[index]=scanner.next();
		}
		String maxName=maxlength.maxLengthName(inputName);
		System.out.println("Maximum Name Length is: " +maxName);
		String minName=maxlength.minLengthName(inputName);
		System.out.println("Minimum Name Length is: " +minName);
		scanner.close();
		
	}
	
}
