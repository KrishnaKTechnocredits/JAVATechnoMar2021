package surabhi.coding_exam13;

import java.util.ArrayList;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}*/

public class AmstrongNumberArrayList {
	static boolean isAmstrong(int num) {
		int temp=num;
		int r=0, sum=0;
		while(temp!=0) {
			r=temp%10;
			sum=sum+(int)Math.pow(r, 3);
			temp=temp/10;
		}
		if(num==sum) {
			return true;
		}else
			return false;
	}
	
	public ArrayList<Integer> getArmStrongNumber(int number[]){
		ArrayList<Integer> output=new ArrayList<Integer>();
		boolean isAmstrong=false;
		for(int index:number) {
			isAmstrong=isAmstrong(index);
			if(isAmstrong) {
				output.add(index);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmstrongNumberArrayList amstrongNumberArrayList=new AmstrongNumberArrayList(); 
		int [] arr= {153,279,371,303,407};
		ArrayList output=amstrongNumberArrayList.getArmStrongNumber(arr);
		System.out.println(output);
	}

}
