package krishna.Assignment_32;

public class SwapStringUsingVar {

	void swapUsingTemp(String firstStr, String secondStr) {
		System.out.println("Given String :" + firstStr + " " + secondStr);
		String tempStr = firstStr;
		firstStr = secondStr;
		secondStr = tempStr;
		System.out.println("New String after :" + firstStr + " " + secondStr);
	}

	public static void main(String[] args) {
		SwapStringUsingVar swapStringUsingVar = new SwapStringUsingVar();
		swapStringUsingVar.swapUsingTemp("Techno", "Credit");
	}
}
