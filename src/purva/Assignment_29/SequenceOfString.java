package purva.Assignment_29;

public class SequenceOfString {
	
   String sequenceOfString(String input) {
	   
		int sumOdd = 0;
		int sumEven = 0;
		String upperCase="";
		String lowerCase = "";
		String num ="";
		
		for(int index=0;index <input.length();index++) {
			
			char ch = input.charAt(index);
			
			if(Character.isUpperCase(ch))
				upperCase = upperCase + ch;
			
			if (Character.isLowerCase(ch)) 
				lowerCase = lowerCase + ch;	
		
			
			if(Character.isDigit(ch)) {
				num = num+ch;
				 
				if(index != input.length()-1){
					char ch1 = input.charAt(index+1);
					if(Character.isDigit(ch)&&Character.isLetter(ch1)) {
						if(Integer.parseInt(num) % 2 == 0) {
							sumEven = sumEven +Integer.parseInt(num);
					//evenNumber = evenNumber+sumEven;
							num="";
				    }else
					   sumOdd =sumOdd +Integer.parseInt(num);
					//oddNumber = oddNumber+sumOdd;
					   num ="";
				    
				}	
			}
	    }
	}
	if(num != "") {
		if(Integer.parseInt(num) % 2 == 0) 
	        sumEven = sumEven +Integer.parseInt(num);
		else
		    sumOdd = sumOdd +Integer.parseInt(num);
			
	    }	
		return sumOdd+upperCase+lowerCase+sumEven;
		
   }

	public static void main(String[] args) {
		SequenceOfString sequence = new SequenceOfString();
		String output=sequence.sequenceOfString("F12TT45ERT5cc56de111");
		System.out.println(output);
	}

}
