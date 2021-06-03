package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example7 {

	public static void main(String[] args) {
		ArrayList<Character> charList = new ArrayList<Character>();
		
		charList.add('a');
		charList.add('c');
		charList.add('a');
		charList.add('z');
		charList.add('d');
		charList.add('p');
		charList.add('1');
		charList.add('*');
		
		System.out.println(charList.indexOf('&'));
	}
}
