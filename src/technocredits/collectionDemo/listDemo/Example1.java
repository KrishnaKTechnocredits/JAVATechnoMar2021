package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Techno");
		nameList.add("Krishna");
		
		//System.out.println(nameList); [Aashvi, Techno]
		for(int index=0;index<nameList.size();index++) {	
			System.out.println(nameList.get(index));
		}
		
		/*Object[] arr = new Object[2];
		arr[0] = "Pihu";
		arr[1] = 1;
		
		System.out.println(Arrays.toString(arr));*/
	}
}
