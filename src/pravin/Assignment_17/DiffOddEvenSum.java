/*Program 2: return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 
	    output : evenSum - oddSum*/
		
	package pravin.Assignment_17;

	public class DiffOddEvenSum {

		int evenSum = 0;
		int oddSum = 0;
		int numdiff;

		int getDifference(int[] input) {

			for (int index = 0; index < input.length; index++) {
				if (input[index] % 2 == 0)
					evenSum += input[index];
				else {
					oddSum += input[index];
				}
			}
			numdiff = oddSum - evenSum;
			return numdiff;
		}

		public static void main(String[] args) {

			int[] num = { 10, 23, 26, 27, 88, 87, 65 };
			DiffOddEvenSum diffOddEvenSum = new DiffOddEvenSum();
			int diffOfSum = diffOddEvenSum.getDifference(num);
			System.out.println("Difference of evensum and oddSum is : " + diffOfSum);

		}

	}
	 
