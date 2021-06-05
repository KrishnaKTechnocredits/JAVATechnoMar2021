package mayur.coding_exam_21;
import java.util.ArrayList;
import java.util.Arrays;


public class Swapping {
	String getSwapping(String str) {
		String strOutput = "";
		String[] arr = str.split(" ");
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
		Swapping swap = new Swapping();
		System.out.println("Input :This is the thread that given");		
		System.out.println("Output:" + swap.getSwapping("This is the thread that given"));
	}

}
