package ashish_Vyas.Assignment_25;

/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/
public class ReturnSum {

	int getSum(String name) {
		int sum = 0;
		for(int index=0; index<name.length();index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
			//	int num = ch - '0';
				sum = sum+num;
			}
	}
		return sum;
	}
	public static void main(String[] args) {
		ReturnSum returnSum = new ReturnSum();
		String [] names = {"Tech1No2Credits3","abc", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		for(int index=0; index<names.length;index++) {
		int output = returnSum.getSum(names[index]);
		//to skip the print which is equal to 0.
		if(output!=0)
		System.out.println(output);
		}
	}
}