package dipali;

public class Assignment18P3 {
	
	public void printAllUpperCaseCharValuesToAsciiValue() {
		for(int cnt=65; cnt<=90 ; cnt++) {
			char ch =(char) cnt;
			System.out.println("Ascii value ["+cnt+"] for character ["+ch+"]");
		}
	}
	
	public void printAllLowerCaseCharValuesToAsciiValue() {
		for(int cnt=97; cnt<=122 ; cnt++) {
			char ch =(char) cnt;
			System.out.println("Ascii value ["+cnt+"] for character ["+ch+"]");
		}
	}

	public static void main(String[] args) {
		Assignment18P3 assignment18p3=new Assignment18P3();
		assignment18p3.printAllUpperCaseCharValuesToAsciiValue();
		System.out.println(".........................................................");
		assignment18p3.printAllLowerCaseCharValuesToAsciiValue();
	}
}
