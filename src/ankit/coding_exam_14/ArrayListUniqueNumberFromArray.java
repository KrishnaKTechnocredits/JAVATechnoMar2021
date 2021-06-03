/*
2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */
package ankit.coding_exam_14;

import java.util.ArrayList;

public class ArrayListUniqueNumberFromArray {

	static ArrayList<Integer> getNonDuplicateNumber(ArrayList<Integer> intArrList){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index = 0 ; index < intArrList.size(); index++){
			if(intArrList.indexOf(intArrList.get(index)) == intArrList.lastIndexOf(intArrList.get(index))){
				output.add(intArrList.get(index));
			}
		}
		return output;
	}

	static ArrayList<Integer> getUniqueNumber(ArrayList<Integer> intArrList){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index = 0 ; index < intArrList.size(); index++){
			if(!output.contains(intArrList.get(index))){
				output.add(intArrList.get(index));
			}
		}
		return output;
	}
	
	public static void main(String[] args){
		int[] intArr = {1,8,6,3,4,5,2,3,6,9,8,4};
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		for(int index = 0 ; index < intArr.length; index++){
			intArrList.add(intArr[index]);
		}
		
		System.out.println("Input Array :"+intArrList);
		System.out.println("Output Non Duplicte Array : "+getNonDuplicateNumber(intArrList));
		System.out.println("Output Unique Number Array :"+getUniqueNumber(intArrList));
	}
}
