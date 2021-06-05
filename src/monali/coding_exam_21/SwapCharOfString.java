package monali.coding_exam_21;

public class SwapCharOfString {

	static String getReverseString(String input) {
		String newinput = input.toLowerCase();
		String str2="th";
		String str3 = "ht";
		String B = "";
		if(input.contains(str2)) {
			 B= newinput.replaceAll(str2, str3);
			System.out.println(B);

		}
		return B;
	}
	public static void main(String[] args) {
		getReverseString("This is the thread that given");
	}
}

