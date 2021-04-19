package pallavi.Assignment_19;

/*Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

public class Count {

	static int countU = 0;
	static int countL = 0;

	String countUpperLowercase() {
		if (countU > countL)
			return "Techno";
		else
			return "Credits";

	}

	public static void main(String[] args) {
		String name = "TeCHnoSessionS";

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				countU++;
			}

			else
				countL++;
		}
		System.out.println(new Count().countUpperLowercase());
	}

}
