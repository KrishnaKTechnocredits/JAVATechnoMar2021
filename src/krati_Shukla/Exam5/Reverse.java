package krati_Shukla.Exam5;


public class Reverse {
	
	String WithoutArrayReverse(String str) {
		int index;
		String temp="";
		String newTemp = "";
	
		int length = str.length();
		for(index=0; index<length; index++) {
			char ch = str.charAt(index);
			if(ch != ' ') {
				temp = temp + ch;
			}
			else {
					StringBuffer output = new StringBuffer(temp);
					output.reverse();
					newTemp = newTemp + output+ ' ';
					temp="";
				}
		}
		
		if (index == length && temp != ""){
			StringBuffer output = new StringBuffer(temp);
			output.reverse();
			newTemp = newTemp + output+ ' ';
			temp="";
		}
		return (newTemp.trim());
		
	}
	
	public static void main(String[] a) {
		Reverse reverse = new Reverse();
		String input = "Hi hello techno";
		System.out.println (reverse.WithoutArrayReverse(input));
	}

}
