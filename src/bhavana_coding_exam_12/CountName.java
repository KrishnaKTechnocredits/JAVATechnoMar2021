package bhavana_coding_exam_12;

import java.util.ArrayList;

/*int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set */
public class CountName {
	
	int countName(ArrayList<String> name,String targetName) {
		String inputName="Technoncredits";
		int count=0;
		while(name.contains(targetName)) {
			name.set(name.indexOf(targetName),inputName);
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		CountName cn=new CountName();
		ArrayList<String> name=new ArrayList<>();
		name.add("Vaibhav");
		name.add("Aashay");
		name.add("Prashant");
		name.add("Aashay");
		name.add("Aashay");
		name.add("Anubhav");
		int count=cn.countName(name, "Aashay");
		System.out.println("The count of name is:"+count);
		System.out.println(name);
}		
	
}
