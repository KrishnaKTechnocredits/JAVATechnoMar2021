package pallavi.Assignment_32;

public class SwapStringUsingTwoVaraible {

	void swapString() {
		String input1 = "Techno";
		String input2 = "Credits";

		System.out.println("After Swaping input1 : " + input1 + "  &  input2  " + input2);

		input1 = input1 + input2;
		input2 = input1.substring(0, input1.length() - input2.length());
		input1 = input1.substring(input2.length());

		System.out.println("After Swaping input1 : " + input1 + "  &  input2  " + input2);
	}

	public static void main(String[] args) {
		new SwapStringUsingTwoVaraible().swapString();

	}

}
