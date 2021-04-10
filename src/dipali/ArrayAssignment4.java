package dipali;

public class ArrayAssignment4 {
	
	public int countFrequencyOfTargetNo(int[] input, int targetNo) {
		int count=0;
		if(!(input == null)) {
			int arrLen=input.length;	
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt] == targetNo) {
					count++;	
				}
			}
		}
		return count;	
	}

	public static void main(String[] args) {
		int[] arr= {10,23,23,44,23,10,23,4,23};
		int output=new ArrayAssignment4().countFrequencyOfTargetNo(arr,23);
		if(output >0)
			System.out.println("Frequncy of target no 23 in given array is "+output);
		else
			System.out.println("Frequncy of target no 23 in given array is "+output);
	}
}
