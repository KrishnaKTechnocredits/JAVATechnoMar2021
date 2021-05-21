package surabhi.coding_exam_3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

		 input :  globant india test automation engineer

		 output :  glbnt nd tst tmtn ngnr*/

public class CosonentString {
	
	String displayString(String str) { 
		String temp=""; 
		char ch=' ';
		str=str.toLowerCase();
		for(int index=0;index<str.length();index++) { 
			ch=str.charAt(index);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u')){ 
				temp=temp+str.charAt(index);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		CosonentString cosonentString=new CosonentString(); 
		String str=cosonentString.displayString("globant india test automation engineer");
		System.out.println(str);
	}

}
