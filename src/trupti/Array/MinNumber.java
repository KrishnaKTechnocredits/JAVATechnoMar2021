package trupti.Array;

import java.util.Scanner;

/*Assignment - 17 : Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 88*/
public class MinNumber {
	int [] getArray(Scanner scanner) {
		System.out.println("How many numbers you want to enter? ");
		int size=scanner.nextInt();
		int [] numberArr=new int[size];
		for(int index=0;index<numberArr.length;index++) {
			System.out.println("Enter Number "+ (index+1) + " : ");
			numberArr[index]=scanner.nextInt();
		}
		return numberArr;
	}

	int findMinNumber(int [] numArray) {
		int minNum=numArray[0];
		for(int index=1;index<numArray.length;index++) {
			if(numArray[index] < minNum)
				minNum=numArray[index];
		}

		return minNum;
	}

	public static void main(String[] args) {
		MinNumber minnumber=new MinNumber();
		Scanner scanner=new Scanner(System.in);
		int [] noArray=minnumber.getArray(scanner);
		int ans=minnumber.findMinNumber(noArray);
		System.out.println ("Minimum Number in given array is "+ ans);
		scanner.close();
	}

}
