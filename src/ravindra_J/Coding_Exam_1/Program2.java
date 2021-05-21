/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package ravindra_J.Coding_Exam_1;

public class Program2 {

	static int getyoungest(int [] num2) {
		int youngest = num2[0];
		for(int index=1;index<num2.length;index++) {
			if(num2[index]<youngest)
				youngest=num2[index];
		}
		return youngest;
	}

	static int geteldest(int[] num1) {
		int eldest = num1[0];
		for(int index=1;index<num1.length;index++) {
			if(num1[index]>eldest)
				eldest=num1[index];
		}
		return eldest;
	}

	static void getAgeDifference(int arr1[]){
		int elder = geteldest(arr1);
		int smaller = getyoungest(arr1);
		int Diff = elder-smaller;		
		System.out.println(Diff);
	}

	public static void main(String[] args) {

		int[] arr = {7,12,56,62,25};

		getAgeDifference(arr);


	}
}