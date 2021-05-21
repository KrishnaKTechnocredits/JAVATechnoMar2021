package krishna.Assignment_32;

public class SwapStringWithoutVariable {

	void swapWithoutUsingTemp() {
		String name1 = "Techno";
		String name2 = "Credits";
		System.out.println("Given string before swap :" + name1 + " " + name2);
		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());
		System.out.println("String after swap :" + name1 + " " + name2);

	}

	public static void main(String[] args) {
		SwapStringWithoutVariable swapStringWithoutVariable = new SwapStringWithoutVariable();
		swapStringWithoutVariable.swapWithoutUsingTemp();
	}
}
