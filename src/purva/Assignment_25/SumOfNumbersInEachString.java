package purva.Assignment_25;

public class SumOfNumbersInEachString {
	
	int sumOfNumbers(String input) {
		int total = 0;
		for(int index= 0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				total = total + temp;	
			}
		}
		return total;
	}

	
	int[] sumAll(String[] input) {
		int[] output = new int[input.length];
		for(int index = 0;index<input.length;index++) {
			output[index] = sumOfNumbers(input[index]);		
		}
		return output;	
	}
	
	public static void main(String[] a) {
		String[] input ={"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		SumOfNumbersInEachString sumOfNumbersInEachString = new SumOfNumbersInEachString();
		int[] total = sumOfNumbersInEachString.sumAll(input);
		for(int index =0; index<total.length;index++) {
			System.out.print(total[index]+" ");
		}
    }

}
