package neha_Rathi.CodingExam12;

import java.util.ArrayList;

public class ArrayListNumOperation {
	
	static ArrayList<Integer> numOperation(ArrayList<Integer> input){
		ArrayList<Integer> output= new ArrayList<Integer>();
		for(int index=0;index<input.size();index++) {
			if(input.get(index)%3==0 || input.get(index)%5==0) {
				output.add(input.get(index));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = {10,2,3,6,15,44,32};
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++) {
			arr1.add(arr[index]);
		}
		System.out.println("Numbers divisible by 3 or 5 are "+numOperation(arr1));
	}
}
