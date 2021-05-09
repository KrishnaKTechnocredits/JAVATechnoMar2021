package monali.Assignment_32;

public class SwapStringWithVariable {

	void swapString() {
		String name1 = "Saurav";
		String name2 = "Vikas";
		String temp;
		temp = name1;
		name1 = name2;
		name2 = temp;
		System.out.println("String name1 :"+name1);
		System.out.println("String name2 :"+name2);

	}
	public static void main(String[] args) {
		SwapStringWithVariable name = new SwapStringWithVariable();
		name.swapString();
	}
}
