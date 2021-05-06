package krishna.Assignment_30;

/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */
public class SecondMaxArray {
	void findSecondMax(int[] numberArray) {
		int maxnum = numberArray[0];
		int secondmax = numberArray[0];
		
		for (int index = 1; index < numberArray.length; index++) {
			if (numberArray[index] > maxnum) {
				secondmax = maxnum;
				maxnum = numberArray[index];
			} else if (numberArray[index] > secondmax) {
				secondmax = numberArray[index];
			}
		}
		System.out.println("The second maximum number in numberarray is :" + secondmax);
	}

	public static void main(String[] args) {
		SecondMaxArray secondMaxArray = new SecondMaxArray();
		int[] numberArray = { 10, 33, 43, 55, 97, 11, 3 };
		secondMaxArray.findSecondMax(numberArray);
	}
}
