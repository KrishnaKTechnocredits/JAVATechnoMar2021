package amruta.Assignment_28;

public class ReturnStringArrayInproperWay {
	
	String printStringProperly(String str) {
		
		String digit = "";
		String upper = "";
		String lower = "";
		String specialcharacter = "";
		
		for(int index=0; index< str.length();index++) {
			
			char ch = str.charAt(index);
			
			if(Character.isDigit(ch)) {
				digit = digit + ch;

			}else if(Character.isUpperCase(ch)) {
				upper = upper + ch;
		
			}else if (Character.isLowerCase(ch)){
				lower += ch;
			}else
				specialcharacter += ch;
							
		}
		
		return digit+upper+lower+specialcharacter;
		
	}
	
	String[] takearrayofstring(String[] arr) {
		
		int len = arr.length;
		
		String[] output = new String[len];
		
		for(int index=0;index<arr.length;index++) {
			
			 output[index] = printStringProperly(arr[index]);
		}
		
		return output;
	}
	
	
	public static void main(String[] args) {
		String[] msg = {"Te1Ch2noCr4e_%$d8iTs9","sfh4654$&*ekTfD23", "aaR34%$&5TI"};
		
		String[] string = new ReturnStringArrayInproperWay().takearrayofstring(msg);
		
		System.out.println("String In proper way from array : \n");
		
		for(int index=0; index<string.length;index++) {
			System.out.println(string[index]);
		}
	}

}
