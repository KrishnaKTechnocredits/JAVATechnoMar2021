package gauravk.Assignment_21;

/*
1) Count Digits, Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 21: 14th April'2021
Assignment 20 (both program) without using Character class method.
Note:
Complete Assignment 18th and 19th by today EOD.
Submit Assignment 20 and 21 by tomorrow EOD.
==========================================================
 */
public class CountDifferentContentTypes {
	int digitCount = 0;
	int letterCount = 0;
	int upperCaseCount = 0;
	int lowerCaseCount = 0;
	int specialCount = 0;

	void countContent(String arg) {
		char[] ch = new char[arg.length()];
		for(int i=0; i<arg.length(); i++) {
			ch[i]=arg.charAt(i);
		}
		System.out.println(ch);

		for(int i=0; i<arg.length(); i++) {
			if((int)ch[i]>=48 && (int)ch[i]<=57) {
				digitCount++;
			}else if((int)ch[i]>=65 && (int)ch[i]<=90) {
				letterCount++;
				upperCaseCount++;
			}else if((int)ch[i]>=97 && (int)ch[i]<=122){
				letterCount++;
				lowerCaseCount++;
			}else specialCount++;
		}
		displayContentsTypesCounts();
	}

	void displayContentsTypesCounts() {
		System.out.println("Total digits : "+digitCount);
		System.out.println("Total letters : "+letterCount);
		System.out.println("Total uppercase characters : "+upperCaseCount);
		System.out.println("Total lowercase characters : "+lowerCaseCount);
		System.out.println("Total special characters : "+specialCount);
	}
	
	public static void main(String[] a) {
		CountDifferentContentTypes countDifferentContentTypes1 = new CountDifferentContentTypes();
		countDifferentContentTypes1.countContent("1rRpd3F9#K(E");
	}

}