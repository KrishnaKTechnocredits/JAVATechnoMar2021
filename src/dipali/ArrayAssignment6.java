package dipali;

public class ArrayAssignment6 {
	public void findMaxNoInArray(int[] input) {
		int maxNo=0;
		if(!(input == null)) {
			int arrLen=input.length;	
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt] > maxNo) {
					maxNo=input[cnt];	
				}
			}
			
			System.out.println("max number is given array is "+maxNo);
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {22,35,65,88,11,23,45};
		new ArrayAssignment6().findMaxNoInArray(arr);
	}
}
