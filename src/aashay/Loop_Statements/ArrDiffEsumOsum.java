package aashay.Loop_Statements;

/*Program 2:  return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum
		
		int getDifference(int[] input){
		
		}*/



public class ArrDiffEsumOsum {
	int evenSum, oddSum, arrDiffEsumOsum;

	int getDifference(int[] input) {

		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				evenSum = evenSum + input[index];
			
		//	return evenSum;
			}
			else {
				oddSum = oddSum + input[index];
				
	//			return oddSum;
			}
		}

		arrDiffEsumOsum = evenSum - oddSum;
		return arrDiffEsumOsum;
	}

	public static void main(String[] args) {
		int[] number = { 10, 23, 26, 27, 88, 87, 65 };

		ArrDiffEsumOsum evenOddCount = new ArrDiffEsumOsum();
		evenOddCount.getDifference(number);
		System.out.println("Difference between sum of even number and odd numbers is : " + evenOddCount.getDifference(number));
	}
	}
		

