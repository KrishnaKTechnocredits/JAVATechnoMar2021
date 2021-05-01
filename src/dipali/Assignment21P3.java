package dipali;

public class Assignment21P3 {
	public void printAllUpperCaseCharValuesToAsciiValue() {
		for(char i='A'; i<='Z' ; i++) {
			int ch =(int) i;
			System.out.println("Ascii value ["+ch+"] for character ["+i+"]");
		}
	}
	
	public void printAllLowerCaseCharValuesToAsciiValue() {
		for(char i='a'; i<='z' ; i++) {
			int ch =(int) i;
			System.out.println("Ascii value ["+ch+"] for character ["+i+"]");
		}
	}
	public static void main(String[] args) {
		Assignment21P3 assignment21p3=new Assignment21P3();
		assignment21p3.printAllUpperCaseCharValuesToAsciiValue();
		System.out.println(".....................................................");
		System.out.println(".....................................................");
		assignment21p3.printAllLowerCaseCharValuesToAsciiValue();

	}

}
