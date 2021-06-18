package amrutaM.arrayAssignments;

/*Array Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4
*/
public class CountFrequencyOfNumber {
	
	void getNumberFrequency(int [] input,int targetNumber) {
		int frequency = 0;
		for(int index =1;index< input.length;index++) {
			if(input[index]==targetNumber) {
				frequency ++;
			}
		}
		System.out.println("Frequency of "+targetNumber +"is : "+frequency);
		
		
	}
	public static void main(String[] args) {
		CountFrequencyOfNumber countFrequencyOfNumber = new CountFrequencyOfNumber();
		int [] input = {10,23,23,44,23,10,23,4,23};
		countFrequencyOfNumber.getNumberFrequency(input, 23);
	}
}
