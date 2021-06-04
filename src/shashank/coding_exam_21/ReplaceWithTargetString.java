package shashank.coding_exam_21;

public class ReplaceWithTargetString {

	private String getreplaceWithTargetString(String input, String targetString, String targetString1) {

		StringBuffer sb = new StringBuffer(targetString);
		sb.reverse();
		StringBuffer sb1 = new StringBuffer(targetString1);
		sb1.reverse();
		String output = input.replace(targetString, sb).replace(targetString1, sb1);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceWithTargetString replaceWithTargetString = new ReplaceWithTargetString();
		String str1 = "This is the thread that given";
		String str2 = "th";
		String str3 = str2.toUpperCase().substring(0, 1) + str2.substring(1);
		String output = replaceWithTargetString.getreplaceWithTargetString(str1, str2, str3);
		System.out.println(output);
	}

}
