package shivani.Assignment_17;
/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class MaxLengthString {
	
	void maxLenthString(String [] words) {
		int maxlength = words[0].length();
		String maxl= words[0];
		for (int index = 0; index < words.length; index++) {
				if (words[index].length()> maxlength) {
					maxlength=words[index].length();
					maxl=words[index];
				}
				}
		System.out.println("max name length :"+maxl);
			}
	public static void main(String[] args) {
		MaxLengthString maxLengthString =new MaxLengthString();
		String [] names= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		maxLengthString.maxLenthString(names);
		
		
		}
		
	}
	

