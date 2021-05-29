/*
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */
package paras.Coding_exam_14;

import java.util.ArrayList;

public class ReturnUniqueNumber {
	
	ArrayList<Integer> getUniqueNumbers(int words[]){
		ArrayList<Integer> output = new ArrayList<Integer>();
		boolean isExist = true;
		for(int index = 0; index < words.length; index++) {
			for(int innerindex = 0; innerindex < index; innerindex++) {
				if(words[index] == words[innerindex]) {
					isExist = false;
					break;
				}
			}
			if(isExist == true) {
				output.add(words[index]);	
			}
			isExist = true;
		}
		return output;
	}
	
	public static void main(String[] args) {
		ReturnUniqueNumber returnUniqueNumber = new ReturnUniqueNumber();
		int [] input = {1,8,6,3,4,5,2,3,6,9,8,4};
		System.out.println(returnUniqueNumber.getUniqueNumbers(input));
	}
}
