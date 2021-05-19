package shivani.CodingExam_4;

public class FindPallindrome {
	void findPallindromeString(String word) {
		String[] arr = word.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (isPallindrome(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}

	boolean isPallindrome(String number) {

		StringBuffer sb1 = new StringBuffer(number);
		StringBuffer sb2 = new StringBuffer(number);
		sb2.reverse();

		if (sb1.toString().equals(sb2.toString())) {
			
			return true;
		} else
		
		return false;
	}

	public static void main(String[] args) {
		FindPallindrome findPallindrome = new FindPallindrome();
		findPallindrome.findPallindromeString("Hi MAM hello NamaN techno");
	

	}
}
