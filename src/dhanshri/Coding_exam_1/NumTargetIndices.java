package dhanshri.Coding_exam_1;

public class NumTargetIndices {
	
    int[] indicesNumtarget(int[] input, int tNum) {
    	 // int[] nextNum = new int[2];
    	for (int index=0;index<input.length;index++) {
    		
    		for (int index1=1;index<input.length;index++)
    			
	        if(input[index]+input[index1]==tNum) {
	    	 	
	        	
	        	return new int [] {index, index1};
			}
	   
    	}
    	
    	return new int [] {};
    }
	
	
	
	public static void main(String[] args) {
		int [] num = {2,11,15,7,4};
		 int target = 9;
		 NumTargetIndices numTargetIndices = new NumTargetIndices();
		int [] sum = numTargetIndices.indicesNumtarget(num,target);
		for (int index=0;index<sum.length;index++)
			System.out.println(sum[index]);
		
		 }

}
