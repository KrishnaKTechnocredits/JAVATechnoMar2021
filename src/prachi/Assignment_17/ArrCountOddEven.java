package prachi.Assignment_17;

import java.util.Scanner;

/*Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

public class ArrCountOddEven {

	void countOddEvnNumbers(int[] numberArr) {
		int evenCount = 0;
		for(int index = 0;index < numberArr.length;index++){
			if(numberArr[index] % 2 == 0)
				evenCount++;	
		}
		System.out.println("Count of even Numbers is : "+evenCount);
		System.out.println("Count of Odd Number is : "+(numberArr.length - evenCount));
	}

	public static void main(String[] args) {
		int[] numberArr = {10,23,26,27,88,87,65};
		ArrCountOddEven evenOddNumbers = new ArrCountOddEven();
		evenOddNumbers.countOddEvnNumbers(numberArr);
	}
}

