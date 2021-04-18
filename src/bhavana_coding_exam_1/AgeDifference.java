package bhavana_coding_exam_1;
/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. 
Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55 */



public class AgeDifference {

	int[] age= {7,12,56,62,25};
	int difference;
	int outputIndex=0;
	
	void differenceOfAge() {
		for(int index=0;index<age.length;index++) {
			difference=age[3]-age[0];
		}
	}
	
	public static void main(String[] args) {
		AgeDifference ad=new AgeDifference();
		ad.differenceOfAge();
		System.out.println("Age difference is:"+ad.difference);
	}
}

