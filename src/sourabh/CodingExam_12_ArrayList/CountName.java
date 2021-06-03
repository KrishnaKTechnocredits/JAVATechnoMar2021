/*
2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
 */

package sourabh.CodingExam_12_ArrayList;

import java.util.ArrayList;

public class CountName {
	static int count=0;
	 int getcountName(ArrayList<String> nameList, String targetName) {
		
		while(nameList.contains(targetName)) {
			count++;
			nameList.set(nameList.indexOf(targetName), "Technocredits");

		}
		return count;	
	 }
	 public static void main(String[] args) {
		 ArrayList<String> nameList= new ArrayList<String>();
		 nameList.add("Vaibhav");
		 nameList.add("Aashay");
		 nameList.add("Prashant");
		 nameList.add("Aashay");
		 nameList.add("Aashay");
		 nameList.add("Anubhav");
		 
		 CountName countName= new CountName();
		 int outputCount= countName.getcountName(nameList, "Aashay");
		 System.out.println(outputCount);
		 System.out.println(nameList);
	 }

}
