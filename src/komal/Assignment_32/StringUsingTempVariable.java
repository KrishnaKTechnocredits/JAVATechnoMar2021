package komal.Assignment_32;

/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

Hint : you can use subString method.*/
public class StringUsingTempVariable {
	void swapString() {
		String name1 = "Komal";
		String name2 = "Vishal";
		String temp;
		temp = name1;
		name1 = name2;
		name2 = temp;
		System.out.println("String name1 :" + name1);
		System.out.println("String name2 :" + name2);

	}

	public static void main(String[] args) {
		StringUsingTempVariable stringUsingTempVariable = new StringUsingTempVariable();
		stringUsingTempVariable.swapString();
	}
}