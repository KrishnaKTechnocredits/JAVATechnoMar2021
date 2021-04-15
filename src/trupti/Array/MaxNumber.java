package trupti.Array;

import java.util.Scanner;

/*Assignment - 17 : Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/
public class MaxNumber {
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

	int findMaxNumber(int [] numArray) {
		int maxNum=0;
		for(int index=0;index<numArray.length;index++) {
			if(numArray[index] > maxNum)
				maxNum=numArray[index];
		}

		return maxNum;
	}

	public static void main(String[] args) {
		MaxNumber maxnumber=new MaxNumber();
		Scanner scanner=new Scanner(System.in);
		int [] noArray=maxnumber.getArray(scanner);
		int ans=maxnumber.findMaxNumber(noArray);
		System.out.println ("Maximum Number in given array is "+ ans);
		scanner.close();
	}

}
