package mayur.assignment32;

public class SwapStringWithoutTemp {
	void swapString() {
		String str1 = "Techno";
		String str2 = "Credits";
	
		str1 = str1 + str2;
		str2 = str1.substring(0,str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("String in str1 after swapping is: " +str1);
		System.out.println("string in str2 after swapping is: " +str2);
	}
	
	public static void main(String[] args) {
		StringSwapWithTemp swap = new StringSwapWithTemp();
		swap.swapString();
	}
}
