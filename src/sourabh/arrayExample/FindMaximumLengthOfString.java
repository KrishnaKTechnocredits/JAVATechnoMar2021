/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/

package sourabh.arrayExample;

public class FindMaximumLengthOfString {
	String getMaximumLengthOfString(String[] str) {
		int maxLength=str[0].length();
		String maxName=str[0];
		for(int index=1; index<str.length;index++) {
			if(maxLength<str[index].length()){
				maxLength= str[index].length();
				maxName= str[index];
			}
		}
		//System.out.println("Max Length: "+maxLength);
		//System.out.println("Max Name: "+maxName);
		return maxName;
	}
	public static void main(String[] args) {
		FindMaximumLengthOfString findMaximumLengthOfString= new FindMaximumLengthOfString();
		String[] str= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		String maxName=findMaximumLengthOfString.getMaximumLengthOfString(str);
		System.out.println("Max Name: "+maxName); 
	}
}
