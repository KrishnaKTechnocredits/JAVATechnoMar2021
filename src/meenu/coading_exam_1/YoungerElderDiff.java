package meenu.coading_exam_1;

/*Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
*/

public class YoungerElderDiff {
	
	int difference(int[] age) {
		int ageDifference = 0;
		int youngerAge = age[0];
		int elderAge = age[0];
		for(int index = 1;index < age.length;index++) {
				if(youngerAge > age[index])
					youngerAge = age[index];
	    	    if(elderAge < age[index])
	    	    	elderAge = age[index];
	    }
		ageDifference = elderAge - youngerAge;
		return ageDifference;
	}

	public static void main(String[] args) {
		int[] age = {7, 12, 56, 62, 25};
		YoungerElderDiff youngerElderDiff = new YoungerElderDiff();
		System.out.println("elder and younger Age difference is: "+youngerElderDiff.difference(age));
	}
}
