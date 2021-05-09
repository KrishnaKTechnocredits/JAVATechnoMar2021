package amruta.Test_3;

class RemoveVowels {

	String printString(String string){
	
		String temp = "";
	
		for(int index = 0; index< string.length();index++){
		
		char ch = string.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U'){
				
			}else {
				temp = temp + string.charAt(index);
			}
		}
		return temp;
	}

	public static void main(String[] args){
	
	String str = "globant india test automation engineer";
	String var = new RemoveVowels().printString(str);
	
	System.out.println("Output is :" + var);
	}

}