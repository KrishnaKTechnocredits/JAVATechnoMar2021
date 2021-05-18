package mayur.assignment32;

public class StringSwapWithTemp {
	void swapString() {
		String str1 = "Techno";
		String str2 = "Credits";
		String temp = "";
		
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("String in str1 after swapping is: " +str1);
		System.out.println("string in str2 after swapping is: " +str2);
	}
	
	public static void main(String[] args) {
		StringSwapWithTemp swap = new StringSwapWithTemp();
		swap.swapString();
	}
}
