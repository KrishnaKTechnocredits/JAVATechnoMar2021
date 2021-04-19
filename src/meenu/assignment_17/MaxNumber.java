package meenu.assignment_17;

/*From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/

public class MaxNumber {
	
	int getMaxNumber(int[] numberArray){
		int maximumNumber = numberArray[0];
		for(int index = 1;index<numberArray.length;index++) {
			if(numberArray[index] > maximumNumber) 
				maximumNumber = numberArray[index];
		}
			return maximumNumber;			
	}

	
	public static void main(String[] args) {
		int[] numberArray = {22,35,65,88,11,23,45};
		MaxNumber maxNumber = new MaxNumber();
		int maximumNumber = maxNumber.getMaxNumber(numberArray);
		System.out.println("Maximum number in array is : "+maximumNumber);
		
	}

}
