/*
 * Program 2 :
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

package purva.CodingExam1_18_04;

public class DiffbetweenElderYoungerAge {
	
	int diffAge(int[] age){
		int elderAge = age[0];
		int youngerAge = age[0];
		
		for (int index =1;index<age.length;index++) {
			if(elderAge<age[index]) 
				elderAge = age[index];	
		}
		
		for (int index=1;index<age.length;index++) {
			if(youngerAge>age[index])
				youngerAge=age[index];
		}
		
		int ageDiff = elderAge-youngerAge;
		System.out.println(ageDiff);
		return ageDiff;
		
	}
	
	public static void main(String [] args) {
		
		int [] age = {7,12,56,62,25};
		new DiffbetweenElderYoungerAge().diffAge(age);
	}

}
