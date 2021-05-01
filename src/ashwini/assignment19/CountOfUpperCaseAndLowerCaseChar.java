package ashwini.assignment19;

public class CountOfUpperCaseAndLowerCaseChar {
	String countUpperLowerCase(String str) {
		int counter1 = 0;
		int counter2 =0;
		
	    for(int i=0; i<str.length(); i++) {
	        if(Character.isUpperCase(str.charAt(i))) {
	            counter1++;
	        } 
	        else if(Character.isLowerCase(str.charAt(i))) {
	            counter2++;
	         }
	    }
	        if(counter1>counter2) {
	        	return "Techno";
	        }
	        else return "Credits";
	      
	}

	public static void main(String[] args) {
		CountOfUpperCaseAndLowerCaseChar countCase= new CountOfUpperCaseAndLowerCaseChar();
		//countCase.countUpperLowerCase("TeCHnoSessionS");
		String str = "TeCHnoSessionS";
		System.out.println(countCase.countUpperLowerCase(str));
		//System.out.println("Maximum value in the array is::"+array.max(myArray));
	}

}
