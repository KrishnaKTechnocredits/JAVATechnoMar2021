/*Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given*/

package simmi.exam21;

public class ReplaceWords {
	static String replace(String input) {
		String output = " ";
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].contains("th")) {
				arr[index] = arr[index].replace("th", "ht");
			} else if (arr[index].contains("Th")) {
				arr[index] = arr[index].replace("Th", "hT");
			}
			output = output + arr[index] + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "This is the thread that given";
		String output = replace(input);
		System.out.println(output);
	}
}
