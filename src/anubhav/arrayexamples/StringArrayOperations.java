package anubhav.arrayexamples;

public class StringArrayOperations {

/*Program 8:  return the name having maximum length.
		input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		output : Technocredits*/
	
	void biggestStringInArray (String[] arrayElement) {
		System.out.println("----Biggest string in the array----");
		String biggestString= arrayElement[0];
		for (int index=1; index<arrayElement.length; index++) {
				if (biggestString.length() < arrayElement[index].length()) 
					biggestString=arrayElement[index];		
		}
		System.out.println("String element with maximum length :" + biggestString);
	}
	
/*Program 9:  return the index having maximum length from given string array.
			input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
			output : 2	*/
	
	void indexOfBiggestString (String[] arrayElement){
		System.out.println("----Index of biggest string element in the array----");
		String biggestString= arrayElement[0];
		int biggestStringIndex=0;
		for (int index=1; index<arrayElement.length; index++) {
				if (biggestString.length()< arrayElement[index].length()) {
					biggestStringIndex= index;
				    biggestString=arrayElement[index];
				}
		}
		System.out.println("Index of biggest string element in array is : " + biggestStringIndex);
	}
	
	public static void main(String[] args) {
		StringArrayOperations stringArrayOperations= new StringArrayOperations();
		String nameArray[]= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harshvwe"};
		stringArrayOperations.biggestStringInArray(nameArray);
		stringArrayOperations.indexOfBiggestString(nameArray);
	}
}
