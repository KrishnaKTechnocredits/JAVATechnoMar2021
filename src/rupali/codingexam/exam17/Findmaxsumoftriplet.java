package rupali.codingexam.exam17;
import java.util.ArrayList;
import java.util.Arrays;

public class Findmaxsumoftriplet {
	
	ArrayList<Integer> getmaxtriplet(int[] input){
		ArrayList<Integer> numberlist=new ArrayList<Integer>();
		int max=0,sum=0;
		int length=input.length-(input.length%3)-2;
		
		for (int index=0;index<length;index+=3) {
			max=input[index]+input[index+1]+input[index+2];
			if(sum<max) {
			numberlist.clear();
			sum=max;
			numberlist.add(input[index]);
			numberlist.add(input[index+1]);
			numberlist.add(input[index+2]);
			}
		}
		return numberlist;
	}
	
	public static void main(String[] args) {
		int[] input= {1,10,2,3,1,11,4,2,1};
		System.out.println(Arrays.toString(input));
		System.out.println("output: "+new Findmaxsumoftriplet().getmaxtriplet(input));
		
	}
}
