package kangan.assignments.assignment_17;

public class ArrayMaxLengthCount_11 {

	int getMaxLengthIndex(String[] input){
    	int max = input[0].length();
   	
    	for (int index = 1; index < input.length; index++) {
    		if(input[index].length() > max) 
            	max = input[index].length();
    		
    	}
		return max;
	}
	
    public static void main(String[] args) {
    	String[] name = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
    	ArrayMaxLengthCount_11 arrayMaxLengthIndex = new ArrayMaxLengthCount_11();
    	int maxLengthIndex = arrayMaxLengthIndex.getMaxLengthIndex(name);
    	System.out.println(maxLengthIndex);
    }
	
}
