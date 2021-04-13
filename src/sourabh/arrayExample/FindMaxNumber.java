/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/

package sourabh.arrayExample;

public class FindMaxNumber {
	int getMaxNumber(int[] number) {
		int maxNumber=0;
		for(int index=0; index<number.length; index++) {
			if(number[index]>maxNumber)
				maxNumber=number[index];
		}
		return maxNumber;
	}
	public static void main(String[] args) {
		FindMaxNumber findMaxNumber= new FindMaxNumber();
		int[] number= {22,35,65,88,11,23,45};
		int maxNumber=findMaxNumber.getMaxNumber(number);
		System.out.println("Max Number is: "+maxNumber);
	}
}
