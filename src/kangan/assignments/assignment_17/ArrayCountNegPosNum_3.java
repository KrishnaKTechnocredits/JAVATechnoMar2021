package kangan.assignments.assignment_17;

public class ArrayCountNegPosNum_3 {


    void negPosCount(int[] input){
    	int positiveCount=0;
    	int negativeCount=0;
    	
    	for (int index = 0; index < input.length; index++) {
            if (input[index] > 0)
            	positiveCount++;
            else
            	negativeCount++;
        }
    	System.out.println("Positive number count : " + positiveCount);
    	System.out.println("Negative number count : " + negativeCount);
    	
    }
	
    public static void main(String[] args) {
    	int[] number = {10,23,26,-27,-88,87,-65};
    	ArrayCountNegPosNum_3 arrayCountNegPosNum = new ArrayCountNegPosNum_3();
    	arrayCountNegPosNum.negPosCount(number);
    	
	}
}
