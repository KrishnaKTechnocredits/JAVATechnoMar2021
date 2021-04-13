package meenu.assignment_17;

/*From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
 */

public class EvenOddNumbers {
	
	void countOddEven(int[] numbers) {
		int evenCount = 0;
		for(int index = 0;index < numbers.length;index++){
			if(numbers[index]% 2 == 0)
				evenCount++;	
		}
		System.out.println("Count of even Numbers is : "+evenCount);
		System.out.println("Count of Odd Number is : "+(numbers.length - evenCount));
	}
	
	public static void main(String[] args) {
		int[] numbers = {10,23,26,27,88,87,65};
		EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
		evenOddNumbers.countOddEven(numbers);
		
	}

}
