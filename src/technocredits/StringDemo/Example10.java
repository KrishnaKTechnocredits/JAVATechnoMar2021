package technocredits.StringDemo;

public class Example10 {

	public static void main(String[] args) {
		String name = "Technocredits";
		name = name.toLowerCase(); // technocredits
		name = name.substring(3); // hnocredits
		name = name.toUpperCase(); // HNOCREDITS
		System.out.println(name.charAt(0)); // H
		
		StringBuffer sb = new StringBuffer("Hi");
		for(int index = 1; index<=100;index++) {
			sb.append(index);
			System.out.println(sb);
		}
		
		String name1 = "NAMAN";
		StringBuffer sb1 = new StringBuffer(name1);
		StringBuffer sb2 = sb1.reverse();
		
		if(sb1.equals(sb2))
			System.out.println("Yes it is");
		else
			System.out.println("No it is not");
		
		
		/*for(int index=name1.length()-1;index>=0;index--) {
			name2 += name1.charAt(index);
		}*/
		/*if(name1.equals(name2))
			System.out.println("Yes it is");
		else
			System.out.println("No");*/
	}
}
