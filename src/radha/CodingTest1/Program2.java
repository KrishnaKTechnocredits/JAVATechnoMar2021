/*
 -------------------------------------------------------------------
Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package radha.CodingTest1;

public class Program2 {
	
	int getMaxAge(int[] num) {
		int maxAge = num[0];
		for(int index=1; index < num.length;index++) {
			if(maxAge < num[index]) 
				maxAge=num[index];
		}
		return maxAge;
	}
	
	int getMinAge(int[] num) {
		int minAge = num[0];
		for(int index=1; index < num.length;index++) {
			if(minAge > num[index]) 
				minAge=num[index];
		}
		return minAge;
	}
	
	int getAgeDifference(int minAge, int maxAge) {
		return maxAge-minAge;
	}
	
	public static void main(String[] args) {
		Program2 program2 = new Program2();
		int[] age = {7,12,56,62,25};
		int maximumAge = program2.getMaxAge(age);
		int minimumAge = program2.getMinAge(age);
		int ageDiff = program2.getAgeDifference(minimumAge, maximumAge);
		System.out.println("Age difference between eldest and youngest member of a family is "+ageDiff);
	}
}
/*
Output:
Age difference between eldest and youngest member of a family is 55
 */
