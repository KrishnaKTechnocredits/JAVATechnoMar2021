package bhavana_coding_exam_1;
/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. 
Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55 */



public class AgeDifference {

	void differenceOfAge(int[] num) {
		
		int min=num[0];
		int max=num[0];
		for(int index=1;index<num.length;index++) {
			if(max>num[index])
				max=num[index];
			if(min<num[index])
				min=num[index];
		}
		System.out.println("The age difference is:"+(min-max));
	}
	
	public static void main(String[] args) {
		int [] num= {7,12,56,62,25};
		AgeDifference ad=new AgeDifference();
		ad.differenceOfAge(num);
		
	}
}

