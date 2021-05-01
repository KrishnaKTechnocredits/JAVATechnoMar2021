package kangan.assignments.assignment_17;

public class ArrayReturnMin_7 {

	int getMinNumber(int[] input){
    	int min=input[0]; 
    	
    	for (int index = 1; index < input.length; index++) {
    		if(input[index] < min)
    		min = input[index];	
    	}
		return min;
    	
	}
    	
    public static void main(String[] args) {
    	int[] number = {22,35,65,88,11,23,45};
    	ArrayReturnMin_7 arrayMinNumber = new ArrayReturnMin_7();
    	int min = arrayMinNumber.getMinNumber(number);
    	System.out.println(min);
    	
}
}
