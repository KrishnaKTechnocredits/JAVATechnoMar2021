package shivani.Assignment_25;

/*write a method which will return sum of each all number in each string 
		Input : :"TechnoCredits" ,"HP1W","Pd3R4K9","Krishna" ,"Aashvi25"
		Output: 6 14 12 15 74*/
public class SumOfArrayString {
	int[] sumOfDigitsInString(String[] names) {
		int[] sumArray = new int[names.length];
		for (int index = 0; index < names.length; index++) {
			int sum = 0;
			for (int innerIndex = 0; innerIndex < names[index].length(); innerIndex++) {
				char ch = names[index].charAt(innerIndex);
				if (Character.isDigit(ch))
					sum += Integer.parseInt(String.valueOf(ch));
			}
			sumArray[index] = sum;
		}
		return sumArray;
	}

	public static void main(String[] args) {
		int[] sumArray = new SumOfArrayString().sumOfDigitsInString(
				new String[] { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" });

		for (int index = 0; index < sumArray.length; index++) {
			System.out.print(sumArray[index] + " ");
		}
	}
}