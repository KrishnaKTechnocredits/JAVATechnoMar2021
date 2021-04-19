package trupti.Array;

import java.util.Scanner;
/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
      */
public class CountEvenOdd {
	
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
	
	int getEvenCount(int [] numArray) {
		int cntEven=0;
		for(int index=0;index<numArray.length;index++) {
			if(numArray[index] % 2 ==0)
				cntEven++;
		}
		return cntEven;
	}

	public static void main(String[] args) {
		CountEvenOdd countevenodd=new CountEvenOdd();
		int [] noArray=countevenodd.getArray(); // {10,23,.....};
		int countEven=countevenodd.getEvenCount(noArray);
		System.out.println("Even number count : "+countEven);
		System.out.println("Odd number count : "+ (noArray.length-countEven));

	}

}
