package dipali;

public class ArrayAssignment2 {
	
	public int getDifferenceofEvenAndOddNoSum(int[] input) {
		int difference = 0;
		if(!(input == null)) {
			int arrLen=input.length;
			int evenSum=0;
			int oddSum=0;
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt]%2==0) {
					evenSum=evenSum+input[cnt];	
				}else {
					oddSum=oddSum+input[cnt];
				}
			}
			
			difference=evenSum-oddSum;	
		}
		return difference;
	}
	public static void main(String[] args) {
		int[] arr= {10,23,26,27,88,87,65};
		int output =new ArrayAssignment2().getDifferenceofEvenAndOddNoSum(arr);
		if( output > 0)
			System.out.println("Difference between evenSum and oddSum is "+output);
		else
			System.out.println("Difference between evenSum and oddSum is "+output);
	}
}
