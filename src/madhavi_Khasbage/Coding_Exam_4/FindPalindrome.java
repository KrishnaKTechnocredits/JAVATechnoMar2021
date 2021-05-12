package madhavi_Khasbage.Coding_Exam_4;

/*
String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

public class FindPalindrome {
	String getString(String my_str) {
		int length = my_str.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + my_str.charAt(i);
		}
		if (!my_str.equals(reverse)) {
			my_str = "";
		}
		return my_str;
	}

	String getOutPut(String input) {
		String strData = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			strData += getString(arr[index]) + " ";
		}
		return strData;
	}

	public static void main(String[] args) {
		FindPalindrome findPelendrom1 = new FindPalindrome();
		System.out.println(findPelendrom1.getOutPut("KOK Hi MAM hello NamaN techno LoLoL"));
	}
}
