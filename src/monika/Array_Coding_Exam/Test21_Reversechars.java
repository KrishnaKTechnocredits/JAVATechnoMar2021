package monika.Array_Coding_Exam;
/*String s1 = "This is the thread that given";
 * String s2 = "th";
 * Expected output: htis is hte htread htat given
 */
public class Test21_Reversechars {

	static String getReverse(String s1, String s2) {
		s1 = s1.toLowerCase();
		while(s1.contains(s2)) {
			s1 = s1.replaceAll(s2, "ht");
		}
		return s1;
	}
	
	public static void main(String[] args) {
		String s = getReverse("This is the thread that given","th");
		System.out.println(s);
	}
	
}
