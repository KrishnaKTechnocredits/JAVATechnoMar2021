/*
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */

package sourabh.CodingExam_14;

import java.util.ArrayList;

public class FindUniqueNumbers {
	public ArrayList<Integer> getUniqueNumbers(int[] numberList){
		ArrayList<Integer> outputNumberList= new ArrayList<Integer>();
		for(int index=0; index<numberList.length; index++) {
			boolean isDupli= false;
			for(int innerIndex= index+1; innerIndex<numberList.length; innerIndex++ ) {
				if(numberList[index]==numberList[innerIndex]) {
					//outputNumberList.add(numberList[index]);
					isDupli= true;
					break;
				}
					
			}
			if(isDupli==false)
				outputNumberList.add(numberList[index]);	
		}
		
		return outputNumberList;

	}
	public static void main(String[] args) {
		int[] inputArr= {1,8,6,3,4,5,2,3,6,9,8,4};
		FindUniqueNumbers findUniqueNumbers= new FindUniqueNumbers();
		ArrayList<Integer> output= findUniqueNumbers.getUniqueNumbers(inputArr);
		System.out.println(output);
	}
}
