package kangan.Coding.Exam1;

public class Array1 {
	int[] getIndices(int[] input, int target){
	    
    	for (int index = 0; index < input.length; index++) {
    		for (int innerindex = index + 1; innerindex < input.length; innerindex++) {
    			if (input[index] + input[innerindex] == target) {
    				return new int[] { index, innerindex };
    			}
    		}
    	}
    	
    	return new int[] {};
	}
     	
    public static void main(String[] args) {
    	int[] nums = {2,11,15,7,4};
    	Array1 array1 = new Array1();
    	int[] indices = array1.getIndices(nums, 9);

    	 if (indices.length == 2) {
    		 System.out.println(indices[0] + " " + indices[1]);
    	 } else {
             System.out.println("No Data found");
    	 }
    }
}
    	 


