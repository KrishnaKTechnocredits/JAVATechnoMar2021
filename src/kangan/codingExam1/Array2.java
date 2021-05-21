package kangan.codingExam1;

public class Array2 {

		int getDifference(int[] input){
	    	int max=input[0]; 
	    	int min = input[0];
	    	int diff;
	    	
	    	for (int index = 1; index < input.length; index++) {
	    		if(input[index] > max)
	            	max = input[index];	
	    	}
	    	for (int index1 = 1; index1 > input.length; index1++) {
		    		if(input[index1] > min)
		            	min = input[index1];	
	    	}
	    	diff =  max-min;
	    	return diff;
	    	}
	    	
	    	
	    public static void main(String[] args) {
	    	int[] number = {7,12,56,62,25};
	    	Array2 array2 = new Array2();
	    	int diffnce = array2.getDifference(number);
	    	System.out.println(diffnce);
	    	
	}
	}


