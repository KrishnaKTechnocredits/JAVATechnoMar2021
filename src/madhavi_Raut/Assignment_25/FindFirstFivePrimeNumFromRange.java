package madhavi_Raut.Assignment_25;
/*Assignment - 25 : 18th April'2021
Program 1: Write a method which will return first 5 prime numbers from 
given range. Main method should print the output.
Input : Start Index -> 10
End Index -> 50
Output : 11 13 17 19 23*/

public class FindFirstFivePrimeNumFromRange {

	int[] getFirstFivePrimeNum(int startIndex, int endIndex) {
		int[] numArray = new int[5];
		int count = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			boolean flag = true;
			for (int innerIndex = 2; innerIndex <= (index / 2); innerIndex++) {
				if (index % innerIndex == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				numArray[count] = index;
				count++;
				if (count == 5)
					break;
			}
		}
		return numArray;
	}

	public static void main(String[] args) {
		int[] numArray = new FindFirstFivePrimeNumFromRange().getFirstFivePrimeNum(10, 50);
		for (int index = 0; index < numArray.length; index++) {
			System.out.println(numArray[index]);
		}
	}
}
