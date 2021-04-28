package trupti.String.Assignment29;

public class StringOperation {
	
	String getString(String str) {
		int sumOdd=0,sumEven=0;
		char c;
		String upperCase="",lowerCase="";
		String tempStr="";
		int tempInt;
		for (int index=0;index<str.length();index++) {
			c=str.charAt(index);
			if(Character.isDigit(c)) {
				tempStr+=c;
				if(index==str.length()-1) {
					tempInt = Integer.parseInt(tempStr);
					if(tempInt%2 == 0) {
						sumEven=sumEven+tempInt;
						tempStr="";
					}
					else {
						sumOdd=sumOdd+tempInt;
						tempStr="";
					}
				}
			}
			else {
				if(tempStr!="") {
					tempInt = Integer.parseInt(tempStr);
					if(tempInt%2 == 0) {
						sumEven=sumEven+tempInt;
						tempStr="";
					}
					else {
						sumOdd=sumOdd+tempInt;
						tempStr="";
					}
				}
			}

			if(Character.isUpperCase(c))
				upperCase+=c;
			else if(Character.isLowerCase(c))
				lowerCase+=c;
		}
		return String.valueOf(sumOdd) + upperCase+ lowerCase+ String.valueOf(sumEven);
	}

	public static void main(String[] args) {
		StringOperation stringoperation=new StringOperation();
		String output=stringoperation.getString("F12TT45ERT5cc56de111");
		System.out.println("Output :"+output);

	}

}
