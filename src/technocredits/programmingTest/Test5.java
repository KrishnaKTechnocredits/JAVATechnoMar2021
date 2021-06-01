package technocredits.programmingTest;

public class Test5 {

	String getRevWordString(String input) {
		StringBuffer sb1 = new StringBuffer(input);
		StringBuffer output = sb1.reverse();
		return output.toString();
	}

	String arrange(String input) {
		String output = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if(index == arr.length-1)
				output += getRevWordString(arr[index]);
			else
				output += getRevWordString(arr[index]) + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		Test5 reverseString = new Test5();
		String output = reverseString.arrange("hi hello how are you");
		System.out.println(output);
	}
}