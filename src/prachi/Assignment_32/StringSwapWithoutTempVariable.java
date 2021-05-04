package prachi.Assignment_32;

public class StringSwapWithoutTempVariable {
	static void stringSwapWithoutTemp() {
		String input1 = "Techno";
		String input2 = "Credits";
		
		input1 = input1 + input2;  //TechnoCredits
		input2 = input1.substring(0, input1.length() - input2.length());  //input2=Techno
        input1 = input1.substring(input2.length());  //input1=Credits
        
		System.out.println("Swapped input1 String using substring is: "+input1);
		System.out.println("Swapped input2 String using substring is: "+input2);
	}

	public static void main(String[] args) {
		stringSwapWithoutTemp();
	}
}
