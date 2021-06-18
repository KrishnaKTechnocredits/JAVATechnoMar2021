package amrutaM.arrayAssignments;

/*Array Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4
*/
public class CountPositiveNegative {
	
	void countPositiveNegative(int [] input) {
		int positiveCount = 0;
		int negativeCount = 0;
		for(int index = 0;index< input.length;index++) {
			if(input[index] > 0) {
				positiveCount = positiveCount+1;	
			}else if(input[index] < 0) {
				negativeCount = negativeCount+1;
			}
		}
		System.out.println("Total positive numbers are --> "+ positiveCount);
		System.out.println("Total negative numbers are --> "+ negativeCount);
	}
	
	public static void main(String[] args) {
		CountPositiveNegative countPositiveNegative = new CountPositiveNegative();
		int [] input = {10,23,26,-27,-88,87,-65};
		countPositiveNegative.countPositiveNegative(input);
	}
}
