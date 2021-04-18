package sandesh.Assignment_17;

public class DifferenceOfEvenOddSum {
	static int evenNumbersSum;
	static int oddNumbersSum;
	int getDiffOfEvenOdd(int[] inArray) {
		int difference = 0;
		for(int index=0; index<inArray.length; index++) {
			if(inArray[index] > 0) {
				if(inArray[index] % 2 == 0)
					evenNumbersSum += inArray[index];
				else
					oddNumbersSum += inArray[index];
			}
		}
		if(evenNumbersSum > oddNumbersSum)
			difference = evenNumbersSum - oddNumbersSum;
		else if(oddNumbersSum > evenNumbersSum)
			difference = oddNumbersSum - evenNumbersSum;
		else
			difference = 0;
		return difference;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {10,23,26,27,88,87,65,78};
		int diff = new DifferenceOfEvenOddSum().getDiffOfEvenOdd(inputArray);
		if(evenNumbersSum > oddNumbersSum)
			System.out.println("Difference between sum of Even and Odd Numbers is -: " + diff);
		else if (oddNumbersSum > evenNumbersSum)
			System.out.println("Difference between sum of Odd and Even Numbers is -: " + diff);
		else
			System.out.println("Difference between sum of Odd and Even Numbers is -: " + diff);
	}
}
