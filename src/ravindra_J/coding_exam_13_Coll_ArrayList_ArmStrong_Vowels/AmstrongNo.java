/*Coding test 13:
 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]
 */
package ravindra_J.coding_exam_13_Coll_ArrayList_ArmStrong_Vowels;

import java.util.ArrayList;

public class AmstrongNo {

	public ArrayList<Integer> getArmStrongNumber(ArrayList<Integer> numberset) {
		ArrayList<Integer> output=new ArrayList<Integer>();
		int total=0 ,temp;  

		for(int i=0;i<numberset.size();i++) {
			int number=numberset.get(i);
			int num=numberset.get(i);
			while(num!=0) {
				temp=num%10;
				total=total+(temp*temp*temp);
				num=num/10;
			}
			if(total==number) {
				output.add(numberset.get(i));
			}
			total=0;
		}
		
		return output;		
	}

	public static void main(String[] args) {
		ArrayList<Integer> numberset= new ArrayList<Integer>();
		numberset.add(153);
		numberset.add(279);
		numberset.add(371);
		numberset.add(303);
		numberset.add(407);

		System.out.println("Input : "+numberset);
		AmstrongNo amstrong=new AmstrongNo();
		ArrayList<Integer> answer=amstrong.getArmStrongNumber(numberset);
		System.out.println("Output : "+answer);

	}


}
