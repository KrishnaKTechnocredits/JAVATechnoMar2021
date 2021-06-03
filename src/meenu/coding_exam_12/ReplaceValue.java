package meenu.coding_exam_12;

import java.util.ArrayList;

/*int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits

Replace targetName with Technocredits

output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 

output : 3  
*/

public class ReplaceValue {
	int count = 0;
	
	public ArrayList<String> getNames(ArrayList<String> nameList,String targetName){
		while(nameList.contains("Aashay")) {
			int index = nameList.indexOf("Aashay");
			nameList.set(index, "Technocredits");
			count++;				
		}
		return nameList;
	}
	
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Vaibhav");
		nameList.add("Aashay");
		nameList.add("Prashant");
		nameList.add("Aashay");
		nameList.add("Aashay");
		nameList.add("Anubhav");
		
		ReplaceValue t3 = new ReplaceValue();
		System.out.println(t3.getNames(nameList,"Aashay"));
		System.out.println("Number of time Aashay occur in list : "+t3.count);
	}
}





