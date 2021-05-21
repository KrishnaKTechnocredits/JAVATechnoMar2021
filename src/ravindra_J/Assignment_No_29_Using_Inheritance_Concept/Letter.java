package ravindra_J.Assignment_No_29_Using_Inheritance_Concept;

public class Letter {
	public String getLetter(String str) {
		String upper="",lower="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {

				if (Character.isUpperCase(ch)) {
					upper = upper +  ch;
				}
				else {
					lower = lower + ch;
				}		
			}
		}	
		return upper+lower;
	}
}

