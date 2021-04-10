/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

package sourabh.arrayExample;

public class FindMinNumber {
	int getMinNumber(int[] number) {
		int minNumber=number[0];
		for(int index=1; index<number.length; index++) {
			if(number[index]<minNumber)
				minNumber=number[index];
		}
		return minNumber;
	}
	public static void main(String[] args) {
		FindMinNumber findMinNumber= new FindMinNumber();
		int[] number= {22,35,65,88,11,23,45};
		int minNumber=findMinNumber.getMinNumber(number);
		System.out.println("Min Number is: "+minNumber);
	}

}
