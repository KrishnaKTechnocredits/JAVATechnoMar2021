package komal.coding_exam_1;
/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/

public class DiffBetweenYoungerAndanElderMember {

	int getYoungestMemberAge(int[] age) {
		int minAge = age[0];
		for(int i = 1; i <age.length;i++) {
			if(age[i] < minAge ) {
				minAge = age[i];
			}
		}return minAge;	
	}
	
		int getOldestMemberAge(int[] age) {
			int maxAge = age[0];
			for(int i = 1; i <age.length;i++) {
				if(age[i] > maxAge ) {
					maxAge = age[i];
				}
			} return  maxAge;
		}

		public static void main(String[] args) {
			int[] age = {7, 12, 56, 65, 25};
			DiffBetweenYoungerAndanElderMember diffBetweenYoungerAndanElderMember = new DiffBetweenYoungerAndanElderMember();
			int maxAge = diffBetweenYoungerAndanElderMember.getOldestMemberAge(age);
			int minAge = diffBetweenYoungerAndanElderMember.getYoungestMemberAge(age);
			System.out.println("Age difference between Youngest and Oldest Member :" +(maxAge - minAge));
		}
}
