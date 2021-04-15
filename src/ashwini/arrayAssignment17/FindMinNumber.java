package ashwini.arrayAssignment17;
/*
 Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11

 */

public class FindMinNumber {
	void minNumber(int[] input) {
		int minNumber=input[0];
		System.out.println("given array list:");
		for(int index=0; index<input.length;index++) {
			System.out.println(input[index]);
			if(input[index]<minNumber) 
				minNumber=input[index];
		}
			System.out.println("Minimun Number in the given array is : "+minNumber);
			
	}

	public static void main(String[] args) {
		int array[] = {22,35,65,88,11,23,45};
		FindMinNumber findMinNumber = new FindMinNumber();
		findMinNumber.minNumber(array);
	}

}
