package kangan.assignments.assignment_17;

public class ArrayIndexMaxLength_9 {

	int getMaxLengthIndex(String[] input){
    	int max = input[0].length();
    	int index1 = 0;
   	
    	for (int index = 1; index < input.length; index++) {
    		if(input[index].length() > max) {
            	max = input[index].length();
            	index1= index;
    		
    	}
    	}
		return index1;
	}
	
    public static void main(String[] args) {
    	String[] name = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
    	ArrayIndexMaxLength_9 arrayIndexMaxLength_9 = new ArrayIndexMaxLength_9();
    	int maxLengthIndex = arrayIndexMaxLength_9.getMaxLengthIndex(name);
    	System.out.println(maxLengthIndex);
    }
}
