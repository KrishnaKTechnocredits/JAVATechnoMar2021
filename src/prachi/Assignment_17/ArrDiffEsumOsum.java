package prachi.Assignment_17;

/*Program 2:  return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum

		int getDifference(int[] input){

		}*/


public class ArrDiffEsumOsum {

	int getDifference(int[] input) {
		int evenSum=0, oddSum=0, arrDiffEsumOsum=0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenSum = evenSum + input[index];
			}else{
				oddSum = oddSum + input[index];
			}
		}
		arrDiffEsumOsum = evenSum - oddSum;
		return arrDiffEsumOsum;
	}

	public static void main(String[] args) {
		int[] num = { 10, 23, 26, 27, 88, 87, 65 };
		ArrDiffEsumOsum evenOddCount = new ArrDiffEsumOsum();
		int answer = evenOddCount.getDifference(num);
		System.out.println("Difference between sum of even number and odd numbers is : " + answer);
	}
}


