package trupti.CodingExam1;

import java.util.Scanner;

public class AgeDifference {
	int [] getArray() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers you want to enter ?");
		int size =scanner.nextInt();
		int [] numberArray=new int[size];
			for(int index=0;index<numberArray.length;index++) {
				System.out.println("Enter Number"+(index+1)+" : ");
				numberArray[index]=scanner.nextInt();
			}
			return numberArray;
	}
	
	int getDifferenceAge(int [] noArray) {
		int maxAge=noArray[0];
		int minAge=noArray[0];
		for(int index=1;index<noArray.length;index++) {
			if(noArray[index] > maxAge)
				maxAge=noArray[index];
			else if(noArray[index] < minAge)
				minAge=noArray[index];
		}
		return maxAge-minAge;
	}

	public static void main(String[] args) {
		AgeDifference agedifference=new AgeDifference();
		int [] numArray=agedifference.getArray();
		int differenceAge=agedifference.getDifferenceAge(numArray);
		System.out.println("Age Difference is : "+differenceAge);
		

	}

}
