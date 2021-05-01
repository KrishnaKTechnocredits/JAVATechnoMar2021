package shivani.Coding_Test_Array;

/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

public class Program2 {

	void OlderMemberAge(int[] age) {

		int elderMember = age[0];
		int olderMember = age[0];
		for (int i = 1; i < age.length; i++) {
			if (elderMember > age[i]) {
				elderMember = age[i];
			}
			if (olderMember < age[i]) {
				olderMember = age[i];
			}
		}

		int diff = olderMember - elderMember;
		System.out.println("Difference between  Older and elder member age is  " + diff);
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		int[] age = { 7, 12, 56, 62, 25 };

		program2.OlderMemberAge(age);

	}
}