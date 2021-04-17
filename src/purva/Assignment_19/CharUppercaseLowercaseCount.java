package purva.Assignment_19;

public class CharUppercaseLowercaseCount {
 
	void charCount(String input) {
		int upperCaseCount = 0,lowerCaseCount =0;
		
	    for(int index = 0;index<input.length();index++) {
	    	if(Character.isUpperCase(input.charAt(index)))
	    		upperCaseCount++;
	    	else
	    		lowerCaseCount++;
	    	}
	    
	    if(upperCaseCount>lowerCaseCount)
	    	System.out.println("Techno");
	    
	    else
	    	System.out.println("credits");
	    		
	}
	
	public static void main(String[] args) {
		CharUppercaseLowercaseCount charUpperCaseLowerCaseCount = new CharUppercaseLowercaseCount();
		charUpperCaseLowerCaseCount.charCount("TeCHnoSessionS");
	}
}
