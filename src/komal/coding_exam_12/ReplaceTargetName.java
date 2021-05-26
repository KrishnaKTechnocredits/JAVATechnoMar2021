package komal.coding_exam_12;

/*int countName(ArrayList<String> arr, String targetName) []
input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3  
*/
import java.util.ArrayList;

public class ReplaceTargetName {

	int count = 0;

	public ArrayList<String> getNames(ArrayList<String> nameList, String targetName) {
		for (int index = 0; index < nameList.size(); index++) {
			if (nameList.get(index).equals("Aashay")) {
				nameList.set(index, "Technocredits");
				count++;
			}
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

		ReplaceTargetName t3 = new ReplaceTargetName();
		System.out.println(t3.getNames(nameList, "Aashay"));
		System.out.println("Number of time Aashay occur in list : " + t3.count);
	}
}
