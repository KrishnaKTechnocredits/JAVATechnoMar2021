package dipali;

public class ArrayAssignment3 {
	
	public void countPositiveAndnegativeNo(int[] input) {
		if(!(input == null)) {
			int arrLen=input.length;
			int positiveNO=0;
			int negativeNo=0;
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt]> 0) {
					positiveNO++;	
				}else {
					negativeNo++;
				}
			}
			System.out.println("Count for positive no in given array is "+positiveNO);
			System.out.println("Count for negative no in given array is "+negativeNo);
		}
	}
	public static void main(String[] args) {
		int[] arr= {10,23,26,-27,-88,87,-65};
		new ArrayAssignment3().countPositiveAndnegativeNo(arr);
	}
}
