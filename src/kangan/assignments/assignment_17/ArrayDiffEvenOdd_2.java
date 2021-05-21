package kangan.assignments.assignment_17;

public class ArrayDiffEvenOdd_2 {
	
    void oddEvenDiff(int[] input){
    	int evenSum = 0;
    	int oddSum = 0;
    	int getDiff = 0;
    	
	 for(int index = 0; index < input.length; index++) {
		 if (input[index] % 2 == 0) {
			 evenSum = evenSum + input[index];
		 }
		 else
		     oddSum = oddSum + input[index];
	 }
	 getDiff = evenSum - oddSum;
	 System.out.println(getDiff);
	 //return getDiff;
	
 }
    public static void main(String[] args) {
    	int[] number = { 10,23,26,27,88,87,65 };
    	ArrayDiffEvenOdd_2 arrayDiffEvenOdd = new ArrayDiffEvenOdd_2();
    	arrayDiffEvenOdd.oddEvenDiff(number);
    	//System.out.println(arrayDiffEvenOdd.oddEvenDiff(number));
    	
	}
}
