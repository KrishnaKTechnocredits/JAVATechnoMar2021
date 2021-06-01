/*WAP to find Second max from given array
	int[] arr = {10,33,43,55,97,11,3};
	ouput : 55 */
package pravin.Assignment_30;

public class SecondMaxNumber {

	int getSecondMaxNumber(int[] numArr) {
		int maxNum = numArr[0], secondMaxNum = 0;
		for (int index = 0; index < numArr.length; index++) {
			if (maxNum < numArr[index]) {
				secondMaxNum = maxNum;
				maxNum = numArr[index];
			}
		}
		return secondMaxNum;
	}
	public static void main(String[] args) {
		System.out.println("Second Max number is:");
		System.out.println(new SecondMaxNumber().getSecondMaxNumber(new int[] { 10, 33, 43, 55, 97, 11, 3 }));
	}
}