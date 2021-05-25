package renuka.exam7;


/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/

public class ReturnSumAndMaxNumber {
	
	int getSumOfAllMissingNumber(int[] arr) {
		int sum = 0;
		for(int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for(int index  = 0; index < arr.length; index++) {
				if(num == arr[index]) 
					isNumPresent = true;	
			}
			if(!isNumPresent)
				sum += num;
		}
		return sum;
	}
	
	int getHighestMissingNumber(int[] arr) {
		int highestNum = 0;
		for(int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for(int index  = 0; index < arr.length; index++) {
				if(num == arr[index]) 
					isNumPresent = true;	
			}
			if(!isNumPresent) {
				
			    if(highestNum < num)
				    highestNum = num;
			}
		}
		return highestNum;
	}

	public static void main(String[] args) {
		ReturnSumAndMaxNumber missingNumber = new ReturnSumAndMaxNumber();
		  int[] arr = {1,3,4,7,9,10};
		  System.out.println("Sum of all missing number is: " + missingNumber.getSumOfAllMissingNumber(arr));
		  System.out.println("Highest missing number is: " + missingNumber.getHighestMissingNumber(arr));
	}

}
