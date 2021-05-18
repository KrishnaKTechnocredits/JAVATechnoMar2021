//Write the program to generate output in below format.
// sum of all odd numbers + capital letter + small letter + sum of all even numbers

package krati_Shukla.Assignment29;

public class SumOddEvenCapitalSmall {

	void Sum(String input) {
		int length = input.length();
		String num = "";
		String capital = "";
		String small ="";
		int sumEven = 0;
		int sumOdd = 0;
		
		for (int index = 0; index < length; index++) { 
			char ch = input.charAt(index);
					
			if (Character.isUpperCase(ch))
				capital = capital + ch; 
			else if (Character.isLowerCase(ch))
				small = small +ch;
			
			
			if (Character.isDigit(ch)) 
				num = num + ch;
			
			if (index != (length-1)) {
				char ch1 = input.charAt(index+1); 
				if (Character.isDigit(ch) && (Character.isLetter(ch1))) {
					if (Integer.parseInt(num) % 2 == 0) {
						sumEven = sumEven + Integer.parseInt(num);
						num = "";
					}else
						sumOdd = sumOdd + Integer.parseInt(num);
						num="";
				}
			}
		}
		
		if (num != ""){
			if (Integer.parseInt(num) % 2 == 0)
				sumEven = sumEven + Integer.parseInt(num);
			else
				sumOdd = sumOdd + Integer.parseInt(num);
		}
		System.out.println("Capital :" +capital);
		System.out.println("Small :" +small);
		System.out.println("Even :" +sumEven);
		System.out.println("Odd :" +sumOdd);
		System.out.println("Final Output string : " +sumOdd+capital+small+sumEven);
	}

	public static void main(String[] a) {
		SumOddEvenCapitalSmall sumOddEvenCapitalSmall = new SumOddEvenCapitalSmall();
		String str = "12FTT45ERT5cc56de111";
		sumOddEvenCapitalSmall.Sum(str);
	}

}
