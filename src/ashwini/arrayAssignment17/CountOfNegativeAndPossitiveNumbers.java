package ashwini.arrayAssignment17;
/*
 Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4

 */

public class CountOfNegativeAndPossitiveNumbers {
	void negativePossitiveNumCount(int[] input) {
		int positiveCount=0, negativeCount=0;
		for(int index=0; index<input.length;index++) {
			if(input[index]>0) 
				positiveCount++;
			else 
				negativeCount++;
		}
		System.out.println("Positive number count in array is :"+positiveCount);
		System.out.println("Negative number count in array is :"+negativeCount);
	}

	public static void main(String[] args) {
		int[] array = {10,23,26,-27,-88,87,-65};
		CountOfNegativeAndPossitiveNumbers countOfNegativeAndPossitiveNumbers = new CountOfNegativeAndPossitiveNumbers();
		countOfNegativeAndPossitiveNumbers.negativePossitiveNumCount(array);

	}

}
