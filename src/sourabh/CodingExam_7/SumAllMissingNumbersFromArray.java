/*16th May'2021 : Test - 7 [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21
*/
package sourabh.CodingExam_7;

public class SumAllMissingNumbersFromArray {
	int getSumAllMissingNumbersFromArray(int[] arrInput) {
		int sum=0;		
		for(int num=1; num<=10; num++) {
			boolean isNumberPresent= false;
			for(int index=0; index<arrInput.length; index++) {
				if(num==arrInput[index]) {
					isNumberPresent= true;
					break;
				}
					
			}
			if(isNumberPresent==false)
			sum= sum+num;
		}
		return sum;		
	}

	public static void main(String[] args) {
		SumAllMissingNumbersFromArray sumAllMissingNumbersFromArray = new SumAllMissingNumbersFromArray();
		int[] arrInput = { 1, 3, 4, 7, 9, 10 };
		int sumOutput=sumAllMissingNumbersFromArray.getSumAllMissingNumbersFromArray(arrInput);
		System.out.println("output : "+sumOutput);
	}
}
