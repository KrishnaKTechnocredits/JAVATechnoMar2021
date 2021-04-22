package renuka.assignment25;

/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

public class SumOfAllNum {
	
	int getSumOfString(String str) {
		int sum = 0;
		for(int index = 0; index < str.length(); index++ ) {
				char ch = str.charAt(index);
				if(Character.isDigit(ch)) {
					String temp = str.substring(index, index+1);
				    sum = sum + Integer.parseInt(temp);
				}			
			}
		return sum;	
		}
		

	
	int[] getStringFromArray(String[] str) {
	    int[] output = new int[str.length];
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			int sum = getSumOfString(str[i]);
			if (sum >= 0) {
				output[index] = sum;
				index++;
			}

		}
		return output;
	}

	public static void main(String[] args) {
		SumOfAllNum sumOfNoFromString = new SumOfAllNum();
		String[] str1 = {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		int[] output = new int [str1.length];
		output = sumOfNoFromString.getStringFromArray(str1);
		System.out.println("String which contains number from given array are");
		for (int i = 0; i < output.length; i++) {
				System.out.println("Sum of numbers from string is: " + "[" +str1[i]+ "]" + output[i]);
	}
  

	}

}
