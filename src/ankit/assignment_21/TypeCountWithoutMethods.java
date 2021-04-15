//Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string without using character class methods

package ankit.assignment_21;

public class TypeCountWithoutMethods {
	int size, upperCount, lowerCount, isDigitCount ;

	void findType(String str) {
		size = str.length();
		for(int index = 0; index < size; index++) {
			int asciiValue = str.charAt(index);
			//System.out.println(asciiValue);
			if (asciiValue >=48 && asciiValue <=57) {
				System.out.println(str.charAt(index)+ " is a Digit");
				isDigitCount++;
			}
			else if(asciiValue >=65 && asciiValue <=90){
				System.out.println(str.charAt(index)+ " is a Alphabet in Upper Case");
				upperCount++;
			}
			else if(asciiValue >=97 && asciiValue <=122){
				System.out.println(str.charAt(index)+ " is a Alphabet in Lower Case");
				lowerCount++;
			}
			else {
				System.out.println(str.charAt(index)+ " is a Special Character");
			}
		}
	}
	void diaplayCount() {
		System.out.println("Upper Character Count "+upperCount);
		System.out.println("Lower Character Count "+lowerCount);
		System.out.println("Digits Count "+isDigitCount);
		System.out.println("Special Character Count "+(size -(upperCount+lowerCount+isDigitCount)));
	}

	public static void main(String[] args) {
		TypeCountWithoutMethods typeCountWithoutMethods = new TypeCountWithoutMethods();
		String str = "AAA88bbb^&^%$";
		int size = str.length();
		System.out.println("String is :"+ str);
		System.out.println("-------------------");
		typeCountWithoutMethods.findType(str);
		System.out.println("-----------------------------");
		typeCountWithoutMethods.diaplayCount();
	}
}