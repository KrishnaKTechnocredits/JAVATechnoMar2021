/*
 1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21

 */
package ravindra_J.coding_exam_7;

public class SumOfAllMissingArray {
	static int ans=0;
	int sumOfAllMissNo(int[] arr) {
		for(int range=1;range<=10;range++) {
			boolean isflag = false;
			for(int index=0;index<arr.length;index++) {
				if(range==arr[index]) {
					isflag=true;
					break;
				}
			}
			if(isflag==false) {
				ans=ans+range;
			}

		}
		return ans;
	}
	public static void main(String[] args) {

		SumOfAllMissingArray sumofallmissingarrya= new SumOfAllMissingArray();
		int[] input= {1,3,4,7,9,10};
		int output=sumofallmissingarrya.sumOfAllMissNo(input);
		System.out.println("sum of Missing no is: "+output);
	}

}
