package ashtha.Exam;

public class DifferenceInAge {
	
	int getDifferenceInAge (int [] ages) {
		int minAge = ages[0];
		int maxAge = ages[0];
		int difference = 0;
		for (int index=1; index<ages.length;index++) {
			if(ages[index]<minAge)
				minAge = ages[index];
			else if(ages[index]>maxAge)
				maxAge = ages[index];
		}
		difference = maxAge-minAge;
		return difference;
	}
	
	public static void main(String[] args) {
		DifferenceInAge differenceInAge = new DifferenceInAge();
		int [] inputAges = {7,12,56,62,25};
		System.out.println("Difference in age : "+differenceInAge.getDifferenceInAge(inputAges));
	}
}
