/*Java Assignment 17: 10th April 2021

Program 3: From given numbers, count the negative and positive numbers.

input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4
*/

package vaibhav.Assignment_17;

public class NegativePositiveCount {
	
	int nCount;

	void toFindNegativePositiveCount(int[] numArr) {

		for (int index = 0; index<numArr.length; index++) {
			if (numArr[index] < 0) {
				nCount++;
			}
		}
		System.out.println("Count for Negative Number form given set of numbers is : " + nCount);
		System.out.println("Count for Positive Number form given set of numbers is : " + (numArr.length - nCount));

	}

	public static void main(String[] args) {
		int[] numArr = { 10, 23, 26, -27, -88, 87, -65 };

		NegativePositiveCount negativePositiveCount = new NegativePositiveCount();
		negativePositiveCount.toFindNegativePositiveCount(numArr);

	}

}
