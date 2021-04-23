package neha_Rathi.assignment19;

public class CharacterCase {

	String caseDiff(String input) {
		int cnt = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				cnt++;
		}
		if (cnt > (input.length() - cnt))
			return "techno";
		else
			return "Credits";
	}

	public static void main(String[] args) {
		CharacterCase characterCase = new CharacterCase();
		String input = "TeCHnoSessionS";
		characterCase.caseDiff(input);
		System.out.println(characterCase.caseDiff(input));
	}
}
