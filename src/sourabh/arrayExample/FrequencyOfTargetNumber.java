/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4 */

package sourabh.arrayExample;

public class FrequencyOfTargetNumber {
	int freCount=0;
	int getFrequencyOfTargetNumber(int[] number, int targetNumber) {
		for(int index=0; index<number.length; index++) {
			if(targetNumber==number[index])
				freCount++;
		}
		//System.out.println("frequency"+freCount);
		return freCount;
	}
	public static void main(String[] args) {
		FrequencyOfTargetNumber frequency= new FrequencyOfTargetNumber();
		int[] number= {10,23,23,44,23,10,23,4,23};
		int targetNumber=23;
		int freCount= frequency.getFrequencyOfTargetNumber(number,targetNumber);
		System.out.println("Frequency of "+targetNumber+" is: "+freCount);
	}

}
