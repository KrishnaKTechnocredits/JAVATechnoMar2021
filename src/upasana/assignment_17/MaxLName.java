/*
Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
 */

package upasana.assignment_17;

public class MaxLName {
	
	String maxLN() {
		String[] str = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		String nameML=str[0];
		for(int index=1;index<str.length;index++) {
			if(nameML.length()<str[index].length()) {
				nameML=str[index];
			}
		}
		return nameML;
		
	}
	public static void main(String[] args) {
		String name=new MaxLName().maxLN();
		System.out.println(name);
	}

}
