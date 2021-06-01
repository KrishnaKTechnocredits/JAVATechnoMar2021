package ankit.coding_exam_12;

import java.util.ArrayList;

public class ArrayListDivisibleByProblem {

	static ArrayList<Integer> getNumDivBy3or5or3And5(ArrayList<Integer> intList){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index = 0; index < intList.size(); index++) {
			if(intList.get(index) % 3 == 0 || 
					intList.get(index) % 5 == 0 || 
					(intList.get(index) % 3 == 0 && intList.get(index) % 5 == 0)) {
				output.add(intList.get(index));
			}	
		}return output;	
	}

	public static void main(String[] args) {
		ArrayList<Integer> intList= new ArrayList<>();
		intList.add(10);
		intList.add(2);
		intList.add(3);
		intList.add(6);
		intList.add(15);
		intList.add(44);
		intList.add(32);
		System.out.println("Input ArrayList : "+intList);
		System.out.println("Output :"+getNumDivBy3or5or3And5(intList));	
	}
}
