/*Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

package rahul_Hiremath.assignment_19;

public class Ass_19_1 {
	int uppercaseSum = 0;
	int lowercaseSum = 0;

	void getCount(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = (int) ch;

			if (count >= 65 && count <= 90)
				uppercaseSum = uppercaseSum + count;

			else if (count >= 97 && count <= 122)
				lowercaseSum = lowercaseSum + count;
		}
		System.out.println("Uppercase count: " + uppercaseSum);
		System.out.println("Lowercase count: " + lowercaseSum);
	}

	String display() {
		String str1 = "Techno";
		String str2 = "Credits";

		if (uppercaseSum > lowercaseSum)
			return str1;
		else
			return str2;
	}

	public static void main(String[] args) {
		Ass_19_1 ass_19_1 = new Ass_19_1();
		ass_19_1.getCount("TeCHnoSessionS");
		String ans = ass_19_1.display();
		System.out.println(ans);
	}
}
