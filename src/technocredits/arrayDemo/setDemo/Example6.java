package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example6 {

	public static void main(String[] args) {
		String[] arr = {"Maulik","Vaibhav", "Meenu", "Paras", "Maulik"};
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(arr));
		
		int count = 0;
		while(listOfNames.remove("Maulik")) {
			count++;
		}
		System.out.println(count);
	}
}
