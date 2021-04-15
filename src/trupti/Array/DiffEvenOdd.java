package trupti.Array;

import java.util.Scanner;
/*Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum*/

public class DiffEvenOdd {
	
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
	
	int getDifference(int [] numArray) {
		int sumEven=0;
		int sumOdd=0;
		for(int index=0;index<numArray.length;index++) {
			if(numArray[index] % 2 ==0)
				sumEven+=numArray[index];
			else
				sumOdd+=numArray[index];
		}
		return sumEven - sumOdd;
	}

	public static void main(String[] args) {
		DiffEvenOdd countevenodd=new DiffEvenOdd();
		int [] noArray=countevenodd.getArray();
		int diff=countevenodd.getDifference(noArray);
		System.out.println("Difference between even sum & odd sum : "+diff);

	}

}
