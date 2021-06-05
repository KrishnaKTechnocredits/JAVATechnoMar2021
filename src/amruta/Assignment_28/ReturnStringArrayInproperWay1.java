package amruta.Assignment_28;

public class ReturnStringArrayInproperWay1 {
	
String[] printStringProperly(String[] arr) {
	
	int len = arr.length;
	
	
	String[] output = new String[len];
	
	for(int index =0; index< len; index++) {
		
		String digit = "";
		String upper = "";
		String lower = "";
		String specialcharacter = "";
				
		for(int innerindex=0; innerindex< arr[index].length();innerindex++) {
			
			char ch = arr[index].charAt(innerindex);
			
			if(Character.isDigit(ch)) {
				digit = digit + ch;

			}else if(Character.isUpperCase(ch)) {
				upper = upper + ch;
		
			}else if (Character.isLowerCase(ch)){
				lower += ch;
			}else
				specialcharacter += ch;
							
		}
		output[index] = digit+upper+lower+specialcharacter;
	}

	return output;
		
	}
	
	
	public static void main(String[] args) {
		String[] msg = {"Te1Ch2noCr4e_%$d8iTs9","sfh4654$&*ekTfD23", "aaR34%$&5TI"};
		
		String[] string = new ReturnStringArrayInproperWay1().printStringProperly(msg);
		
		System.out.println("String In proper way from array : \n");
		
		for(int index=0; index<string.length;index++) {
			System.out.println(string[index]);
		}
	}

}
