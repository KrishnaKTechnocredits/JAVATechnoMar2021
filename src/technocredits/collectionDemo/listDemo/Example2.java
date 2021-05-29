package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example2 {

	ArrayList<String> filterName(ArrayList<String> nameList){
		ArrayList<String> output = new ArrayList<String>();
		
		for(int index = 0; index<nameList.size(); index++) {
			if(nameList.get(index).length() > 16)
				output.add(nameList.get(index));
		}
		return output;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aashvi");
		names.add("Technocredits");
		names.add("Shivani");
		names.add("Radha");
		names.add("Radha");
		
		System.out.println(names.get(5));
		
		Example2 example2 = new Example2();
		ArrayList<String> answer = example2.filterName(names);
		System.out.println(answer);
	}
}
