package monali.Assignment_32;

public class SwapStringWithoutVariable {

	void swapString() {
		String name1 = "Monali";
		String name2 = "Jyoti";

		name1 = name1 + name2;
		name2 = name1.substring(0, name1.length() - name2.length());
		name1 = name1.substring(name2.length());
		System.out.println("String name1 :" + name1);
		System.out.println("String name2 :" + name2);

	}

	public static void main(String[] args) {
		SwapStringWithoutVariable name = new SwapStringWithoutVariable();
		name.swapString();
	}
}
