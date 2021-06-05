package madhavi_Khasbage.Coding_Exam_21;
import java.util.ArrayList;
import java.util.Arrays;
/*String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/


public class SwapCharExample {
	String getSwapString(String my_str) {
		String strOutput = "";
		String[] arr = my_str.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		for (String currentString : arrList) {
			if (currentString.contains("th")) {
				currentString = currentString.replace("th", "ht");
			} else if (currentString.contains("Th")) {
				currentString = currentString.replace("Th", "hT");
			}
			strOutput += currentString + " ";
		}
		return strOutput;
	}

	public static void main(String[] args) {
		SwapCharExample objSwap = new SwapCharExample();
		System.out.println("Input :This is the thread that given");		
		System.out.println("Output:" + objSwap.getSwapString("This is the thread that given"));
	}

}
