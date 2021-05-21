/*   Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
*/
package sourabh.arrayReturnTypeExamples;

public class FindMiddleCharacterOfString {
	
	char[] getMiddleCharacter(String[] str) {
		char[] outputstr=new char[str.length];		
		for(int index=0; index<str.length;index++) {			
			if(str[index].length()%2==0) {
				int	index1= str[index].length()/2-1;
				outputstr[index]=str[index].charAt(index1);
			}
			else if(str[index].length()%2!=0){
				int index1=str[index].length()/2;
				outputstr[index]=str[index].charAt(index1);
			}
		}		
		return outputstr;
	}
	public static void main(String[] args) {
		FindMiddleCharacterOfString findMiddleCharacter= new FindMiddleCharacterOfString();
		String[] strInput= {"Techno", "Hello", "Credits"};
		char[] strOutput= findMiddleCharacter.getMiddleCharacter(strInput);
		for(int index=0;index<strOutput.length;index++) {
		System.out.println(strOutput[index]);
		}
	}
}
