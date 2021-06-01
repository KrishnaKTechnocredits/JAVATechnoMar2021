/*return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21*/

/*return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/

package sangeeta.CodingExam;

public class CodingExam7 {

	int sumOfMissingNums(int[] numarr) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean missingNum = false;
			for (int index = 0; index < numarr.length; index++) {
				if (num == numarr[index])
					missingNum = true;
			}
			if (!missingNum)
				sum = sum + num;
		}
		return sum;
	}

	int highestMissingNum(int[] numarr) {
		int highestNum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean missingnum = false;
			for (int index = 0; index < numarr.length; index++) {
				if (num == numarr[index])
					missingnum = true;
			}
			if (!missingnum)
				if (highestNum < num)
					highestNum = num;
		}
		return highestNum;
	}

	public static void main(String[] args) {
		CodingExam7 codingExam7 = new CodingExam7();
		int[] numarr = { 1, 3, 4, 7, 9, 10 };
		System.out.println("Sum of all missing numbers is " + codingExam7.sumOfMissingNums(numarr));
		System.out.println("Highest missing number is " + codingExam7.highestMissingNum(numarr));
	}

}
