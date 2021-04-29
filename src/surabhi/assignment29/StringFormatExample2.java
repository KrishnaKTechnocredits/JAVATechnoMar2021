package surabhi.assignment29;

public class StringFormatExample2 {
	String processStringFormat(String str) {
		String capitalCase="", smallCase="", temp="";
		int sumOdd=0, sumEven=0; int num=0;
		char ch=' ';
		for(int index=0;index<str.length();index++) {
			ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
			}else if(!Character.isDigit(ch)) {
				if(!temp.equals("")) {
					num=Integer.parseInt(temp);
					if(num%2==0) {
						sumEven=sumEven+num;
					}else {
						sumOdd=sumOdd+num;
					}
				temp="";
				}
				if(Character.isUpperCase(ch)) {
					capitalCase=capitalCase+ch;
				}else if(Character.isLowerCase(ch)) {
					smallCase=smallCase+ch;
				}
			}
		}
			if(!temp.equals("")) {
				num=Integer.parseInt(temp);
				if(num%2==0) {
					sumEven=sumEven+num;
				}else {
					sumOdd=sumOdd+num;
				}
			}	
		return (sumOdd+capitalCase+smallCase+sumEven);
	}

	public static void main(String[] args) {
		StringFormatExample2 stringFormatExample2=new StringFormatExample2();
		String str=stringFormatExample2.processStringFormat("F12TT45ERT5cc56de111");
		System.out.println(str);

	}

}
