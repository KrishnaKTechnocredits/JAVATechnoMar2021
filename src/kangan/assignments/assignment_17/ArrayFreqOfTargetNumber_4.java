package kangan.assignments.assignment_17;

public class ArrayFreqOfTargetNumber_4 {

	void feqOfTargetNum(int[] input){
    	int frequency=0;
    	int temp = 23;
    	
    	for (int index = 0; index < input.length; index++) {
            if (input[index] == temp)
            	frequency++;
        }
    	System.out.println("23 number frequency is : " + frequency);
    }
	
    public static void main(String[] args) {
    	int[] number = {10,23,23,44,23,10,23,4,23};
    	ArrayFreqOfTargetNumber_4 arrayFreqOfTargetNumber = new ArrayFreqOfTargetNumber_4();
    	arrayFreqOfTargetNumber.feqOfTargetNum(number);
    }
}

