package shivani.Assignment_17;
import java.util.Scanner;
/*Program 2:  return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum
		*/

public class EvenoddDiff {
static int n;
	int getDifference(int[]numList) {

		int evenSum = 0;
		int oddSum = 0;
		

		for (int index = 0; index < numList.length; index++) {

			if (numList[index] % 2 == 0) {
				evenSum = evenSum + numList[index];
			} else
				oddSum = oddSum + numList[index];

		} 
		int diff=oddSum-evenSum;

		System.out.println("Diff :" +diff);
		return diff;
		

	}

	public static void main(String[] args) {
		EvenoddDiff evenOddDiff = new EvenoddDiff();
		Scanner sc= new Scanner (System.in);
		System.out.println("please enter how many number you want to enter in list");
		
		int number=sc.nextInt();
		int []num=new int[number];
		System.out.println("enter the list of " +number+ "numbers");
		
		for( int list=0;list<number;list++) {
		
			 num[list]=sc.nextInt();
		}
		
	     evenOddDiff.getDifference(num);

	}

}
