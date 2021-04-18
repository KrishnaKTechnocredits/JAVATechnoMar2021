/*
 * Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */


package amruta.Coding_Exam_1;

public class Program_2 {
	int maxage , minage;
	
	void maxage(int[] num) {		 
			for (int index = 1 ; index < num.length ; index++) {
				for(int innerindex = 0; innerindex < num.length ; innerindex++) {
					if( num[innerindex] > num[index] ){
						maxage =  num[innerindex];
					}
				}
			}
			System.out.println("Elder Member of Family :" +maxage);
	}
	
	void minage(int[] num) {		 
			for (int index = 1 ; index < num.length ; index++) {
				int min= num[0];
					if(min < num[index]){
						minage =  min;
					}
			}
			System.out.println("Younger Member of Family :" +minage);
	}
	
	int getdifference() {
		int difference = maxage - minage;
		return difference;
	}
	
	public static void main(String[] args) {
		int[] arr = {7,12,56,62,25};
		Program_2 prgm = new Program_2();
		prgm.maxage(arr);
		prgm.minage(arr);
		int agediff = prgm.getdifference();
		System.out.println("Age Difference between Younger and an elder member of the family : "+agediff);
	}
	
}
