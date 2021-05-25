package kangan.Coding.Exam7;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21*/

public class ReturnSum {

	int getMisingNumbers(int[] input) {
		int sum=0;
		for(int num=1;num<=10;num++) {
			boolean isNumPresent = false;
			for(int index=0;index<input.length;index++) {
				if(num==input[index]) {
					isNumPresent = true;
				break;
			}
			}
			if(isNumPresent == false) {
			System.out.println(num);
			sum=sum+num;
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		ReturnSum returnSum = new ReturnSum();
		int[] input= {1,3,4,7,9,10};
		int output = returnSum.getMisingNumbers(input);
		System.out.println(output);
	}
}
