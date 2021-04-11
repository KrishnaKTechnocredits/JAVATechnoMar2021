package dipali;

public class ArrayAssignment7 {
	public void findMinNoInArray(int[] input) {
		int minNo=0;
		int minNum=0;
		if(!(input == null)) {
			int arrLen=input.length;
			minNo = input[0];
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt] < minNo) {
					minNum=input[cnt];
					minNo=minNum;
				}
			}
			
			System.out.println("min number is given array is "+minNum);
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {22,35,65,88,11,23,45};
		new ArrayAssignment7().findMinNoInArray(arr);
	}
}
