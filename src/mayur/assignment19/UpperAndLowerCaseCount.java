package mayur.assignment19;

public class UpperAndLowerCaseCount {
	String upperLowerCaseCount(  String str) {
		int upperCnt = 0;
		int lowerCnt = 0;
		for(int index = 0;index<str.length();index++){
			if(Character.isUpperCase(str.charAt(index)))
				upperCnt++;
			else
				lowerCnt++;
		}
		
		if(upperCnt>lowerCnt) {
			System.out.println("Techno");
			return "Techno";
		}
		else
			System.out.println("Credits");
			return "Credits";
	}
		public static void main(String[] args) {
			UpperAndLowerCaseCount upperLower = new UpperAndLowerCaseCount();
			upperLower.upperLowerCaseCount("TeCHnoSessionS");
		}
		
		
	}

