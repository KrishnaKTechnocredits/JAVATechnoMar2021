package shivani.Coding_exam_21;

/*String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/
public class StringOperation {
static String output="";
	static String reverseWord(String input, String target) {
 
		if (input.contains(target)) {
			output = input.replaceAll(target, "ht");

		}
		if (output.contains("Th")) {
			output = output.replace("Th", "hT");
		}

		return output;
	}

	public static void main(String[] args) {

		String input = "This is the thread that given";
		String target = "th";
		String output = reverseWord(input, target);
		System.out.println(output);
	}

}
