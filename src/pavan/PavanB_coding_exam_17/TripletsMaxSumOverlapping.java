package pavan.PavanB_coding_exam_17;

import java.util.ArrayList;

public class TripletsMaxSumOverlapping {
	
	
	private String getMaxTriplet(int []inputArray) {
		int sum=0;
		ArrayList<ArrayList<Integer>> outputArylist=new ArrayList<ArrayList<Integer>>();
		for(int index=0; index<inputArray.length-2; index++) {
			if(sum<(inputArray[index] +inputArray[index+1]+ inputArray[index+2])){
				sum= inputArray[index]+ inputArray[index+1]+ inputArray[index+2];
				
				ArrayList<Integer> numlist = new ArrayList<Integer>();
				numlist.add(inputArray[index]);
				numlist.add(inputArray[index+1]);
				numlist.add(inputArray[index+2]);
				outputArylist.add(numlist);
				
				
				
			}
			
		}
		return outputArylist.get(outputArylist.size()-1)+" :"+ sum;
		
	}
	
	
	public static void main(String[] args) {
		int[] input = { 1, 12, 13, 14, 15, 11, 4, 2, 1 };
		
		String ListofTripletout= new TripletsMaxSumOverlapping().getMaxTriplet(input);
		System.out.println(ListofTripletout);
	}

}
