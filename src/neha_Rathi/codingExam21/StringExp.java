package neha_Rathi.codingExam21;

public class StringExp {

	static String rearrangeString(String input) {
		if(input.contains("th")) 
			input=input.replace("th", "ht");
			if(input.contains("Th")) 
			input=input.replace("Th", "hT");
		return input;
	}

	public static void main(String[] args) {
		String str="This is the thread that given";
		System.out.println(rearrangeString(str));
	}
}
