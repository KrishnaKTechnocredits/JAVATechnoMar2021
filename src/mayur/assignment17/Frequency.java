package mayur.assignment17;

public class Frequency {
	void findFrequency(int[] input, int targetNumber) {
		int targetNumberCount = 0;
		for(int index = 0; index<input.length;index++) {
			if(input[index]== targetNumber)
				targetNumberCount++;
		}
		System.out.println("Frequency of " +targetNumber+ " in given array is: " +targetNumberCount);
	}
		
	public static void main(String[] args) {
		Frequency frequency  = new Frequency();
		int[] input = {10,23,23,44,23,10,23,4,23};
		int targetNumber = 23;
		frequency.findFrequency(input, targetNumber);
	}

}
