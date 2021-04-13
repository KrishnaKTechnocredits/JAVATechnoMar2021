/*Assignment - 17 : 10th April'2021

Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount */

package sourabh.arrayExample;

public class CountOddEven {
	void getCountOddEven() {
		int[] number= {10,23,26,27,88,87,65};
		int evenCount=0;
		for(int index=0;index<number.length;index++) {
			if(number[index]%2==0) {
				System.out.println("Even: "+number[index]);
				evenCount++;
			}
			else
				System.out.println("Odd: "+number[index]);
		}
		System.out.println("Even Count: "+evenCount);
		int oddCount=number.length-evenCount;
		System.out.println("Odd Count: "+oddCount);		
	}
	public static void main(String[] args) {
		CountOddEven countOddEven= new CountOddEven();
		countOddEven.getCountOddEven();
	}
}
