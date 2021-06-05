package pavan.PavanB_coding_exam_17;

import java.util.ArrayList;

public class TriplethavingmaxSumUnEvenInput {
	
	String getMaxTriplet(int []inputArray) {
		int sum=0;
		
		ArrayList<ArrayList<Integer>> listOfOutput=new ArrayList<ArrayList<Integer>>();
		for(int index=0; index<(inputArray.length-(inputArray.length%3)); index=index+3) {
			if(sum<(inputArray[index] +inputArray[index+1]+ inputArray[index+2])){
				sum= inputArray[index]+ inputArray[index+1]+ inputArray[index+2];
				
				ArrayList<Integer> numlist = new ArrayList<Integer>();
				numlist.add(inputArray[index]);
				numlist.add(inputArray[index+1]);
				numlist.add(inputArray[index+2]);
				listOfOutput.add(numlist);
		}
			}
		
		return listOfOutput.get(listOfOutput.size()-1)+" :"+ sum;
	}
	
	public static void main(String[] args) {
		int[] input = { 1, 12, 13, 14, 15, 11, 4, 2, 1 };
		
		String ListofoutMaxTriplet= new TriplethavingmaxSumUnEvenInput().getMaxTriplet(input);
		System.out.println(ListofoutMaxTriplet);
	}

}
