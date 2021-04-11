package meenu.assignment_17;

/*From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

public class MinNumber {

	int getMinNumber(int[] numberArray){
		int minimumNumber = numberArray[0];
		for(int index = 1;index<numberArray.length;index++) {
			if(numberArray[index] < minimumNumber) 
				minimumNumber = numberArray[index];
		}
			return minimumNumber;			
	}

	
	public static void main(String[] args) {
		int[] numberArray = {22,35,65,88,11,23,45};
		MinNumber minNumber = new MinNumber();
		int minimumNumber = minNumber.getMinNumber(numberArray);
		System.out.println("Minimum number in array is : "+minimumNumber);
		
	}

}



