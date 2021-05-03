package pavan.PavanB_coding_exam_3;

public class DisplayWoVowels {

	String getString(String input) {
		String details;
		details = input.replaceAll("[aeiou]", "");
		return details;
	}

	public static void main(String[] args) {
		DisplayWoVowels d = new DisplayWoVowels();
		String output = d.getString("globant india test automation engineer");
		System.out.println(output);
	}
}
