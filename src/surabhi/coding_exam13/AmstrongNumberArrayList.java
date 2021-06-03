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
		String tempStr=String.valueOf(temp);
		int power=tempStr.length();
		int sum=0, r=0;
		while(temp!=0) {
			r=temp%10;
			sum=sum+(int)Math.pow(r, power);
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
		int [] arr= {1634, 153,279,371,303,407};
		ArrayList output=amstrongNumberArrayList.getArmStrongNumber(arr);
		System.out.println(output);
	}

}
