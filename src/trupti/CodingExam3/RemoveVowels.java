package trupti.CodingExam3;

public class RemoveVowels {
	
	String removeVowels(String str) {
		String tempStr="";
		str=str.toLowerCase();
		char c;
		
			for(int index=0;index<str.length();index++) {
				c=str.charAt(index);
				if(c!='a') {
				    if(c!='e') {
				    	if(c!='i') {
				    		if(c!='o') {
				    			if(c!='u')
				    				tempStr+=c;
				    		}
				    	}
				    }
				}
			}return tempStr;
	}

	public static void main(String[] args) {
		RemoveVowels removevowels=new RemoveVowels();
		String output=removevowels.removeVowels("globant india test automation engineer");
		System.out.println("Output String is : "+output);

	}

}
