package meenu.assignment_17;

/*return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
}  
*/
import java.util.Scanner;

public class FindTargetNumber {
	
	boolean isTargetNumberAvailable(int[] numberArray,int targetNumber) {
		for(int index = 0;index<numberArray.length;index++) {
			if(numberArray[index]== targetNumber) {
				//System.out.println("Number "+targetNumber+" is present in given array");
				return true;
			}
		}		
		return false;
	}

	public static void main(String[] args) {
		FindTargetNumber findTargetNumber = new FindTargetNumber();
		int[] numbers = {10,23,23,44,23,10,23,4,23};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the target number");
		int targetNumber = scanner.nextInt();
		boolean value = findTargetNumber.isTargetNumberAvailable(numbers,targetNumber);	
        if(value == true)
        	System.out.println("Number "+targetNumber+" is present in given array");
        else
        	System.out.println("Number "+targetNumber+" is not present in given array");
	}

}
