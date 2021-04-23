package milind.Assignment_17;

import java.util.Scanner;

public class MaxLengthStringArray {
	int maxNameIndex(String[] inputName) {
		String maxName=inputName[0];
		int maxNameIndex=0;
		for(int index=1;index < inputName.length;index++) {
			if(maxName.length()< inputName[index].length())
				maxNameIndex=index;
		}
		return maxNameIndex;
	}
	int minNameIndex(String[] inputName) {
		String minName=inputName[0];
		int minNameIndex=0;
		for(int index=1;index < inputName.length;index++) {
			if(minName.length()< inputName[index].length())
				minNameIndex=index;
		}
		return minNameIndex;
	}
	public static void main(String[] args) {
		 MaxLengthStringArray  maxLengthStringArray=new  MaxLengthStringArray();
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("How Many Name You Want to Enter: ");
		 int size=scanner.nextInt();
		 String[]inputName=new String[size];
		 
		 for(int index=0;index < inputName.length;index++) {
			 System.out.println("Enter Name "+(index + 1));
			 inputName[index]=scanner.next();
		 }
		 int inputMaxIndex=maxLengthStringArray.maxNameIndex(inputName);
		 System.out.println("Maximum name length in Given Array is: "+ inputMaxIndex);
		 int inputMinIndex=maxLengthStringArray.minNameIndex(inputName);
		 System.out.println("Minimum name length in Given Array is: "+ inputMinIndex);
		 scanner.close();
		 
	}
}
