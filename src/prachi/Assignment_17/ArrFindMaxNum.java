package prachi.Assignment_17;

import java.util.Scanner;

/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

public class ArrFindMaxNum {
	int findMaxNum(int[] numberArr) {
		int maxNum=numberArr[0];
		for (int index = 1; index < numberArr.length; index++) {
			if (numberArr[index] > maxNum)
				maxNum=numberArr[index];
		}
		return maxNum;
	}

	public static void main(String[] args) {
		ArrFindMaxNum maxnum=new ArrFindMaxNum();
		int[] numberArr = {22,35,65,88,11,23,45};
		int maximumNum = maxnum.findMaxNum(numberArr);
		System.out.println("Maximum number in array is : "+maximumNum);		
	}
}
