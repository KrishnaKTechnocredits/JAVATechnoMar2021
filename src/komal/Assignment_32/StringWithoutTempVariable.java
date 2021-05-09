package komal.Assignment_32;

/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"


Hint : you can use subString method.*/
public class StringWithoutTempVariable {
	void swapString() {
		String name1 = "Techno";
		String name2 = "Credits";

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());
		System.out.println("String name1 :" + name1);
		System.out.println("String name2 :" + name2);

	}

	public static void main(String[] args) {
		StringWithoutTempVariable stringWithoutTempVariable = new StringWithoutTempVariable();
		stringWithoutTempVariable.swapString();
	}
}