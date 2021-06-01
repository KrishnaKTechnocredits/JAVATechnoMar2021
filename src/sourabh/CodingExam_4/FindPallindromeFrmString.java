package sourabh.CodingExam_4;

public class FindPallindromeFrmString {
	boolean getPallindrome(String strInput) {
		StringBuffer sb1= new StringBuffer(strInput);
		StringBuffer sb2= new StringBuffer(strInput);
		sb2.reverse();
		if(sb1.toString().equals(sb2.toString()))
			return true;
		else
			return false;
	}
		void getPallindromeAll(String strInput) {
		String[] strArr= strInput.split(" ");
		for(int index=0; index<strArr.length; index++) {
		if(getPallindrome(strArr[index]))
				System.out.println(strArr[index]);
		}
	}
	public static void main(String[] args) {
		FindPallindromeFrmString findPallindrome= new FindPallindromeFrmString();
		//findPallindrome.getPallindrome("an45na");
		findPallindrome.getPallindromeAll("Hi MAM hello NamaN techno");
	}
}
