/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

	package pravin.Assignment_17;
	public class PositiveNegativeNumCount {
	
		void NumCount(int[] input) {
			int positiveNum = 0;
			for (int index = 0; index < input.length; index++) {
				if (input[index] > 0)
					positiveNum++;
			}
			int negativeNum = input.length - positiveNum;
			System.out.println("Positive number count: " + positiveNum);
			System.out.println("Negative number count: " + negativeNum);
		}
		public static void main(String[] args) {
			int[] num = {10,23,-26,-27,88,87,-65 };
			new PositiveNegativeNumCount().NumCount(num);
		}
	}
	