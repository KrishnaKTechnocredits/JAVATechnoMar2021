package amrutaM.arrayAssignments.AugArrayAssignments;

/*Find the difference between youngest and oldest family member. 
Age is in the form of array. 
int[] age = {10,34,38,68,72,95,6}; 
output : 89
*/
public class Assignment21_ageDifference {

	void getAgeDifference(int[] age) {
		int minAge = 0;
		int maxAge = 0;

		for (int index = 0; index < age.length; index++) {
			if (maxAge < age[index]) {
				maxAge = age[index];
			} else if (minAge < age[index]) {
				minAge = age[index];
			}
		}
		System.out.println("Difference between youngest and oldest family member is :" + (maxAge - minAge));
	}

	public static void main(String[] args) {
		int[] age = { 10, 34, 38, 68, 72, 95, 6 };
		new Assignment21_ageDifference().getAgeDifference(age);
	}
}
