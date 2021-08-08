package gauravk.Assignment_5;

/*#5

Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". 
Print output in main method.

input : TeCHnoSessionS
output : Credits
*/

public class CompareUpperLowerCases {
	
	int countUpper = 0;
	int countLower = 0;
	static String result;
	
	String caseCount(String input) {
		char [] ch = new char[input.length()];
		for(int i = 0; i<ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=90)
				countUpper++;
			if(ch[i]>=96 && ch[i]<=122)
				countLower++;
		}
		if(countUpper>countLower) {
			System.out.println("Uppercase characters are more than lowercase characters.");
			return "Techno";
		}
		else {
			System.out.println("Lowercase characters are more than or equal to uppercase characters.");
			return "Credits";
		}
	}
	
	/*void dataCollect() {
		Scanner sc = new Scanner(System.in);
		String abc = sc.next();
		char [] sentence= new char [abc.length()];
		int length = sentence.length;
		for(int i=0; i<abc.length(); i++) {
			sentence[i] = abc.charAt(i);
		}
		result = caseCount(sentence, length);
	}
	*/
	public static void main(String[] a) {
		CompareUpperLowerCases compareUpperLowerCases1 = new CompareUpperLowerCases();
		result = compareUpperLowerCases1.caseCount("TeCHnoSessionS");
		System.out.println(result);
	}
}
