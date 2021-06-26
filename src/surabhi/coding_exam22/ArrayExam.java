package surabhi.coding_exam22;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExam {
	
	int getSum(Integer arr[]) {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		int sum=0; boolean flag=false;
		for(int index=0;index<al.size();index++) {
			int num=al.get(index);
			if(num==6 || flag) {
					if(num==9) {
						flag=false;
						continue;
					}
					flag=true;
					continue;
			}
			else if(num!=6 && num!=9) {
				sum=sum+num;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		Integer arr[]= {2,1,6,9,11,6,19,12,9,2};
		int sum=new ArrayExam().getSum(arr);
		System.out.println("sum of numbers after excluding 6 and 9 :" +sum);
	}

}
