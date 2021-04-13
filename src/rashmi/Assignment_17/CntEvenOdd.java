/*Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

package rashmi.Assignment_17;

public class CntEvenOdd {

	int[] num = { 2, 3, 6, 89, 22, 0, -1, 8, 9, 17, 55, 8, 5 };

	void findEvenOddCnt() {
		int evenCnt = 0, oddCnt;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenCnt++;
			}
		}
		oddCnt = num.length - evenCnt;
		System.out.println("Even number count : " + evenCnt);
		System.out.println("Odd number count :" + oddCnt);
	}

	public static void main(String[] args) {
		CntEvenOdd cntEvenOdd = new CntEvenOdd();
		cntEvenOdd.findEvenOddCnt();

	}
}
