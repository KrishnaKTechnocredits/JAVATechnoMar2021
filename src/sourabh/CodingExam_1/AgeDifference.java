/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
*/

package sourabh.CodingExam_1;

public class AgeDifference {
	void getAgeDifference(int[] age) {
		int maxAge=0, minAge=age[0], ageDifference=0;
		for(int index=0; index<age.length; index++) {
			if(age[index]>maxAge)
				maxAge=age[index];
		}
		for(int index=0; index<age.length; index++) {
			if(age[index]<minAge)
				minAge=age[index];
		}		
		ageDifference=maxAge-minAge;
		System.out.println("Diff: "+ageDifference);
	}
	public static void main(String[] args) {
		AgeDifference ageDifference= new AgeDifference();
		int[] age= {7, 12, 56, 62, 25};
		ageDifference.getAgeDifference(age);
	}

}
