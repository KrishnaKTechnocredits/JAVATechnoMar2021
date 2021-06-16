/*
 Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given

 */
package upasana.coding_exam_21;

public class ReplaceWithWordReverse {

	String getOutput(String str1) {
		while (str1.contains("th") || str1.contains("Th")) {
			str1 = str1.replace("th", "ht");
			str1 = str1.replace("Th", "hT");
		}
		return str1;
	}

	public static void main(String[] args) {
		String str1 = "This is the thread that given";
		String output = new ReplaceWithWordReverse().getOutput(str1);
		System.out.println(output);
	}

}
