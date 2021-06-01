package technocredits.StringDemo;

public class Example2 {

	public static void main(String[] args) {
		char ch = 53;
		//System.out.println(ch); // a
		
		int temp = '.';
		//System.out.println(temp);
		
		char temp1 = 'A';
		temp1++;
		
		System.out.println("------------" + temp1);
		
		if('A' < 'B')
			System.out.println("Hi");
		else
			System.out.println("Hello");
			
		for(int num = 65 ; num <=96 ; num++) {
			char ch1 = (char)num;
			System.out.println(ch1);
		}
	}
}
