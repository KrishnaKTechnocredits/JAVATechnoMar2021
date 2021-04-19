package monali.Assignment_19;

public class Program_1 {
	
	int upperCaseCount = 0;
	int lowerCaseCount = 0;

	String upperAndLowerCaseCount(String str) {
		for (int index = 0; index < str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				upperCaseCount++;
			else
				lowerCaseCount++;
		}
		if (upperCaseCount > lowerCaseCount) {
			System.out.println("Techno");
			return "Techno";
		} else
			System.out.println("credits");
		return "credits";

	}

	public static void main(String[] a) {
		Program_1 program = new Program_1();
		String str = "TeChNoCrEdItS";
		program.upperAndLowerCaseCount(str);
	}
}
