package amrutaM.stringAssignments;

/*Program 2: Write a method which returns the count of  uppercase letters in the 
 * String str  ="TEchnoCRediTS"
	o/p - 6 
	Hint: 
	1. Use loop 
	2. Ch = charAt(index) String 
	3. boolean Character.isUpperCase(ch)
*/
public class CountUppercase {

	int getUppercaseCount(String input) {
		int uppercaseCount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index)))
				uppercaseCount++;
		}
		return uppercaseCount;
	}

	public static void main(String[] args) {
		String str = "TEchnoCRediTS";
		CountUppercase countUppercase = new CountUppercase();
		int count = countUppercase.getUppercaseCount(str);
		System.out.println(count);
	}
}
