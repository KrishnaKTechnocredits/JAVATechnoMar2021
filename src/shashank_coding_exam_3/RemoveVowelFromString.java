package shashank_coding_exam_3;

public class RemoveVowelFromString {

	String removeVowel(String str1) {
		String str2 = str1.replaceAll("[aeiouAEIOU]", "");
		return str2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveVowelFromString removeVowelFromString = new RemoveVowelFromString();
		String str = "globant india test automation engineer";
		String string = removeVowelFromString.removeVowel(str);
		System.out.println("String without vowels is as below:-\n" + string);
	}

}
