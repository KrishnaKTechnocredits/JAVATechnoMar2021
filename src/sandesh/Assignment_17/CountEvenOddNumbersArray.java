package sandesh.Assignment_17;

public class CountEvenOddNumbersArray {
	static int countOfNegativeNumbers = 0;
	int getEvenCount(int[] inArray) {
		int evenNumbersCount = 0;
		for(int index=0; index<inArray.length; index++) {
			if(inArray[index] > 0) {
				if(inArray[index] % 2 == 0)
					evenNumbersCount++;
			}
			else
				countOfNegativeNumbers++;
		}
		return evenNumbersCount;
	}
	
	public static void main(String[] args) {
		int[] inputArray = {10,-23,-26,27,88,87,65};
		int countOfEvenNumbers = new CountEvenOddNumbersArray().getEvenCount(inputArray);
		if (countOfNegativeNumbers == 0) {
			System.out.println("Count of Even Numbers is -: " + countOfEvenNumbers);
			System.out.println("Count of Odd Numbers is -: " + (inputArray.length - countOfEvenNumbers));
		}
		else {
			System.out.println("Count of Even Numbers is -: " + countOfEvenNumbers);
			System.out.println("Count of Odd Numbers is -: " + (inputArray.length - (countOfEvenNumbers + countOfNegativeNumbers)));
			System.out.println("Count of Numbers less than Zero is -: " + countOfNegativeNumbers);
		}
	}
}
