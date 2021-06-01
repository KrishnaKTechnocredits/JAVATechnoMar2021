/*
 * Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.

 */
package rupali.assignment24;

public class Stringoperation {
	
	char[] getmidchar(String[] s) {
		char[] ch=new char[s.length];
		String str;
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length();j++) {
				str=s[i];
				if(str.length()%2==0) {
						ch[i]=str.charAt((str.length()/2-1));
				}
				else {
					if(j==(str.length()/2))
						ch[i]=str.charAt(j);
				}
			}
		}
		return ch;
	}
			
	public static void main(String[] args) {
		Stringoperation stringoperation=new Stringoperation();
		String[] arr= {"Techno","Hello","Credits"};
		char ch[]=new char[arr.length];
			ch=stringoperation.getmidchar(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.println("The middle character of "+arr[i]+" is "+ch[i]);
			}
		}

}
