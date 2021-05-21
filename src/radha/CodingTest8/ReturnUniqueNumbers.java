/*
Programming Test - 8 :

Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 */
package radha.CodingTest8;

public class ReturnUniqueNumbers {
	
	int[] returnUniqueNum(int[] arr){
		int[] output = new int[arr.length];
		int count = 0; 
		for(int index=0;index<arr.length;index++) {
			boolean isUnique=false;
			for(int innerI=0;innerI<index;innerI++) { 
				if(arr[index]==arr[innerI]) {
					isUnique = true;
					break;
				}
			}
				if(!isUnique) {
					output[count] = arr[index];
					count++;
				}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnUniqueNumbers unique = new ReturnUniqueNumbers();
		int[] givenArr = {10,2,3,10,3,55,61,2};
		int[] outputArr = unique.returnUniqueNum(givenArr);
		System.out.println("Unique elemments in the array are: ");
		for(int i=0;i<outputArr.length;i++) {
			if(outputArr[i]!=0)
			System.out.print(outputArr[i]+" ");
		}	 
	}
}