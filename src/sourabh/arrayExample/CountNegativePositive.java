/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
         */

package sourabh.arrayExample;

public class CountNegativePositive {
	void getNegativePositiveCount(int[] number) {
		int negativeCount=0, positiveCount=0;
		for(int index=0; index<number.length;index++) {
			if(number[index]>0)
				positiveCount++;
			else if(number[index]<0)
				negativeCount++;
		}
		System.out.println("Positive Count"+positiveCount);
		System.out.println("Negative Count"+negativeCount);
		
	}
	public static void main(String[] args) {
		CountNegativePositive getcount= new CountNegativePositive();
		int[] number= {10,23,26,-27,-88,87,-65};
		getcount.getNegativePositiveCount(number);
	}
}
