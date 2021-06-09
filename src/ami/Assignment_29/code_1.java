package ami.Assignment_29;

public class code_1 {

	void sequenceofOutput(String str) {
		String lowerCharList = "" , upperCharList = "";
		int sumEven = 0 , sumOdd = 0 ;
		for(int index = 0 ; index < str.length() ; index++) {
			if (Character.isLowerCase(str.charAt(index))) {
				lowerCharList = lowerCharList +str.charAt(index);
			}
			if (Character.isUpperCase(str.charAt(index))) {
				upperCharList = upperCharList + str.charAt(index);
			}
			if(Character.isDigit(str.charAt(index))) {
				int startIndex = index;
				while(index < str.length()-1 && Character.isDigit(str.charAt(index+1))){
					index = index + 1;
				}
				String strValue = str.substring(startIndex, index + 1);
				int digitValue = Integer.valueOf(strValue);
				System.out.println(digitValue);
				if(digitValue % 2 == 0) {
					sumEven = sumEven + digitValue;
				}else {
					sumOdd = sumOdd + digitValue;
				}
			}
			
		}System.out.println(sumOdd +lowerCharList + upperCharList + sumEven);
		
	}
	
	
	public static void main(String[] args) {
		code_1 sumSequencePriningFromString = new code_1();
		sumSequencePriningFromString.sequenceofOutput("122its13fun14to15learn16JAVA17FROM18TECHNOCREDITS19");
	}

}
