/*
 Program 2: return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
 */

package upasana.assignment_17;

public class DiffEvenOdd {
	int evenSum;
	int oddSum;
	int getDifference(int[] input) {
		for(int index=0;index<input.length;index++){
			if(input[index]%2==0){
				evenSum+=input[index];
			}
			else
				oddSum+=input[index];
		}
		return(evenSum-oddSum);
		
	}
	public static void main(String[] args) {
		int[] arr= {10,23,26,27,88,87,65};
		DiffEvenOdd diffEvenOdd =new DiffEvenOdd();
		int diff=diffEvenOdd.getDifference(arr);
		System.out.println("EvenSum - OddSum is = " +diff);
	
	}
}
