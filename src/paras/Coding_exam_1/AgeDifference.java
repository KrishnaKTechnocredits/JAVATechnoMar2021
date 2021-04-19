/*
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55

*/

package paras.Coding_exam_1;

public class AgeDifference {

		int elderMember(int[] age) {
			int maxage = age[0];
			for(int index = 0; index < age.length ; index++) {
				if(age[index] > maxage) {
					maxage = age[index];
				}
			}return maxage;
		}
		
		int youngerMember(int[] age) {
			int minage = age[0];
			for(int index = 0; index < age.length ; index++) {
				if(age[index] < minage) {
					minage = age[index];
				}
			}return minage;
		}
		
		public static void main(String[] args) {
			int[] ageArray = {7,12,56,62,25};
			AgeDifference ageDifference = new AgeDifference();
			int MaximumAge = ageDifference.elderMember(ageArray);
			int mimiumAge = ageDifference.youngerMember(ageArray);
			System.out.println("Difference Between a Younger and an elder member of the family is: " + (MaximumAge - mimiumAge));
			
		}
}
