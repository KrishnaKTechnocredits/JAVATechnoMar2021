package monika.Practise1;
import java.lang.String;
/*
 * input: 123Monika25Gagan145
 * output: 123+25+145
 * 
 */
public class ReturnString_Exam3{
	public int getSumOfNum(String input) { 
		String s = "";
		String temp = "";
		int sum =0;
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				s += input.charAt(index);
			else if(!s.isEmpty()) {
				temp =s;
				sum += Integer.parseInt(temp);
				s = "";
			}
		}if(!s.equals("")) {
			sum += Integer.parseInt(s);
		}
		return sum;
	}
	
	void m1() {
		String s1 = "";
		String s2 = null;
		String s3 = " ";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		//System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s2));
	}
	
	void m2() {
		String s1 = "MONIKA";
		String s2 = "monika";
		String s3 = "123";
		String s4 = "12";
		System.out.println("\n"+s1.equalsIgnoreCase(s2));
		System.out.println("\n"+s3.equalsIgnoreCase(s4));
	}
	void prefixSuffix() {
		String s1 = "http";
		String s2 = "https";
		if(s1.startsWith(s2) || s2.endsWith("es") )
			System.out.println("-------Yes");
		else
			System.out.println("=======No");	
	}
	
	void indexOf(){
		String s1 = "techno";
		String s2 = new String("Hi");
		System.out.println("***"+s2.length());
		
		
		int i = 10;
		Integer j = 10;
		
		for(int index=0;index<s1.length();index++) {
			if(s1.indexOf(s1.charAt(index)) == s1.lastIndexOf(s1.charAt(index))){
				System.out.println(s1.charAt(index));
			}
		}
		Manager m = null;
		//m.m1();
		m4(m);
	}
	
	void m4(Manager m) {
		StringBuffer sb = new StringBuffer("Hi");
		for(int index=0;index<3;index++) {
			System.out.println(sb.append(index));
		}
		System.out.println(sb);
		
		
		String str = "naman";
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(str);
		sb2.reverse();
		System.out.println(sb1.equals(sb2));
	}
	
	void m5() {
		String s1 = "hi hello hey hi technocredits credits hey hanji";
		System.out.println(s1.replace("credits", "*"));
		System.out.println(s1.replaceAll("Gagan", ""));
		
	}
	public static void main(String[] args) {
		ReturnString_Exam3 obj = new ReturnString_Exam3();
		obj.m5();
		
		int sum = obj.getSumOfNum("123Monika25Gagan145");
		System.out.println(sum);
		obj.m1();
		obj.m2();
		obj.prefixSuffix();
		obj.indexOf();
		String name ="";
		String s1 = "MonikaM";
		System.out.println(s1.indexOf('M'));
		System.out.println(s1.lastIndexOf('M'));
		//obj.m4();
		
		}
}