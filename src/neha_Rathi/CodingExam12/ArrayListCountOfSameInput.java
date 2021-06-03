/*int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3*/
package neha_Rathi.CodingExam12;
import java.util.ArrayList;

public class ArrayListCountOfSameInput {
	
	static int countOfSameInput(ArrayList<String> input,String targetName) {
		int index=0;
		int count=0;
		while(input.contains(targetName)) {
			index=input.indexOf(targetName);
			input.set(index, "Technocredits");
			count++;
		}
		System.out.println(input);
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Vaibhav");
		nameList.add("Aashay");
		nameList.add("Prashant");
		nameList.add("Aashay");
		nameList.add("Aashay");
		nameList.add("Anubhav");
		String str="Aashay";
		System.out.println("Count of word "+str+" in given Array list is "+countOfSameInput(nameList,str));
	}
}
