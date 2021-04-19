package dipali;

public class Arrayassignment1 {
	
	public void coundOddAndEvenNo(int[] input) {
		if(!(input == null)) {
			int arrLen=input.length;
			int evenCount = 0;
			int oddCount;
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt]%2==0) {
					evenCount++;	
				}
			}
			
			if(!(evenCount == 0)) {
				System.out.println("Even no count is given array is "+evenCount);
				//print odd no count
				oddCount = arrLen-evenCount;
				System.out.println("Odd no count is given array is "+oddCount);
			}
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {10,23,26,27,88,87,65};
		new Arrayassignment1().coundOddAndEvenNo(arr);
	}
}
