package meenu.assignment_17;

/*Return a difference between sum of even number and odd numbers.	
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : evenSum - oddSum

int getDifference(int[] input){
}
*/

public class NumberDifference {
	
	int evenCount= 0;
	int oddCount = 0;
	
	int getSumOfNumber(int[] arrayOfNumbers){
		int evenNumSum = 0;
		int oddNumSum = 0;		
		for(int index =0;index<arrayOfNumbers.length;index++) {
			if(arrayOfNumbers[index]% 2 == 0) {
				evenNumSum = evenNumSum+ arrayOfNumbers[index];
				evenCount++;
			}else{
				oddNumSum = oddNumSum + arrayOfNumbers[index];
				oddCount++;
			}	
		}
		int difference = evenNumSum - oddNumSum;
		return Math.abs(difference);

		
	}
	public static void main(String[] args) {
		int[] arrayOfNumbers = {10,23,26,27,88,87,65};
		NumberDifference numberDifference = new NumberDifference();
		int diff = numberDifference.getSumOfNumber(arrayOfNumbers);
		System.out.println("Difference between sum of even numbers and odd numbers : "+diff);
		System.out.println("Count of even numbers is : "+numberDifference.evenCount);
		System.out.println("Count of odd numbers is : "+numberDifference.oddCount);
		
	}

}
