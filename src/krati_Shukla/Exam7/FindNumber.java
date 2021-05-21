package krati_Shukla.Exam7;

public class FindNumber {
	
	int[] getNumber(int[] input) {
		int length = input.length;
		int[] newArray = new int[length];
		int sum =0;
		
		for(int index=0; index<11; index++) {
			boolean flag = false;
			for(int innerIndex=0; innerIndex<length; innerIndex++) {
				if(index == input[innerIndex]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				newArray[index] = index;
				sum = sum+newArray[index];
			}
		}
		System.out.println("The sum of all missing numbers is :"+sum);
		return(newArray);
	}
	
	void maxNumber(int[] output) {
		int max = output[0];
		for(int index=0; index<output.length;index++) {
			if(max < output[index]) {
				max = output[index];
			}
		}
		System.out.println("Maximum missing number is :"+max);
	}
	
	public static void main(String[] a) {
		FindNumber findNumber = new FindNumber();
		int[] arr = {1,3,4,7,9,10};
		int[] output = findNumber.getNumber(arr);
		findNumber.maxNumber(output);
	}

}
