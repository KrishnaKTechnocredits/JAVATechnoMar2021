/*   10th April 21 --- Assignment 17 ---- Program No 5 :
 *  return true if you find a target number from given array else return false.

input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.
*/

package amruta.Array_Assignment_17;


/* public class Findtargetnum {
	
	
	boolean isNumpresent(int[] arr,int targetnum) {
		for(int index = 0; index < arr.length ; index++){
			
			if(targetnum == arr[index]) 
				return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int [] arrnum = {11,13,52,12,88,87,18,45,22,1};
		int num = 11;
		Findtargetnum trnum = new Findtargetnum();
		
		boolean value = trnum.isNumpresent(arrnum, num);	
		
		if(value == true)
			System.out.println("Target Number "+num+" is present in array.");
		else
			System.out.println(" Target Number "+num+" is not present in array.");
	}

} */


// ----- Using Scanner Class -------------
import java.util.Scanner;

public class Findtargetnum {
	
	
	boolean isNumpresent(int[] arr,int numtofind) {
		for(int index = 0; index < arr.length ; index++){
			
			if(numtofind == arr[index]) 
				return true;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int [] arrnum = {11,13,52,12,88,87,18,45,22,1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target Number : ");
		int targetnum = sc.nextInt();		
		
		Findtargetnum getnum = new Findtargetnum();
	
		boolean valuereturns = getnum.isNumpresent(arrnum, targetnum);	
		
		if(valuereturns == true)
			System.out.println("Target Number "+targetnum+" is present in array.");
		else
			System.out.println("Target Number "+targetnum+" is not present in array.");
	}
}