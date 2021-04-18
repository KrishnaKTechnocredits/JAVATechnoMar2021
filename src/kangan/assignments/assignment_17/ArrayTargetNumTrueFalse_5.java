package kangan.assignments.assignment_17;

public class ArrayTargetNumTrueFalse_5 {

	boolean isNumberPresent(int[] input, int target){
    
    	for (int index = 0; index < input.length; index++) {
            if (input[index] == target) {
            	//System.out.println("Number is present");
            	return true;
            }
            else {
            	//System.out.println("Number not found");
            	
            }
    	}
		
		return false;
	}
     	
    public static void main(String[] args) {
    	int[] number = {10,23,23,44,23,10,23,4,23};
    	ArrayTargetNumTrueFalse_5 arrayTargetNumTrueFalse = new ArrayTargetNumTrueFalse_5();
    	boolean flag = arrayTargetNumTrueFalse.isNumberPresent(number,44);
    	System.out.println(flag);
    }
}
