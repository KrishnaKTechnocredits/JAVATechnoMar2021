package kangan.assignments.assignment_17;

public class ArrayReturnMax_6 {

	int returnMax(int[] input){
    	int max=input[0]; 
    	
    	for (int index = 1; index < input.length; index++) {
    		if(input[index] > max)
            	max = input[index];	
    	}
		return max;
    	
	}
    	
    public static void main(String[] args) {
    	int[] number = {22,35,65,88,11,23,45};
    	ArrayReturnMax_6 arrayReturnMax_6 = new ArrayReturnMax_6();
    	int max = arrayReturnMax_6.returnMax(number);
    	System.out.println(max);
    	
}
}
