package prachi.Assignment_17;

/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

public class ArrFindMinNum {
	int findMaxNum(int[] numberArr) {
		int minNum=numberArr[0];
		for (int index = 1; index < numberArr.length; index++) {
			if (numberArr[index] < minNum)
				minNum=numberArr[index];
		}
		return minNum;
	}

	public static void main(String[] args) {
		ArrFindMinNum maxnum=new ArrFindMinNum();
		int[] numberArr = {22,35,65,88,11,23,45};
		int minimumNum = maxnum.findMaxNum(numberArr);
		System.out.println("Minimun number in array is : "+minimumNum);		
	}
}
