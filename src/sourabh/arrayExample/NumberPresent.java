/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  
*/

package sourabh.arrayExample;

public class NumberPresent {
	boolean isNumberPresent(int[] number, int targetNumber) {
		for(int index= 0; index<number.length; index++) {
			if(number[index]==targetNumber) {
				System.out.println("Target Number "+targetNumber+" available in Array");
				return true;
				}		
		}
		System.out.println("Target Number "+targetNumber+" not available in Array");	
		return false;

	} 
	public static void main(String[] args) {
		NumberPresent numberPresent= new NumberPresent();
		int[] number= {10,23,23,44,23,10,23,4,23};
		int targetNumber= 23;
		boolean isNumberPresent= numberPresent.isNumberPresent(number,targetNumber);
		//System.out.println("targetNumber available in Array."+isNumberPresent);
	}
}
