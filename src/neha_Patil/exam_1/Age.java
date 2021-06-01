//8WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

//Sample Input: 7 12 56 62 25

//Sample Output: 55
package neha_Patil.exam_1;

public class Age {
	  int getAgeDiff(int[] arr) {
		   int max = arr[0];
		   int min = arr[0];
				for(int index=1;index<arr.length;index++) {
					if(max < arr[index])
						max = arr[index];
					if(min> arr[index])
						min = arr[index];
				}
				return (max-min);
	  }
public static void main(String[] args) {
	int [] arrAge = {7,12,56,62,25};
	Age age =new Age();
	age.getAgeDiff(arrAge);
	System.out.println("Difference between Elder and younger is :"+age.getAgeDiff(arrAge));
}
}
