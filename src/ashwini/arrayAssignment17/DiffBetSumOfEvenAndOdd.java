package ashwini.arrayAssignment17;
/*
  Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}

 */
public class DiffBetSumOfEvenAndOdd {
	
	void getDifference(int[] input) {
		int evenSum=0, oddSum=0, diff=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]%2==0) {
				evenSum=evenSum+input[index];
			}
			else
				oddSum=oddSum+input[index];
			}
		System.out.println("Sum of Even numbers:"+evenSum);
		System.out.println("Sum of Odd numbers:"+oddSum);
		diff = evenSum-oddSum;
		System.out.println("Difference bet sum of even and odd number is :"+diff);
	}

	public static void main(String[] args) {
		int array[]= {10,23,26,27,88,87,65};
		DiffBetSumOfEvenAndOdd diffBetSumOfEvenAndOdd = new DiffBetSumOfEvenAndOdd();
		diffBetSumOfEvenAndOdd.getDifference(array);
		

	}

}
