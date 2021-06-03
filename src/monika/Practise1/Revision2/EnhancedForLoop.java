package monika.Practise1.Revision2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {
	
	static void enhancedForLoop() {
		int[] arr = {10,13,14,13};
		for(int a : arr) {
			if(a>13)
				System.out.println(a);
		}
		
		Integer[] arrInteger =  {10,13,14,13};
		List<Integer> list1 = Arrays.asList(arrInteger);
		ArrayList<Integer> arrList = new ArrayList<Integer>(list1);
		
		for(int i :arrList) {
			System.out.println("------"+i);
		}
		
	
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enhancedForLoop();
	}

}
