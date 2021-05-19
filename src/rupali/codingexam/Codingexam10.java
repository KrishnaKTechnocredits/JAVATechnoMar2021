/*Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
*/

package rupali.codingexam;

public class Codingexam10 {
	char getfirstnonrepeatingchar(String input){
		boolean flag=true;
		char ch=' ';
		for(int index=0;index<input.length();index++){
			flag=true;
			for(int innerindex=index+1;innerindex<input.length();innerindex++){
				if(input.charAt(index)==input.charAt(innerindex))
					flag=false;
			}
			if(flag==true){
				ch=input.charAt(index);
				break;
			}
		}
		return ch;
	}
	public static void main(String[] args){
	String input="abcgbca";
	Codingexam10 codingexam10=new Codingexam10();
	char output=codingexam10.getfirstnonrepeatingchar(input);
	System.out.println(output);
	}

}
