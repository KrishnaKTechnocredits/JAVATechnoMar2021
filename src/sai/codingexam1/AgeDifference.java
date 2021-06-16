package sai.codingexam1;

public class AgeDifference {

	int getDifference (int [] ages) {
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
		AgeDifference differenceInAge = new AgeDifference();
		int [] input = {7,12,56,62,25};
		System.out.println("Difference in age : "+differenceInAge.getDifference(input));
	}
}