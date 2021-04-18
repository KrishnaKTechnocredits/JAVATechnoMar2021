package kangan.assignments.assignment_17;

public class ArrayMinLength_10 {

	String getMinLength(String[] input){
    	int minLength = input[0].length();
    	String minName = input[0];
    	
    	
    	for (int index = 1; index < input.length; index++) {
    		if(input[index].length() < minLength) {
    			minLength = input[index].length();
    			minName = input[index];
    	
    	}
    	}
		return minName;
    	
	}
	
    public static void main(String[] args) {
    	String[] name = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
    	ArrayMaxLength_8 arrayMaxLength = new ArrayMaxLength_8();
    	String maxLength = arrayMaxLength.getMaxLength(name);
    	System.out.println(maxLength);
    }
	
}
