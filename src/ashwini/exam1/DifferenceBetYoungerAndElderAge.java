package ashwini.exam1;
/*
 Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55

 */

public class DifferenceBetYoungerAndElderAge {
	
	int elderAge(int [] array) {
		int elder=0; 
	      for(int index=0; index<array.length; index++ ) {
	         if(array[index]>elder) {
	            elder = array[index];
	         }
	      }
	      return elder; 
	     
	   }
	   int youngerAge(int [] array) {
		   int younger=0;
	       younger = array[0];
	     
	      for(int index=0; index<array.length; index++ ) {
	         if(array[index]<younger) {
	            younger = array[index];
	         }
	      }
	      return younger;
	      
	   }

	public static void main(String[] args) {
		int array[] = {7 ,12, 56, 62 ,25};
		DifferenceBetYoungerAndElderAge differenceBetYoungerAndElderAge = new DifferenceBetYoungerAndElderAge();
		System.out.println("elder person age in array is : "+differenceBetYoungerAndElderAge.elderAge(array));
		System.out.println("younger person age in array is : "+differenceBetYoungerAndElderAge.youngerAge(array));
		int diff = differenceBetYoungerAndElderAge.elderAge(array)-differenceBetYoungerAndElderAge.youngerAge(array);
		System.out.println(diff);

	}

}
