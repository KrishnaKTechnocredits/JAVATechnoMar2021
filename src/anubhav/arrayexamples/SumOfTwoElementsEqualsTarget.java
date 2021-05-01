package anubhav.arrayexamples;

/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
		Input: nums = [2,11,15,7,4], target = 9
		Output: [0,3]
		Output: Because nums[0] + nums[3] == 9, we return [0, 3]*/


public class SumOfTwoElementsEqualsTarget {
	
	int[] inputArray(int[] input, int targetNumber){
		for (int index = 0; index < input.length; index++){
    		for (int innerindex = index + 1; innerindex < input.length; innerindex++){
    			if (input[index] + input[innerindex] == targetNumber)
    				return new int[] {index, innerindex};
    		}
    	}
    	return new int[] {};
	}

    public static void main(String[] args) {
    	int[] inputArray = {2,11,15,7,4};
    	SumOfTwoElementsEqualsTarget sumOfTwoElementsEqualsTarget = new SumOfTwoElementsEqualsTarget();
    	int[] indexValues = sumOfTwoElementsEqualsTarget.inputArray(inputArray, 9);
    	
    	if(indexValues.length == 2){
    		 System.out.println("["+indexValues[0] + " " + indexValues[1]+"]");
    	 }else{
             System.out.println("Nonne of the array elements add upto the target number");
    	 }
    }
}

