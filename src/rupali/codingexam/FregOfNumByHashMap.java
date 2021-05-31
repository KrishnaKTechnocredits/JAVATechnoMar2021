//coding exam 16
package rupali.codingexam;
import java.util.*;

public class FregOfNumByHashMap {
	
	HashMap<Integer, Integer> getfreqOfNum(int[] input){
		HashMap<Integer,Integer> setOfnum= new HashMap<Integer,Integer>();
		
		for(int index=0;index<input.length;index++){
			if(setOfnum.containsKey(input[index]))
				setOfnum.put(input[index], setOfnum.get(input[index])+1);
			else
				setOfnum.put(input[index], 1);
		}
		return setOfnum;
	}
	public static void main(String[] args) {
	int[] input= {1,2,1,1,3,3,4,5,5,2};
	 HashMap<Integer,Integer> numbermap=new FregOfNumByHashMap().getfreqOfNum(input);
	 System.out.println(numbermap);
	}
}
