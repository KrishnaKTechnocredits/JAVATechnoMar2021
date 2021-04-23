package milind.Assignment_17;



public class TargetNumArray {
	void istargetNumAvailable(int[] inputNumber,int targetNumber) {
		int targetCount=0;
		for(int index=0;index < inputNumber.length;index++) {
			if(inputNumber[index]==targetNumber) 
				targetCount++;
			}
			System.out.println("Frequency of " +targetNumber+ " in given array is: " +targetCount);
		}
		public static void main(String[] args) {
			TargetNumArray targetNumArray=new TargetNumArray();
			int[] inputNumber={10,23,23,44,23,10,23,4,23};
			int targetNumber=23;
			targetNumArray.istargetNumAvailable(inputNumber, targetNumber);
		}
		
		}
