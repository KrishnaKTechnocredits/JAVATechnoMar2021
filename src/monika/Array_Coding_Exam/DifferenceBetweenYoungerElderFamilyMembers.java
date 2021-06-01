package monika.Array_Coding_Exam;
/*-------------------------------------------------------------------
Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family.
 Age is provided in the form of an array.
Sample Input: 7 12 56 62 25
Sample Output: 55*/

public class DifferenceBetweenYoungerElderFamilyMembers {
	
	int getAgeDifference(int[] arr) {
		int max = arr[0], min = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max < arr[index])
				max = arr[index];
			if(min> arr[index])
				min = arr[index];
		}
		return (max-min);
		//System.out.println("Difference between Elder and younger is : "+(max-min));
	}
	
	public static void main(String[] args) {
		int[] arr = {7,12,56,62,25};
		DifferenceBetweenYoungerElderFamilyMembers obj = new DifferenceBetweenYoungerElderFamilyMembers();
		//obj.getAgeDifference(arr);
		System.out.println("Difference between Elder and younger is :"+obj.getAgeDifference(arr));

	}

}
