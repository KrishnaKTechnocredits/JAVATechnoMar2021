/*Coding exam14
 * 2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic

 */
package rupali.codingexam;
import java.util.*;
public class UniqueNumber {
	public ArrayList<Integer> getUniqueNumber(int[] number){
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0;index<number.length;index++){
			int flag=0;
			for(int innerindex=0;innerindex<index;innerindex++){
				if(number[index]==number[innerindex]){
					flag=1;
					break;
				}
			}
			if(flag==0)
				output.add(number[index]);
		}
		return output;
	} 
	public static void main(String[] args){
		UniqueNumber uniquenumber=new UniqueNumber();
		int[] input={1,8,6,3,4,5,2,3,6,9,8,4};
		System.out.println("Input array is: "+Arrays.toString(input));
		ArrayList<Integer> output=uniquenumber.getUniqueNumber(input);
		System.out.println("Output: Unique numbers are: "+output);
	}
}
