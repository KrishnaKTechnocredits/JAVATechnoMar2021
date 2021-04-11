/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/
package ravindra_J.Assignment_No_17_Array_Operations;

public class StringIndexWithMaxLength {
	
	String [] str = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
	
	int findMaxLengthIndex() {
		int maxLengthIndex=0;
	int maxNameLength = str[0].length();
	for(int i=1;i<str.length ;i++) {
		if(maxNameLength<str[i].length())
			maxNameLength = str[i].length();
		maxLengthIndex = i;
	}
	return maxLengthIndex;
	}
}
