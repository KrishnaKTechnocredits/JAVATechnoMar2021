package prachi.Coding_Exam_7;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
 */
public class GetMissingNumber {

	void findMissingNums() {
		int[] input = {1,3,4,7,9,10};
		for (int num=1; num<10; num++) {
			boolean isNumPresent=false;
			for (int index=0;index<input.length;index++) {
				if(num==input[index]) {
					isNumPresent=true;
					break;
				}
			}
			if(isNumPresent==false)
				System.out.println(num);
		}
	}

	int returnSumOfMissingNums() {
		int sum=0;
		int[] input = {1,3,4,7,9,10};
		for (int num=1; num<10; num++) {
			boolean isNumPresent=false;
			for (int index=0;index<input.length;index++) {
				if(num==input[index]) {
					isNumPresent=true;
					break;
				}
			}
			if(isNumPresent==false)
				sum=sum+num;
		}
		return sum;
	}	


	int returnMaxMissingNum() {
		int max=0;
		int[] input = {1,3,4,7,9,10};
		for (int num=1; num<10; num++) {
			boolean isNumPresent=false;
			for (int index=0;index<input.length;index++) {
				if(num==input[index]) {
					isNumPresent=true;
					break;
				}
			}
			if(isNumPresent==false && num>max)
				max=num;
		}
		return max;
	}


	public static void main(String[] args) {
		GetMissingNumber gmn=new GetMissingNumber();
		System.out.println("Missing Numbers are: ");
		gmn.findMissingNums();
		System.out.println("-------------------------------------------");
		int sum = gmn.returnSumOfMissingNums();
		System.out.println("Sum of missing numbers is: "+sum);
		System.out.println("-------------------------------------------");

		int max = gmn.returnMaxMissingNum();
		System.out.println("Max number from missing number is: "+max);
	}
}


