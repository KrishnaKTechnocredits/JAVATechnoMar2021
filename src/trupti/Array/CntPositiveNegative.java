package trupti.Array;

import java.util.Scanner;

/*From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65*/

public class CntPositiveNegative {
	
	int [] getArray() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers you want to enter? ");
		int size=scanner.nextInt();
		int [] numberArr=new int[size];
		for(int index=0;index<numberArr.length;index++) {
			System.out.println("Enter Number "+ (index+1) + " : ");
			numberArr[index]=scanner.nextInt();
		}
		scanner.close();
		return numberArr;
	}
	
	int getPositiveCount(int [] numArray) {
		int cntPositive=0;
		for(int index=0;index<numArray.length;index++) {
			if(numArray[index] > 0)
				cntPositive++;
		}
		return cntPositive;
	}

	public static void main(String[] args) {
		CntPositiveNegative cntpositivenegative=new CntPositiveNegative();
		int [] noArray=cntpositivenegative.getArray();
		int countPositive=cntpositivenegative.getPositiveCount(noArray);
		System.out.println("Positive number count : "+countPositive);
		System.out.println("Negative number count : "+ (noArray.length-countPositive));
	}

}
