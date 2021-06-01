package rupali.codingexam.exam17;

import java.util.ArrayList;
import java.util.Arrays;

public class Maxsumtripletwithoutoverlapping {
	int sum=0;
	
	ArrayList<Integer> getmaxtriplet(int[] input){
		
		ArrayList<Integer> numberlist=new ArrayList<Integer>();
		int max;
		int count=3,count1=0;
		for (int index=0;index<input.length;index=index+count) {
			max=0;
			if((input.length-index)<3) {
				count=input.length-index;
				count1=0;
			}
			for(int i=0;i<count;i++) {
				max=max+input[index+i];
				count1++;
			}
			if(sum<max) {
			numberlist.clear();
			sum=max;
				for(int j=0;j<count1;j++) {
					numberlist.add(input[index+j]);
				}
			}
		}
		return numberlist;
	}
	
	public static void main(String[] args) {
		Maxsumtripletwithoutoverlapping maxsumtripletwithoutoverlapping=new Maxsumtripletwithoutoverlapping();
		int[] input= {1,10,2,3,1,11,4,2,1,33,2};
		System.out.println(Arrays.toString(input));
		System.out.println("output: "+maxsumtripletwithoutoverlapping.getmaxtriplet(input)+" "+maxsumtripletwithoutoverlapping.sum);
		
	}
	
}
