package krati_Jain.Assignment_17;

public class NegativePositiveCount {

	int negativeCount;
	int positiveCount;
	
	void countOperation(int[] numArr) {
		for (int index=0; index<numArr.length; index++) {
			if(numArr[index]<0) 
				negativeCount++;
			else
				positiveCount++;
		}
		
		System.out.println("Count of negative numbers in the array is : " + negativeCount);
		System.out.println("Count of positive numbers in the array is : " + positiveCount);
			
	}
	
	public static void main(String[] args) {
		NegativePositiveCount negPosCount = new NegativePositiveCount();
		int[] numArr = {1, -9, 0, -99, 1000, -800, 72, 80, -294};
		negPosCount.countOperation(numArr);
		
		
	}
	
}
