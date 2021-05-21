/*return highest missing number from given array
Range : 1 to 10
input :{ 1, 3, 4, 7, 9, 10 }
output :8
*/
package prashant.coding_exam_7;

public class HighestMissingNumber {
	int highestNumMissing(int[] inputarr, int maxrange) {
		int max = 0;
		for (int i = 1; i <= maxrange; i++) {
			boolean flag = false;
			for (int index = 0; index < inputarr.length; index++) {
				if (i == inputarr[index])
					flag = true;
			}
			if (flag == false)
				if (max < i) {
					max = i;
				}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numarr = { 1, 3, 4, 7, 9, 10 };
		int outputsum = new HighestMissingNumber().highestNumMissing(numarr, 10);
		System.out.println("Highest Number from given array { 1, 3, 4, 7, 9, 10 } is " + outputsum);
	}
}
