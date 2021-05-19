package surabhi.coding_exam10;

/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/

public class UniqueCharacterFromString {

	char getUniqueChar(String str) {
		char ch=str.charAt(0); 
		boolean isUnique=true;
		for(int index=1;index<str.length();index++) {
			if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
				isUnique=false;
				ch=str.charAt(index);
			}else
				isUnique=true;
		}
		if(isUnique) {
			return ch;
		}
		else {
			return ' ';
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacterFromString uniqueCharacterFromString=new UniqueCharacterFromString();
		String str="abcgbca";
		char ch=uniqueCharacterFromString.getUniqueChar(str.toLowerCase());
		System.out.println(ch);

	}

}
