package ashish_Vyas.coding_exam_1;
/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.
Sample Input: 7 12 56 62 25
Sample Output: 55
*/
public class Program2 {

	public static void main (String[] a) {
		int[] age = {7,12,56,62,25};
		int[] Diff = outputResult(age);
        int diff =   Diff[1] - Diff[0] ;
             System.out.println("Difference is "+ diff);
	}
	static int[] outputResult (int[] age) {
		int younger = age[0];
        int elder = age[0];
     for(int index=0; index<age.length ; index++)
     {
      if(age[index]<younger)
    	  younger = age[index];
         
      if(age[index]>elder)
    	  elder = age[index]; 
        }
     return new int[] { younger, elder };
	}
	
}
