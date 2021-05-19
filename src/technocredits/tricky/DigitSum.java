package technocredits.tricky;
public class DigitSum {

	void Sum(String input) {
		String temp = "";
		int sum = 0;
		
		for (int index = 0; index < input.length(); index++) { 
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;  
			} else { 
				if(!temp.equals(""))
					sum = sum + Integer.parseInt(temp); // "123"
				temp =""; 
			}			
		}
		if(!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		System.out.println("Sum :"+sum);

	}

	public static void main(String[] a) {

		DigitSum digitSum = new DigitSum();
		String str = "123h14i4w8sdc15";
		digitSum.Sum(str);
	}
}
