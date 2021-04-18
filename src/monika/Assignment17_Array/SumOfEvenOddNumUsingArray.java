package monika.Assignment17_Array;
/*Program 2: return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum
		int getDifference(int[] input){
		}*/
public class SumOfEvenOddNumUsingArray {
	
	int getSumOFEvenAndOddNumArr(int[] arr) {
		int evenNumSum = 0, oddNumSum =0;
		//int diffCalcOfEvenOdd =0;
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2 == 0)
				evenNumSum = evenNumSum + arr[index];
			else
				oddNumSum = oddNumSum +arr[index];
		//diffCalcOfEvenOdd = diffCalcOfEvenOdd + arr[index];	
		}
		/*int odd = diffCalcOfEvenOdd - evenNumSum;
		int diffNew = evenNumSum - odd;*/
		
		return evenNumSum-oddNumSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,26,27,88,87,65}; //326
		SumOfEvenOddNumUsingArray obj = new SumOfEvenOddNumUsingArray();
		System.out.println("Diff of even and odd : "+obj.getSumOFEvenAndOddNumArr(arr));
		
	}
}
