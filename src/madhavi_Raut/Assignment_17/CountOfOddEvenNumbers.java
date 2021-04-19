package madhavi_Raut.Assignment_17;
/*Assignment - 17 : 10th April'2021
Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount*/

public class CountOfOddEvenNumbers {
	
	void findCountOfOddEvenNumbers(int[] num) {
		int evenCount = 0;
		for(int index=0; index<num.length; index++) {
			if(num[index] % 2 == 0)
				evenCount++;
		}
		System.out.println("Count of Even numbers in given array is: "+evenCount);
		System.out.println("Count of Odd numbers in given array is: "+(num.length-evenCount));		
	}
	public static void main(String[] args) {
		int[] num = {10,23, 26, 27, 88, 87, 65};
		new CountOfOddEvenNumbers().findCountOfOddEvenNumbers(num);
	}
}
