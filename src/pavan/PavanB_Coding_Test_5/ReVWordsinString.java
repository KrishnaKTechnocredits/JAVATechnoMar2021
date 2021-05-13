package pavan.PavanB_Coding_Test_5;

public class ReVWordsinString {
	String orgin = "hi hello how are you";

	void inputDetails() {
		String[] arr = orgin.split(" ");
		for (int j = 0; j < arr.length; j++) {
			getReverse(arr[j]);
			System.out.print(" ");
		}
	}
	void getReverse(String input) {
		for (int index = (input.length() - 1); index <= input.length(); index--) {
			char ch = input.charAt(index);
			System.out.print(ch);
			if (index == 0)
				break;
		}
	}
	public static void main(String[] args) {
		ReVWordsinString r = new ReVWordsinString();
		r.inputDetails();
	}
}
