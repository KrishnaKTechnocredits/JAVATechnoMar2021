/*
 * 
Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */
package purva.Array.Assignment_17;

public class ReturnMaximumLengthIndex {

	int maxLengthIndex(String[] name) {
		int maxIndex=0;
		for(int index=0;index<name.length;index++) {
			if(name[maxIndex].length()<name[index].length())
				maxIndex =index;
		}
		System.out.println("The index having maximum length from given string array is "+maxIndex);
		return maxIndex;
	}
	
	public static void main(String[] args) {
		String[] name={"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new ReturnMaximumLengthIndex().maxLengthIndex(name);
	}
}
