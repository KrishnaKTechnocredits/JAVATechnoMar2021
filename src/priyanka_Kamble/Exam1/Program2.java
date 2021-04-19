package priyanka_Kamble.Exam1;

/*
 * Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

public class Program2 {
	int maxage , minage;
	
	void maxage(int[] input) {		 
			for (int index = 1 ; index < input.length ; index++) {
				for(int innerindex = 0; innerindex < input.length ; innerindex++) {
					if( input[innerindex] > input[index] ){
						maxage =  input[innerindex];
					}
				}
			}
			System.out.println("Max :" +maxage);
	}
	
	void minage(int[] input) {		 
			for (int index = 1 ; index < input.length ; index++) {
				int min= input[0];
					if(min < input[index]){
						minage =  min;
					}
			}
			System.out.println("Min :" +minage);
	}
	
	int getdifference() {
		int difference = maxage - minage;
		return difference;
	}
	
	public static void main(String[] args) {
		int[] input = {7,12,56,62,25};
		Program2 program2 = new Program2();
		program2.maxage(input);
		program2.minage(input);
		int Difference = program2.getdifference();
		System.out.println("Age Difference : "+Difference);
	}
	
}