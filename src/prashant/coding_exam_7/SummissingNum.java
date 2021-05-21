/*return sum of all missing number from given array
Range : 1 to 10
input :{ 1, 3, 4, 7, 9, 10 }
output :21
*/
package prashant.coding_exam_7;

public class SummissingNum {
	int sumNumMissing(int[] inputarr, int maxrange) {
		int sum_existNumbers = 0;
		int sumAllNumbers = 0;
		for (int index = 0; index < inputarr.length; index++) {
			sum_existNumbers += inputarr[index];
		}
		sumAllNumbers = (maxrange * (maxrange + 1) / 2);
		return sumAllNumbers - sum_existNumbers;
	}

	public static void main(String[] args) {
		int[] numarr = { 1, 3, 4, 7, 9, 10 };
		int outputsum = new SummissingNum().sumNumMissing(numarr, 10);
		System.out.println("Missing Number sum from given array { 1, 3, 4, 7, 9, 10 } is " + outputsum);
	}
}
