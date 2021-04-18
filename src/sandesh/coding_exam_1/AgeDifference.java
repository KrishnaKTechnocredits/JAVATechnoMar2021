package sandesh.coding_exam_1;

public class AgeDifference {
	
	int returnAgeDifference(int[] ageArray) {
		int minAge = ageArray[0];
		int maxAge = ageArray[0];
		for(int index=1; index < ageArray.length; index++) {
			if(minAge>ageArray[index])
				minAge = ageArray[index];
			if(maxAge<ageArray[index])
				maxAge = ageArray[index];		
		}
		return maxAge-minAge;
	}	
	
	public static void main(String[] args) {
		int[] givenAges = {7, 12, 56, 62, 25};
		System.out.println(new AgeDifference().returnAgeDifference(givenAges));
	}
}
