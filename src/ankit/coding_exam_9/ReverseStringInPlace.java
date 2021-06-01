package ankit.coding_exam_9;

public class ReverseStringInPlace {

	static String reverseString(String input) {
		String rev = "";
		char[] chArr = input.toCharArray();
		char temp = ' ';
		for(int i = 0 , j = chArr.length-1 ; i<j ; i++, j--) {
			temp = chArr[i];
			chArr[i] = chArr[j];
			chArr[j] = temp;
		}
		for(int i = 0 ; i< chArr.length ; i++) {
			rev = rev + chArr[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		String input = "Techno";
		System.out.println("Reverse of String is : "+reverseString(input));
		
	}
}

