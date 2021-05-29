package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(15);
		numberList.add(1); // 2
		numberList.add(99); //3
		numberList.add(2); // 4
		numberList.add(1); //5
		numberList.add(1);
		int count = 0;
		
		while(numberList.indexOf(1) != -1) {
			//numberList.remove(Integer.valueOf(1));
			//numberList.remove(numberList.indexOf(1));
			int index = numberList.indexOf(1); 
			numberList.set(index, 100);
			count++;
		}
		System.out.println(numberList);
		System.out.println(count);
		
	}
}
