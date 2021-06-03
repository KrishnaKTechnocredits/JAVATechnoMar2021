package trupti.CodingExam12;

import java.util.ArrayList;

/*input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set*/

public class NameOccurence {
	static int counter=0;
	ArrayList<String> getNameOccurence (ArrayList<String>names,String targetName){
		
		while (names.contains("Aashay")) {

			int arrIndex=names.indexOf("Aashay");
			names.set(arrIndex, "Technocredits");
			counter++;

		}return names;
	} 
	public static void main(String[] args) {
		ArrayList<String> inputNames=new ArrayList<String>();
		inputNames.add("Vaibhav");
		inputNames.add("Aashay");
		inputNames.add("Prashant");
		inputNames.add("Aashay");
		inputNames.add("Aashay");
		inputNames.add("Anubhav");
		NameOccurence nameoccurence= new NameOccurence();
		ArrayList<String> answer=nameoccurence.getNameOccurence(inputNames,"Aashay");
		System.out.println(answer);
		System.out.println(NameOccurence.counter);
	}
}
