/*Program 1: Return Unique elements from given array. [30 mins max] 
  input : {10,2,3,10,3,55,61,2}; 
  Ouput : {10,2,3,55,61} 
  Hint : create new array Called output, insert eligible numbers and return output array. 
  Hint : Method should take int array as parameter and return an array.*/
package shilpa.coding_exam_8;

public class FindUniqueNum {
	int[] getUniqueNum(int[] inputArr) {

		int[] outputArr = new int[inputArr.length];
		int index3 = 0;
		for (int index1 = 0; index1 < inputArr.length; index1++) {
			if (inputArr[index1] != 0) {
				for (int index2 = index1 + 1; index2 < inputArr.length; index2++) {
					if (inputArr[index1] == inputArr[index2]) {
						inputArr[index2] = 0;
					}
				}
				outputArr[index3] = inputArr[index1];
				inputArr[index1] = 0;
				index3++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		FindUniqueNum findUniqueNum = new FindUniqueNum();
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output;
		output = findUniqueNum.getUniqueNum(input);
		System.out.println("Unique Numbers from an array are");
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0)
				System.out.println(output[index]);
		}
	}
}