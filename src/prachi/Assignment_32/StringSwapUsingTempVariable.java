package prachi.Assignment_32;

public class StringSwapUsingTempVariable {
	
	static void stringSwap() {
		String input1 = "Techno";
		String input2 = "Credits";
		String temp = "";
		
		temp=input1;
		input1=input2;
		input2=temp;
		
		System.out.println("Swapped input1 String is: "+input1);
		System.out.println("Swapped input2 String is: "+input2);
	}

	public static void main(String[] args) {
		stringSwap();
	}
}
