/*
 1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
 */

package pavan.PavanB_Coding_Test_7;

public class Exam7 {
	int missingnum = 0;
	boolean isavailable;
	int maxnum = 0;
	int[] getSumOfMissingNum() {

		int[] arr = { 1, 3, 4, 7, 9, 10 };
		int[]arrret= new int[2];
		boolean isPresent = false;
		for (int num = 1; num <= 10; num++) {
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isPresent = true;
					break;
				}
			}
			if (isPresent == false) {
				missingnum = missingnum + num;
				if (num > maxnum)
					maxnum = num;
			}
			isPresent = false;
		}
		arrret[0]= missingnum;
		arrret[1]= maxnum;
		
		return arrret;

	}	

	public static void main(String[] args) {
		Exam7 e = new Exam7();
		int[]arret=e.getSumOfMissingNum();
		System.out.println("misging num "+ arret[0]);
		System.out.println("maxnum "+ arret[1]);
	}

}
