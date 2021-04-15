package technocredits.arrayDemo;

public class Example8 {

	void indexOfBiggestString (String[] arrayElement){
		System.out.println("----Index of biggest string element in the array----");
		String biggestString= arrayElement[0];
		int biggestStringIndex=0;
		for (int index=1; index<arrayElement.length; index++) {
				if (biggestString.length()< arrayElement[index].length()) {
					biggestStringIndex= index;
					biggestString = arrayElement[index];
				}
		}
		System.out.println("Index of biggest string element in array is : " + biggestStringIndex);
	}
	
	public static void main(String[] args) {
		Example8 stringArrayOperations= new Example8();
		String nameArray[]= {"Maulik", "Krishna", "Technocredits", "Kangan", "HarshVe"};
		//stringArrayOperations.biggestStringInArray(nameArray);
		stringArrayOperations.indexOfBiggestString(nameArray);
	}

}
