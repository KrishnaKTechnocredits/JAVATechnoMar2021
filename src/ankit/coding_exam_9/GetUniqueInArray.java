// get Unique numbers in Array by moduler approch 
package ankit.coding_exam_9;

import java.util.Arrays;

public class GetUniqueInArray {
	static int[] input = {10,2,3,10,3,55,61,2};
	int[] output = new int[input.length];
	
	private boolean isAvailable(int[] output , int a) {
		boolean isAvailFlag = false;
		for(int i=0 ; i < output.length ; i++) {
			if(a==output[i]) {
				isAvailFlag = true;
				break;
			}	
		}
		return isAvailFlag;
	}

	public  void printUniqueArray(int[] input){
		boolean flag = false;
		int temp = ' ';
		int outputIndex =0;
		for(int index = 0; index < input.length ; index++) {
			temp = input[index];
			flag = isAvailable(output, temp);
			if(flag==false) {
				output[outputIndex]= temp;
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		GetUniqueInArray getUniqueInArray = new GetUniqueInArray();
		getUniqueInArray.printUniqueArray(input);
	}
}
