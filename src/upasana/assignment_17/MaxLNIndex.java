/*

Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */

package upasana.assignment_17;

public class MaxLNIndex {
	
	int maxLNIndex() {
		String[] str = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		String nameML=str[0];
		int index1=0;
		for(int index=1;index<str.length;index++) {
			if(nameML.length()<str[index].length()) {
				nameML=str[index];
				index1=index;
			}
		}
		return index1;
		
	}
	public static void main(String[] args) {
		int index = new MaxLNIndex().maxLNIndex();
		System.out.println(index);
	}

}
