package amrutaM.stringAssignments;

/*Program 1:
Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, 
otherwise return "Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits
*/
public class TechnoOrCredits {

	String upperLowerCount(String input) {
		int upperCount = 0, lowerCount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index)))
				upperCount++;
			else
				lowerCount++;
		}
		return (upperCount > lowerCount) ? "Techno" : "Credits";
	}

	public static void main(String[] args) {
		String input = "TeCHnoSessionS";
		TechnoOrCredits technoOrCredits = new TechnoOrCredits();
		String output = technoOrCredits.upperLowerCount(input);
		System.out.println(output);
	}
}
