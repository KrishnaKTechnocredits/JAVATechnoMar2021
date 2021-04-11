package mayur.assignment17;

public class OddEvenDifference {
	void getDifference(int[] input) {
		int evenCount = 0;
		int oddCount = 0;
		for(int index = 0; index<input.length;index++) {
			if(input[index]%2==0)
				evenCount+=input[index];
			else
				oddCount+=input[index];
		}
		if(evenCount>oddCount)
			System.out.println("Difference of sum of odd and even numbers is:" +(evenCount-oddCount));
		else
			System.out.println("Difference of sum of odd and even numbers is:" +(oddCount-evenCount));
	}
	
	
	public static void main(String[] args) {
		OddEvenDifference oe = new OddEvenDifference();
		int[] input = {10,23,26,27,88,87,65};
		oe.getDifference(input);
		}
	}
	


