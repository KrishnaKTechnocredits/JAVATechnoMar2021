package monali.Assignment_20;

public class countCharacter {
	
	int digitC;
	int letterC;
	int upperCaseC;
	int lowerCaseC;
	int splCharC;
	
	void digitCount(String str){
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
			digitC++;
		}
		System.out.println("total digits are "+digitC);
	}
	void letterCount(String str){
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
           if(ch >=65 && ch <=90 || ch >=97 && ch <=122)
        	   letterC++;
		}
		System.out.println("total letters are "+letterC);
	}
	
	void upperCaseCount(String str){
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
           if(ch >=65 && ch <=90)
        	   upperCaseC++;
		}
		System.out.println("total upperCaseCount are "+upperCaseC);
	}
	void lowerCaseCount(String str){
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
           if(ch >=97 && ch <=122)
        	   letterC--;
		}
		System.out.println("total LowerCaseCount are "+letterC);
	}
	void specialCharCount(String str){
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
           if(ch >=32 && ch <=47)
        	   splCharC++;
		}
		System.out.println("total special char are "+splCharC);
	}
	public static void main(String[] a) {
		countCharacter CountCharacter = new countCharacter();
		String str = "TeChNoCrEdItS";
		CountCharacter.digitCount(str);
		CountCharacter.letterCount(str);
		CountCharacter.upperCaseCount(str);
		CountCharacter.lowerCaseCount(str);
		CountCharacter.specialCharCount(str);

	}
}
