package anubhav.arrayexamples;

/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.
	Sample Input: 7 12 56 62 25
	Sample Output: 55*/

public class DifferenceBetweenAge {
	
	void familyAge () {
		int arr[]= {20, 40, 60, 50, 80};
		int eldestMemberAge  = arr[0];
		int youngestMemberAge = arr[0];
		int length= arr.length;
		
		for (int index=0; index<length; index++){
			if (arr[index]> eldestMemberAge)
				eldestMemberAge=arr[index];
			else if (arr[index]<youngestMemberAge)
				youngestMemberAge=arr[index];
		}	
		System.out.println("Difference between eldest and youngest member of the family is : " + (eldestMemberAge-youngestMemberAge));
	}
	
	public static void main (String[] args) {
		DifferenceBetweenAge differenceBetweenAge= new DifferenceBetweenAge();
		differenceBetweenAge.familyAge();
	}
}
