package meenu.coding_exam_21;
/*Test - 21 : 4th Jun'2021
String 
str1="This is the thread that given"
String 
str2="th"
Expected Output : hTis is hte htread htat given
*/

public class ReverseString {
	
	static String reverseString(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb=sb.reverse();
		return sb.toString();
	}
	
	static String getModifiedString(String str,String word){
		str=str.toLowerCase();
		if(str.contains(word))		
			str=str.replace(word, reverseString(word));
		return str;
	}
	
	public static void main(String[] args) {
		String str = "This is the thread that given";		
		String word = "th";
		System.out.println(getModifiedString(str,word));
	}
}

