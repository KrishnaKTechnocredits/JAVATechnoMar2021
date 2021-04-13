package madhavi_Raut.Assignment_17;
/*Program 5: return true if you find a target number from given array else 
return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)
}*/

public class IsNumberPresent {
		
	boolean isNumberPresent(int[] num, int numToFind) {
		boolean isNumPresent = false;
		for(int index=0; index<num.length; index++) {
			if(num[index] == numToFind)
				isNumPresent = true;
		}
		return isNumPresent;
	}	
		
	public static void main(String[] args) {
		int[] num = {10,23,23,44,23,10,23,4,23};
		int numToFind = 45;
		if(new IsNumberPresent().isNumberPresent(num, numToFind))
			System.out.println("Number "+numToFind +" found in given array.");
		else
			System.out.println("Number "+numToFind +" does not found in given array.");
	}

}
