package trupti.CodingExam14;

import java.util.ArrayList;

public class CollectionUniqueNum {
	
	boolean checkUniqueElement(int number, ArrayList<Integer> output) {
		for (int index = 0;index < output.size();index++){
			if(number==output.get(index)){
				return true;
			}
		}
		return false;
	}
	
	ArrayList<Integer> getUniqueElement(int[] arr) {
		ArrayList<Integer> output=new ArrayList<Integer>();
		output.add(arr[0]);
		
		for(int index=1;index<arr.length;index++) {
			if(!checkUniqueElement(arr[index], output)) {
				output.add(arr[index]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int [] input= {1,8,6,3,4,5,2,3,6,9,8,4};
		ArrayList<Integer>output=new CollectionUniqueNum().getUniqueElement(input);
		System.out.println(output);

	}

}
