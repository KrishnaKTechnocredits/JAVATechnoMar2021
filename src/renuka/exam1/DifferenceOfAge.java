package renuka.exam1;

public class DifferenceOfAge {
	
	 int getElderAge(int[] age) {
		int maxAge = age[0];
		for(int index=0; index<age.length; index++) {
			if(age[index]>maxAge) {
				maxAge=age[index];
			}
			
		}
		return  maxAge;
	}
	int getYoungerAge(int[] age) {
		int minAge = age[0];
		for(int index=0; index < age.length; index++) {
			if(age[index] < minAge) {
				minAge=age[index];
			}
	
		} 		return minAge;
		
	}

	public static void main(String[] args) {
		int[] age = {7,12,56,62,25};
		DifferenceOfAge diffAge = new DifferenceOfAge();
		int maxAge = diffAge.getElderAge(age);
		int minAge = diffAge.getYoungerAge(age);
		System.out.println("Difference between elder and younger is: "+(maxAge-minAge));
	}

}
