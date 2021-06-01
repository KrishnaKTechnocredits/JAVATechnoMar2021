package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(15);
		numberList.add(1);
		numberList.add(99);
		numberList.add(2);
		
		/*numberList.remove(1);
		System.out.println(numberList);
		*/
		numberList.remove(Integer.valueOf(1));
		System.out.println(numberList);
	}
}
